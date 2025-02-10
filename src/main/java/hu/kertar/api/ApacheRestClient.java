package hu.kertar.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.kertar.api.exception.ApiClientException;
import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class ApacheRestClient implements RestClient {

    private final String apiUrl;
    private final ObjectMapper objectMapper;

    public ApacheRestClient(String apiUrl) {
        this.apiUrl = apiUrl;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public <T> T getRequest(String path, Class<T> responseType) throws ApiClientException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(apiUrl + path);
            httpGet.setHeader("Accept", "application/json");

            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                return handleResponse(response, responseType);
            }
        } catch (IOException e) {
            throw new ApiClientException("Hiba történt a GET kérés végrehajtása során: " + e.getMessage(), e);
        }
    }

    @Override
    public <T, R> T postRequest(String path, R requestBody, Class<T> responseType) throws ApiClientException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(apiUrl + path);
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Accept", "application/json");

            String requestBodyJson = objectMapper.writeValueAsString(requestBody);
            StringEntity requestEntity = new StringEntity(requestBodyJson, ContentType.APPLICATION_JSON);
            httpPost.setEntity(requestEntity);

            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                return handleResponse(response, responseType);
            }
        } catch (IOException e) {
            throw new ApiClientException("Hiba történt a POST kérés végrehajtása során: " + e.getMessage(), e);
        }
    }

    private <T> T handleResponse(CloseableHttpResponse response, Class<T> responseType) throws ApiClientException, IOException {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            String responseBody = EntityUtils.toString(entity);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode >= 200 && statusCode < 300) {
                try {
                    return objectMapper.readValue(responseBody, responseType);
                } catch (IOException e) {
                    throw new ApiClientException("Hiba történt a válasz JSON deszerializálása során: " + e.getMessage() + ", Válasz szövege: " + responseBody, e);
                }
            } else {
                throw new ApiClientException("HTTP hiba történt. Status kód: " + statusCode + ", Válasz: " + responseBody);
            }
        }
        return null; // Ritkán fordulhat elő, de kezeljük le
    }
}

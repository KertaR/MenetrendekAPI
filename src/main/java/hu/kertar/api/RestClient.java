package hu.kertar.api;

import hu.kertar.api.exception.ApiClientException;

public interface RestClient {

    <T> T getRequest(String path, Class<T> responseType) throws ApiClientException;

    <T, R> T postRequest(String path, R requestBody, Class<T> responseType) throws ApiClientException;
}

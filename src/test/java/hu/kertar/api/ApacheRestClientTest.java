package hu.kertar.api;

import hu.kertar.api.getroutes.GetRoutesResponse;
import org.junit.jupiter.api.Test;
import hu.kertar.api.getroutes.GetRoutesRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApacheRestClientTest {

    @Test
    void getRequest() {
        ApacheRestClient apacheRestClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

        GetRoutesRequest request = new GetRoutesRequest();
        request.getParams().setDatum("2025-01-27");
        request.getParams().setHonnan_ls_id(0);
        request.getParams().setHonnan_settlement_id(2049);
        request.getParams().setHour("1");
        request.getParams().setHova_ls_id(0);
        request.getParams().setHova_settlement_id(1357);
        request.getParams().setMin("27");
        request.getParams().setNaptipus(0);
        request.getParams().setPreferencia("0");
        request.getParams().setVar("0");

        GetRoutesResponse response = apacheRestClient.postRequest("", request, GetRoutesResponse.class);
        assertEquals("success", response.getStatus());
    }
}
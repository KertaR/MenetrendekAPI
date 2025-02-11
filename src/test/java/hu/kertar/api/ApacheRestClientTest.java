package hu.kertar.api;

import hu.kertar.api.getroutes.GetRoutesResponse;
import org.junit.jupiter.api.Test;
import hu.kertar.api.getroutes.GetRoutesRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApacheRestClientTest {

    @Test
    void getRequest() {
        ApacheRestClient apacheRestClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

        GetRoutesRequest getRoutesRequest = new GetRoutesRequest();
        getRoutesRequest.getParams().setDatum("2025-02-11");
        getRoutesRequest.getParams().setHonnan("Szob");
        getRoutesRequest.getParams().setHonnan_ls_id(0);
        getRoutesRequest.getParams().setHonnan_settlement_id(2491);
        getRoutesRequest.getParams().setHour("1");
        getRoutesRequest.getParams().setHova("Kerecsend");
        getRoutesRequest.getParams().setHova_ls_id(0);
        getRoutesRequest.getParams().setHova_settlement_id(2807);
        getRoutesRequest.getParams().setMin("27");
        getRoutesRequest.getParams().setNaptipus(0);
        getRoutesRequest.getParams().setPreferencia("0");
        getRoutesRequest.getParams().setVar("0");

        GetRoutesResponse response = apacheRestClient.postRequest("", getRoutesRequest, GetRoutesResponse.class);
        assertEquals("success", response.getStatus());
    }
}
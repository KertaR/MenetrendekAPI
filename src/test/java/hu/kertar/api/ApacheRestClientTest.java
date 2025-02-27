package hu.kertar.api;

import hu.kertar.api.getgeom.GetGeomRequest;
import hu.kertar.api.getgeom.GetGeomResponse;
import hu.kertar.api.getroutes.GetRoutesResponse;
import hu.kertar.api.getroutes.NativeData;
import hu.kertar.api.jaratkifejezestextjson.JaratKifejezesTextJsonRequest;
import hu.kertar.api.jaratkifejezestextjson.JaratKifejezesTextJsonResponse;
import hu.kertar.api.rundescription.RunDescriptionRequest;
import hu.kertar.api.rundescription.RunDescriptionResponse;
import org.junit.jupiter.api.Test;
import hu.kertar.api.getroutes.GetRoutesRequest;

import java.util.List;

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

    @Test
    void jaratKifejezesTextJsonRequest() {

        ApacheRestClient getRoutesClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

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

        GetRoutesResponse getRoutesResponse = getRoutesClient.postRequest("", getRoutesRequest, GetRoutesResponse.class);

        ApacheRestClient jaratKifejezesTextJsonClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

        JaratKifejezesTextJsonRequest jaratKifejezesTextJsonRequest = new JaratKifejezesTextJsonRequest();
        jaratKifejezesTextJsonRequest.setDatum("2025-02-11");
        List<NativeData> nativeData = getRoutesResponse.getResults().getTalalatok().get("1").getNativeData();
        nativeData.removeIf(data -> data.getSequence() != 1);
        jaratKifejezesTextJsonRequest.setNativeData(nativeData);

        JaratKifejezesTextJsonResponse response = jaratKifejezesTextJsonClient.postRequest("", jaratKifejezesTextJsonRequest, JaratKifejezesTextJsonResponse.class);
        assertEquals("success", response.getStatus());
    }

    @Test
    void getGeoRequest() {

        ApacheRestClient getRoutesClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

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

        GetRoutesResponse getRoutesResponse = getRoutesClient.postRequest("", getRoutesRequest, GetRoutesResponse.class);

        ApacheRestClient getGeoClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

        GetGeomRequest getGeomRequest = new GetGeomRequest();
        getGeomRequest.setDatum("2025-02-11");
        List<NativeData> nativeData = getRoutesResponse.getResults().getTalalatok().get("1").getNativeData();
        nativeData.removeIf(data -> data.getSequence() != 1);
        getGeomRequest.setNativeData(nativeData);

        GetGeomResponse response = getGeoClient.postRequest("", getGeomRequest, GetGeomResponse.class);
        assertEquals("success", response.getStatus());
    }

    @Test
    void runDescriptionRequest() {

        ApacheRestClient getRoutesClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

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

        GetRoutesResponse getRoutesResponse = getRoutesClient.postRequest("", getRoutesRequest, GetRoutesResponse.class);

        ApacheRestClient runDescriptionClient = new ApacheRestClient("https://menetrendek.hu/menetrend/newinterface/index.php");

        RunDescriptionRequest runDescriptionRequest = new RunDescriptionRequest();
        runDescriptionRequest.setDatum("2025-02-11");
        List<NativeData> nativeData = getRoutesResponse.getResults().getTalalatok().get("1").getNativeData();
        runDescriptionRequest.setRunId(nativeData.get(0).getRunId());

        RunDescriptionResponse response = runDescriptionClient.postRequest("", runDescriptionRequest, RunDescriptionResponse.class);
        assertEquals("success", response.getStatus());
    }
}
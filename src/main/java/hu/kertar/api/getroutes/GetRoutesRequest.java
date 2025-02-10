package hu.kertar.api.getroutes;

public class GetRoutesRequest {
    private String func = "getRoutes";
    private RequestParams params = new RequestParams();

    public String getFunc() {
        return func;
    }

    public RequestParams getParams() {
        return params;
    }
}

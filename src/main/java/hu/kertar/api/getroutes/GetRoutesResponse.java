package hu.kertar.api.getroutes;

import lombok.Data;

@Data
public class GetRoutesResponse {
    private String status;
    private Results results;
    private NativeResult nativeResults;
    private String errMsg;
}

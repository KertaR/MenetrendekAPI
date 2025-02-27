package hu.kertar.api.getgeom;

import lombok.Data;

@Data
public class GetGeomResponse {
    private String status;
    private Results results;
    private String errMsg;
}

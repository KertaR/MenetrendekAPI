package hu.kertar.api.jaratkifejezestextjson;

import lombok.Data;

import java.util.Map;

@Data
public class JaratKifejezesTextJsonResponse {
    private String status;
    private Map<String, Results> results;
    private String errMsg;
}

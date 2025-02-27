package hu.kertar.api.rundescription;

import lombok.Data;

@Data
public class RunDescriptionResponse {
    private String status;
    private Results results;
    private String errMsg;
}

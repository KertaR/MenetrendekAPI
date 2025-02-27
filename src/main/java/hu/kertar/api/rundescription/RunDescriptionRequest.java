package hu.kertar.api.rundescription;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RunDescriptionRequest {
    private final String query = "runDecriptionC";
    @JsonProperty("run_id")
    private int runId;
    @JsonProperty("domain_type")
    private int domainType;
    @JsonProperty("sls_id")
    private int slsId;
    @JsonProperty("els_id")
    private int elsId;
    private String location;
    private String datum;
}

package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UsedParams {
    private String mode;
    @JsonProperty("SearchStartTime")
    private Integer searchStartTime;
}

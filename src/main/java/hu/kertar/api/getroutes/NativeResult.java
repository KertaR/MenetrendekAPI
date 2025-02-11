package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NativeResult {
    @JsonProperty("Round")
    private int round;
    @JsonProperty("Debug")
    private Debug debug;
    @JsonProperty("SearchStartTime")
    private int searchStartTime;
    @JsonProperty("PassUsage")
    private int passUsage;
    @JsonProperty("Hits")
    private List<Hit> hits;
}

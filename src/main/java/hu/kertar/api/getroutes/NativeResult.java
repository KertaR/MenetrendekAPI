package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NativeResult {
    @JsonProperty("Round")
    public int round;
    @JsonProperty("Debug")
    public Debug debug;
    @JsonProperty("SearchStartTime")
    public int searchStartTime;
    @JsonProperty("PassUsage")
    public int passUsage;
    @JsonProperty("Hits")
    public List<Hit> hits;
}

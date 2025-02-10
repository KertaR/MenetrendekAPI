package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Debug {
    @JsonProperty("Duration")
    private int duration;
}

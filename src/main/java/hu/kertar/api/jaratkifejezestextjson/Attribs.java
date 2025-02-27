package hu.kertar.api.jaratkifejezestextjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Attribs {
    private String description;
    @JsonProperty("icon_id")
    private String iconId;
    private String name;
}

package hu.kertar.api.jaratkifejezestextjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class News {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Url")
    private String url;
}

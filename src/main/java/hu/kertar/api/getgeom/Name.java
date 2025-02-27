package hu.kertar.api.getgeom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    @JsonProperty("ls_id")
    private int lsId;
    private String name;

    public Name(String name) {
        this.name = name;
    }
}

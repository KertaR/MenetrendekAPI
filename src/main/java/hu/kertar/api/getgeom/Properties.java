package hu.kertar.api.getgeom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Properties {
    private List<Name> names;
    @JsonProperty("f_ls_id")
    private int fLsId;
    private int inside;
    @JsonProperty("t_ls_id")
    private int tLsId;
    private String type;
    private String style;
}

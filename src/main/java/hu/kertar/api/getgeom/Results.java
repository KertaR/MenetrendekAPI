package hu.kertar.api.getgeom;

import lombok.Data;

import java.util.List;

@Data
public class Results {
    private List<Feature> features;
    private String type;
}

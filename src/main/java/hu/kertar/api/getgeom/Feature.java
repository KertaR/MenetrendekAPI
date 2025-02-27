package hu.kertar.api.getgeom;

import lombok.Data;

@Data
public class Feature {
    private Geometry geometry;
    private Properties properties;
    private String type;
}

package hu.kertar.api.rundescription;

import lombok.Data;

import java.util.List;

@Data
public class Geom {
    private List<Integer> coordinates;
    private String type;
}

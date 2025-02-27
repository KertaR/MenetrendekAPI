package hu.kertar.api.getgeom;


import lombok.Data;

import java.util.Map;

@Data
public class FieldValue {
    private int runCount;
    private Map<Integer, Map<Integer, String>> runs;
}

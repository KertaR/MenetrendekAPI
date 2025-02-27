package hu.kertar.api.getgeom;

import hu.kertar.api.getroutes.NativeData;
import lombok.Data;

import java.util.List;

@Data
public class GetGeomRequest {
    private String datum;
    private FieldValue fieldValue;
    private List<NativeData> nativeData;
    private final String query = "getGeomC";
}

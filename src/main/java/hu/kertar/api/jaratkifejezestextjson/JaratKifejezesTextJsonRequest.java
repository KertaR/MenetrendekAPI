package hu.kertar.api.jaratkifejezestextjson;

import hu.kertar.api.getroutes.NativeData;
import lombok.Data;

import java.util.List;

@Data
public class JaratKifejezesTextJsonRequest {
    private String datum;
    private FieldValue fieldValue;
    private List<NativeData> nativeData;
    private final String query = "jarat_kifejtes_text_jsonC";
    private int startLsId;
    private String startLsName;
    private int stopLsId;
    private String stopLsName;

}

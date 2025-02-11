package hu.kertar.api.getroutes;

import lombok.Data;

import java.util.Map;

@Data
public class Results {
    private String napkiiras;
    private String date_got;
    private int daytype_got;
    private String apache_hostname;
    private UsedParams used_params;
    private Map<String, Talalat> talalatok;
    private String error;

}

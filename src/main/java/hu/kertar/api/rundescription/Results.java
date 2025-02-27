package hu.kertar.api.rundescription;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Results {
    private int alacsonypadlos;
    private List<Attribs> attribs;
    private String debug;
    private int emeltszintu;
    private int internet;
    private int jaratszam;
    private String jelleg;
    @JsonProperty("kifejtes_sor")
    private Map<String, KifejtesSor> kifejtesSor;
    private String kozlekedik;
    private String kozlekedteti;
    private int mezo;
    private int nagysebessegu;
    private int network;
    private int remark;
    private String status;
    private int terelout;
    private String vonalszam;
    private int wifi;
}

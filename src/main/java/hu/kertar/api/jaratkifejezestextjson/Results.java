package hu.kertar.api.jaratkifejezestextjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Results {
    @JsonProperty("DomainCompanyName")
    private String domainCompanyName;
    @JsonProperty("Headsign")
    private String headsign;
    @JsonProperty("OwnerName")
    private String ownerName;
    private String allomas;
    private String description;
    private String idopont;
    private JaratInfo jaratinfo;
    private String jaratszam;
    private String jarmu;
    private String localCode;
    private String muvelet;
    private int network;
    private News news;
    private int runId;
    private String tarsasag;
    private String vegallomasok;

}

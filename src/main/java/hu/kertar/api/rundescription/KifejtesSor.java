package hu.kertar.api.rundescription;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KifejtesSor {
    @JsonProperty("arrival_estimated")
    private String arrivalEstimated;
    private String bay;
    private String color;
    private String departureCity;
    private String departureStation;
    @JsonProperty("departure_estimated")
    private String departureEstimated;
    private String erkezik;
    @JsonProperty("felszallas_info")
    private String felszallasInfo;
    private Geom geom;
    private String indul;
    @JsonProperty("indulasi_hely_info")
    private String indulasiHelyInfo;
    @JsonProperty("internetes_jegy")
    private String internetesJegy;
    private String km;
    private String megallo;
    @JsonProperty("varhato_erkezik")
    private String varhatoErkezik;
    @JsonProperty("varhato_indul")
    private String varhatoIndul;

}

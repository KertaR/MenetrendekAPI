package hu.kertar.api.getroutes;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class Talalat {
    private String ind_prefix;
    private String indulasi_hely;
    private Boolean ind_kulterulet;
    private String departureCity;
    private String departureStation;
    private int departureLs;
    private String erk_prefix;
    private String erkezesi_hely;
    private Boolean erk_kulterulet;
    private String arrivalCity;
    private String arrivalStation;
    private int arrivalLs;
    private String indulasi_ido;
    private String erkezesi_ido;
    private String atszallasok_szama;
    private String osszido;
    private int indulasi_hely_info;
    private Map<String, JaratInfo> jaratinfok;
    private Map<String, AtszallasInfo> atszallasinfok;
    private List<String> explanations;
    private int totalDistance;
    private int totalFare;
    private int totalFare50;
    private int totalFare90;
    private int totalAdditionalTicketPrice;
    @JsonProperty("eTicketAvailable")
    private int eTicketAvailable;
    private Boolean riskyTransfer;
    private List<NativeData> nativeData;
    private KifejtesPostJson kifejtes_postjson;
    private String ossztav;
    private String talalat_kozlekedik;

}

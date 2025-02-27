package hu.kertar.api.jaratkifejezestextjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class JaratInfo {
    @JsonProperty("CountyPass")
    private String countyPass;
    @JsonProperty("EndSettleName")
    private String endSettleName;
    @JsonProperty("EndStation")
    private int endStation;
    @JsonProperty("EndStationName")
    private String endStationName;
    @JsonProperty("FromBay")
    private String fromBay;
    @JsonProperty("StartSettleName")
    private String startSettleName;
    @JsonProperty("StartStation")
    private int startStation;
    @JsonProperty("StartStationName")
    private String startStationName;
    @JsonProperty("ToBay")
    private String toBay;
    @JsonProperty("additional_ticket_price")
    private int additionalTicketPrice;
    private int alacsonypadlos;
    private List<Attribs> attribs;
    @JsonProperty("bube_accepted")
    private int bubeAccepted;
    private int dcLsId;
    private int emeltszintu;
    private int fare;
    @JsonProperty("fare_50_percent")
    private int fare50Percent;
    @JsonProperty("fare_90_percent")
    private int fare90Percent;
    private int internet;
    private String jelleg;
    private String kozlekedik;
    private int nagysebessegu;
    @JsonProperty("no_discountable_fare")
    private int noDiscountableFare;
    private int prebuy;
    private String remark;
    @JsonProperty("seat_ticket_price")
    private int seatTicketPrice;
    private int terelout;
    @JsonProperty("train_cat")
    private String trainCat;
    private int travelTime;
    @JsonProperty("utazasi_tavolsag")
    private int utazasiTavolsag;
    private int wifi;



}

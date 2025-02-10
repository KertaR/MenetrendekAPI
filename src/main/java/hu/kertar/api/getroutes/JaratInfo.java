package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JaratInfo {
    private int prebuy;
    private int alacsonypadlos;
    private int network;
    private int nagysebessegu;
    private String jelleg;
    private int emeltszintu;
    private String vonalnev;
    private int wifi;
    private int internet;
    private int internetes_jegy;
    private int terelout;
    private String vonalelnevezes;
    private String remark;
    private News news;
    @JsonProperty("CountyPass")
    private String countyPass;
    private int distance;
    private int fare;
    private int no_discountable_fare;
    private int additional_ticket_price;
    private int seat_ticket_price;
    private String train_cat;
    private int fare_50_percent;
    private int fare_90_percent;
    private int dcLsId;
    private Boolean bube_accepted;
}

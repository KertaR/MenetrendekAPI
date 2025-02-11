package hu.kertar.api.getroutes;

import lombok.Data;

import java.util.List;

@Data
public class ChargeInfo {
    private List<Part> parts;
    private List<String> facilities;
    private String common_zone;
    private Object productCategory;
}

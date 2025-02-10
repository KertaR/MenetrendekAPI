package hu.kertar.api.getroutes;

import lombok.Data;

import java.util.List;

@Data
public class ChargeInfo {
    public List<Part> parts;
    public List<String> facilities;
    public String common_zone;
    public Object productCategory;
}

package hu.kertar.api.getroutes;

import lombok.Data;
import java.util.Map;

@Data
public class KifejtesPostJson {
    private int runcount;
    private Map<Integer, Map<Integer, String>> runs;
}

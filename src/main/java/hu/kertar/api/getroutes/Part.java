package hu.kertar.api.getroutes;

import lombok.Data;

import java.util.List;

@Data
public class Part
{
    private int order;
    private String purposeOfJourneyPartition;
    private int fromStopPoint;
    private int toStopPoint;
    private int distanceInMeter;
    private String fareClass;
    private List<Object> facilities;
    private List<Object> zones;
}

package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NativeData {
    @JsonProperty("Count")
    private int count;
    @JsonProperty("Sequence")
    private int sequence;
    @JsonProperty("DepartureStation")
    private int departureStation;
    @JsonProperty("DepartureTime")
    private int departureTime;
    @JsonProperty("DepStationName")
    private String depStationName;
    @JsonProperty("DepartureSettle")
    private int departureSettle;
    @JsonProperty("FromSettle")
    private String fromSettle;
    @JsonProperty("ArrivalSettle")
    private int arrivalSettle;
    @JsonProperty("ArrivalStation")
    private int arrivalStation;
    @JsonProperty("ArrStationName")
    private String arrStationName;
    @JsonProperty("ArrivalTime")
    private int arrivalTime;
    @JsonProperty("Distance")
    private int distance;
    @JsonProperty("RestrictionId")
    private int restrictionId;
    @JsonProperty("RunId")
    private int runId;
    @JsonProperty("NetworkId")
    private int networkId;
    @JsonProperty("WalkDistance")
    private int walkDistance;
    @JsonProperty("LrId")
    private int lrId;
    @JsonProperty("RdId")
    private int rdId;
    @JsonProperty("Domain_code")
    private String domain_code;
    @JsonProperty("Number")
    private String number;
    @JsonProperty("DepartureOutside")
    private boolean departureOutside;
    @JsonProperty("ArrivalOutside")
    private boolean arrivalOutside;
    @JsonProperty("DepEovX")
    private int depEovX;
    @JsonProperty("DepEovY")
    private int depEovY;
    @JsonProperty("ArrEovX")
    private int arrEovX;
    @JsonProperty("ArrEovY")
    private int arrEovY;
    @JsonProperty("DomainCompanyName")
    private String domainCompanyName;
    @JsonProperty("Explanation")
    private String explanation;
    @JsonProperty("Prebuy")
    private int prebuy;
    @JsonProperty("LocalDomainCode")
    private String localDomainCode;
    @JsonProperty("Heke")
    private boolean heke;
    private ChargeInfo chargeInfo;
    private boolean local_pass_useable;
    private boolean bkk_pass_useable;
    @JsonProperty("GlobalPassUsage")
    private String globalPassUsage;
    @JsonProperty("DepartureSeqnr")
    private int departureSeqnr;
    @JsonProperty("ArrivalSeqnr")
    private int arrivalSeqnr;
    @JsonProperty("FareSumExtra")
    private int fareSumExtra;
    @JsonProperty("FareExtra")
    private int fareExtra;
    @JsonProperty("FareSeatRes")
    private int fareSeatRes;
    @JsonProperty("Fare")
    private int fare;
    @JsonProperty("FareFifty")
    private int fareFifty;
    @JsonProperty("FareNinty")
    private int fareNinty;
    @JsonProperty("TicketType")
    private String ticketType;
    @JsonProperty("LinkStation")
    private int linkStation;
    @JsonProperty("Bube")
    private boolean bube;
    @JsonProperty("PeakMemory")
    private int peakMemory;
    @JsonProperty("ToSettle")
    private String toSettle;
    @JsonProperty("Hitcount")
    private int hitcount;
    @JsonProperty("ChangeTime")
    private int changeTime;
    @JsonProperty("ChangeMode")
    private String changeMode;
    @JsonProperty("ChangeRoute")
    private String changeRoute;
    @JsonProperty("FromPs")
    private int fromPs;
    @JsonProperty("ToPs")
    private int toPs;
    @JsonProperty("InternalId")
    private int internalId;
    @JsonProperty("FromBay")
    private String fromBay;
    @JsonProperty("ToBay")
    private String toBay;
    @JsonProperty("Owner")
    private int owner;
    @JsonProperty("FirstClassFee")
    private int firstClassFee;
    @JsonProperty("OwnerName")
    private String ownerName;
    @JsonProperty("DatabaseVersion")
    private int databaseVersion;
    @JsonProperty("BikeCarriage")
    private int bikeCarriage;
    @JsonProperty("BikeForbidden")
    private int bikeForbidden;
    @JsonProperty("BikeRestricted")
    private int bikeRestricted;
    @JsonProperty("BikeSeatTicket")
    private int bikeSeatTicket;
    @JsonProperty("BkszDomainCode")
    private String bkszDomainCode;
    @JsonProperty("BufeCar")
    private int bufeCar;
    @JsonProperty("Detour")
    private int detour;
    @JsonProperty("DiningCar")
    private int diningCar;
    @JsonProperty("DirectCarriage")
    private int directCarriage;
    @JsonProperty("DisabledPeople")
    private int disabledPeople;
    @JsonProperty("FirstClass")
    private int firstClass;
    @JsonProperty("HighSpeed")
    private int highSpeed;
    @JsonProperty("Internet")
    private int internet;
    @JsonProperty("JourneyName")
    private String journeyName;
    @JsonProperty("LowFloor")
    private int lowFloor;
    @JsonProperty("NoSuperCharge")
    private int noSuperCharge;
    @JsonProperty("OnDemand")
    private String onDemand;
    @JsonProperty("Premium")
    private int premium;
    @JsonProperty("Remark")
    private String remark;
    @JsonProperty("RunCategory")
    private String runCategory;
    @JsonProperty("RunMessage")
    private String runMessage;
    @JsonProperty("RunType")
    private String runType;
    @JsonProperty("SeatTicketCompulsory")
    private int seatTicketCompulsory;
    @JsonProperty("Superior")
    private int superior;
    @JsonProperty("SupplementaryTicketCompulsory")
    private int supplementaryTicketCompulsory;
    @JsonProperty("Telebus")
    private int telebus;
    @JsonProperty("WheelChairNoLift")
    private int wheelChairNoLift;
    @JsonProperty("WheelChairWithLift")
    private int wheelChairWithLift;
    @JsonProperty("Wifi")
    private int wifi;
    @JsonProperty("CountyPass")
    private String countyPass;
    @JsonProperty("GlobalPass")
    private String globalPass;
    @JsonProperty("LongName")
    private String longName;
    @JsonProperty("NumberType")
    private String numberType;
    @JsonProperty("ShortName")
    private String shortName;
    @JsonProperty("TransportMode")
    private String transportMode;
    @JsonProperty("News")
    private News news;
    @JsonProperty("ChangeLs")
    private String changeLs;
    private String bkk_pass;
    @JsonProperty("SeatTicketOptional")
    private String seatTicketOptional;
    @JsonProperty("PrebuyStation")
    private String prebuyStation;
}

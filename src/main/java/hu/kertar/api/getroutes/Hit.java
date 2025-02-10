package hu.kertar.api.getroutes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Hit {
    @JsonProperty("Count")
    public int count;
    @JsonProperty("Sequence")
    public int sequence;
    @JsonProperty("DepartureStation")
    public int departureStation;
    @JsonProperty("DepartureTime")
    public int departureTime;
    @JsonProperty("DepStationName")
    public String depStationName;
    @JsonProperty("DepartureSettle")
    public int departureSettle;
    @JsonProperty("FromSettle")
    public String fromSettle;
    @JsonProperty("ArrivalSettle")
    public int arrivalSettle;
    @JsonProperty("ArrivalStation")
    public int arrivalStation;
    @JsonProperty("ArrStationName")
    public String arrStationName;
    @JsonProperty("ArrivalTime")
    public int arrivalTime;
    @JsonProperty("Distance")
    public int distance;
    @JsonProperty("RestrictionId")
    public int restrictionId;
    @JsonProperty("RunId")
    public int runId;
    @JsonProperty("NetworkId")
    public int networkId;
    @JsonProperty("WalkDistance")
    public int walkDistance;
    @JsonProperty("LrId")
    public int lrId;
    @JsonProperty("RdId")
    public int rdId;
    @JsonProperty("Domain_code")
    public String domain_code;
    @JsonProperty("Number")
    public String number;
    @JsonProperty("DepartureOutside")
    public boolean departureOutside;
    @JsonProperty("ArrivalOutside")
    public boolean arrivalOutside;
    @JsonProperty("DepEovX")
    public int depEovX;
    @JsonProperty("DepEovY")
    public int depEovY;
    @JsonProperty("ArrEovX")
    public int arrEovX;
    @JsonProperty("ArrEovY")
    public int arrEovY;
    @JsonProperty("DomainCompanyName")
    public String domainCompanyName;
    @JsonProperty("Explanation")
    public String explanation;
    @JsonProperty("Prebuy")
    public int prebuy;
    @JsonProperty("LocalDomainCode")
    public String localDomainCode;
    @JsonProperty("Heke")
    public boolean heke;
    public ChargeInfo chargeInfo;
    public boolean local_pass_useable;
    public boolean bkk_pass_useable;
    @JsonProperty("GlobalPassUsage")
    public String globalPassUsage;
    @JsonProperty("DepartureSeqnr")
    public int departureSeqnr;
    @JsonProperty("ArrivalSeqnr")
    public int arrivalSeqnr;
    @JsonProperty("FareSumExtra")
    public int fareSumExtra;
    @JsonProperty("FareExtra")
    public int fareExtra;
    @JsonProperty("FareSeatRes")
    public int fareSeatRes;
    @JsonProperty("Fare")
    public int fare;
    @JsonProperty("FareFifty")
    public int fareFifty;
    @JsonProperty("FareNinty")
    public int fareNinty;
    @JsonProperty("TicketType")
    public String ticketType;
    @JsonProperty("LinkStation")
    public int linkStation;
    @JsonProperty("Bube")
    public boolean bube;
    @JsonProperty("PeakMemory")
    public int peakMemory;
    @JsonProperty("ToSettle")
    public String toSettle;
    @JsonProperty("Hitcount")
    public int hitcount;
    @JsonProperty("ChangeTime")
    public int changeTime;
    @JsonProperty("ChangeMode")
    public String changeMode;
    @JsonProperty("ChangeRoute")
    public String changeRoute;
    @JsonProperty("FromPs")
    public int fromPs;
    @JsonProperty("ToPs")
    public int toPs;
    @JsonProperty("InternalId")
    public int internalId;
    @JsonProperty("FromBay")
    public String fromBay;
    @JsonProperty("ToBay")
    public String toBay;
    @JsonProperty("Owner")
    public int owner;
    @JsonProperty("FirstClassFee")
    public int firstClassFee;
    @JsonProperty("OwnerName")
    public String ownerName;
    @JsonProperty("DatabaseVersion")
    public int databaseVersion;
    @JsonProperty("BikeCarriage")
    public int bikeCarriage;
    @JsonProperty("BikeForbidden")
    public int bikeForbidden;
    @JsonProperty("BikeRestricted")
    public int bikeRestricted;
    @JsonProperty("BikeSeatTicket")
    public int bikeSeatTicket;
    @JsonProperty("BkszDomainCode")
    public String bkszDomainCode;
    @JsonProperty("BufeCar")
    public int bufeCar;
    @JsonProperty("Detour")
    public int detour;
    @JsonProperty("DiningCar")
    public int diningCar;
    @JsonProperty("DirectCarriage")
    public int directCarriage;
    @JsonProperty("DisabledPeople")
    public int disabledPeople;
    @JsonProperty("FirstClass")
    public int firstClass;
    @JsonProperty("HighSpeed")
    public int highSpeed;
    @JsonProperty("Internet")
    public int internet;
    @JsonProperty("JourneyName")
    public String journeyName;
    @JsonProperty("LowFloor")
    public int lowFloor;
    @JsonProperty("NoSuperCharge")
    public int noSuperCharge;
    @JsonProperty("OnDemand")
    public String onDemand;
    @JsonProperty("Premium")
    public int premium;
    @JsonProperty("Remark")
    public String remark;
    @JsonProperty("RunCategory")
    public String runCategory;
    @JsonProperty("RunMessage")
    public String runMessage;
    @JsonProperty("RunType")
    public String runType;
    @JsonProperty("SeatTicketCompulsory")
    public int seatTicketCompulsory;
    @JsonProperty("Superior")
    public int superior;
    @JsonProperty("SupplementaryTicketCompulsory")
    public int supplementaryTicketCompulsory;
    @JsonProperty("Telebus")
    public int telebus;
    @JsonProperty("WheelChairNoLift")
    public int wheelChairNoLift;
    @JsonProperty("WheelChairWithLift")
    public int wheelChairWithLift;
    @JsonProperty("Wifi")
    public int wifi;
    @JsonProperty("CountyPass")
    public String countyPass;
    @JsonProperty("GlobalPass")
    public String globalPass;
    @JsonProperty("LongName")
    public String longName;
    @JsonProperty("NumberType")
    public String numberType;
    @JsonProperty("ShortName")
    public String shortName;
    @JsonProperty("TransportMode")
    public String transportMode;
    @JsonProperty("News")
    public News news;
}

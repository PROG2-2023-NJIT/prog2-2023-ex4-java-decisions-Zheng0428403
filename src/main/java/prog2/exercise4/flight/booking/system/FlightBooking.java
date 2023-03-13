package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;


public class FlightBooking {
    static String flightCompany = "Flights-of-Fancy";
    public String flightID = "FOF0345IN";
    public String passengerFullName = "Luxin Zheng";
    public TripSource tripSource;
    public SourceAirport sourceAirport;
    public TripDestination tripDestination;
    public DestinationAirport destinationAirport;
    public LocalDate departingDate;
    public LocalDate returnDate;
    public int childPassengers;
    public int adultPassengers;
    public int totalPassengers;
    public double departingTicketPrice;
    public double returnTicketPrice;
    public double totalTicketPrice;
    public String ticketNumber = "12345";
    public BookingClass bookingClass;
    private TripType tripType;

    enum BookingClass {
        FIRST,BUSINESS,ECONOMY
    }
    enum TripType{
        ONE_WAY,RETURN
    }
    enum TripSource{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    enum TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    enum SourceAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport,OuluAirport,HelsinkiAirport,ParisCharlesdeGaulleAirport
    }
    enum DestinationAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport,OuluAirport,HelsinkiAirport,ParisCharlesdeGaulleAirport
    }
    public FlightBooking(String passengerFullName2, LocalDate depart, LocalDate returndate2, int i, int j) {
        this.passengerFullName = passengerFullName2;
        this.departingDate = depart;
        this.returnDate = returndate2;
        this.childPassengers = i;
        this.adultPassengers = j;
        
    }
    public String getFlightCompany(){
        return FlightBooking.flightCompany;}
    public String getFlightID(){
        return this.flightID;}
    public String getPassengerFullName(){
        return this.passengerFullName;}
    public SourceAirport getSourceAirport(){
        return this.sourceAirport;}
    
    public DestinationAirport getDestinationAirport(){
        return this.destinationAirport;}
    
    public int getChildrenPassengers(){
        return this.childPassengers;}
    public int getAdultPassengers(){
        return this.adultPassengers;}
    public int getTotalPassengers(){
        return this.totalPassengers;}
    public void setTotalPassengers(int childPassengers, int adultPassengers){
        this.totalPassengers = childPassengers + adultPassengers;
    }    
    public double getDepartingTicketPrice(){
        return this.departingTicketPrice;}
    public void setDepartingTicketPrice(double childPassengers, double adultPassengers){
        this.departingTicketPrice = departingTicketPrice;
    }
    public double getReturnTicketPrice(){
        return this.returnTicketPrice;
    } 
    public void setReturnTicketPrice(){
        this.returnTicketPrice = returnTicketPrice;
    }  
       
    
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departingDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice + "\n" + 
        "IMPORTANT NOTICE:As per our policy, the return date was changed because it was less than two days apart from your departure date" ;


    }    
   
    public BookingClass getBookingClass(){
        return this.bookingClass;
    }
   
    
    public void setBookingClass(String q){
          if(q.equals("1")){
            this.bookingClass = BookingClass.FIRST;
          }
          if(q.equals("2")){
            this.bookingClass = BookingClass.BUSINESS;
          }
          if(q.equals("3")){
            this. bookingClass = BookingClass.ECONOMY;
          }
    }
    public TripType getTripType(){
        return this.tripType;}
    
    public void setTripType(String w){
        if(w.equals("1")){
            this.tripType = TripType.ONE_WAY;
          }
        if(w.equals("2")){
            this.tripType = TripType.RETURN;
    }
        
}
    
    

    public TripSource getTripSource(){
         return this.tripSource;
    }
    public void setTripSource(String e){
        if(e.equals("1")){
            this.tripSource = TripSource.NANJING;
        }
        if(e.equals("2")){
            this.tripSource = TripSource.BEIJING;
        }
        if(e.equals("3")){
            this.tripSource = TripSource.OULU;
        }
        if(e.equals("4")){
            this.tripSource = TripSource.HELSINKI;
        }
    }

    public TripDestination getTripDestination(){
        return this.tripDestination;}
   public void setTripDestination(String f){
       if(f.equals("1")){
           this.tripDestination = TripDestination.NANJING;
       }
       if(f.equals("2")){
           this.tripDestination = TripDestination.BEIJING;
       }
       if(f.equals("3")){
           this.tripDestination = TripDestination.OULU;
       }
       if(f.equals("4")){
           this.tripDestination = TripDestination.HELSINKI;
       }
   }
   public void setTripDestination(TripSource tripSource,TripDestination tripDestination) {
    this.tripDestination = tripDestination;
}


public LocalDate getDepartureDate(){
    return this.departingDate;}
public LocalDate getReturnDate(){
    return this.returnDate;}
public void setDepartureDate(LocalDate ll){
    this.departingDate = ll;
}
public void setReturnDate(LocalDate returnDate){
    
    int result = returnDate.compareTo(departingDate);
    if(result >= 2){
        this.returnDate=returnDate;
    
    }
    if(result ==1){
        this.returnDate=returnDate.plusDays(1);
    
    }
    if(result ==0){
        this.returnDate=returnDate.plusDays(2);
    
    }



}

public String getTicketNumber(){
    return this.ticketNumber;}
public void setTicketNumber(){
    if (tripType.equals("1")){
        this.ticketNumber = "11########";
        if(bookingClass.equals("1")){
            this.ticketNumber = "11F#######";
        }
        if(bookingClass.equals("2")){
            this.ticketNumber = "11B#######";
        }
        if(bookingClass.equals("3")){
            this.ticketNumber = "11E#######";
        }
    }
    if (tripType.equals("2")){
        this.ticketNumber = "22########";
        if(bookingClass.equals("1")){
            this.ticketNumber = "22F#######";
        }
        if(bookingClass.equals("2")){
            this.ticketNumber = "22B#######";
        }
        if(bookingClass.equals("3")){
            this.ticketNumber = "22E#######";
        }
    }





    }
    public double getTotalTicketPrice(){
        return this.totalTicketPrice;}
    public void setTotalTicketPrice(){
        if(){
            this.totalTicketPrice = 300 + 300*0.1 +300*0.05;
            if(bookingClass.equals("1")){
                this.totalTicketPrice = (300 + 300*0.1 +300*0.05) + 250;  
            }
            if(bookingClass.equals("2")){
                this.totalTicketPrice = (300 + 300*0.1 +300*0.05) + 150;
        }
        if(bookingClass.equals("3")){
            this.totalTicketPrice = (300 + 300*0.1 +300*0.05) + 50;
    }  
    }
    if(){
        this.totalTicketPrice = 300 + 300*0.15 +300*0.1;
        if(bookingClass.equals("1")){
            this.totalTicketPrice = (300 + 300*0.15 +300*0.1) + 250;  
        }
        if(bookingClass.equals("2")){
            this.totalTicketPrice = (300 + 300*0.15 +300*0.1) + 150;
    }
    if(bookingClass.equals("3")){
        this.totalTicketPrice = (300 + 300*0.15 +300*0.1) + 50;
} 
    }     
  
    }
    
}


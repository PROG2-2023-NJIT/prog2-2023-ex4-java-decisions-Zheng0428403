package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;



import prog2.exercise4.flight.booking.system.FlightBooking.TripDestination;
import prog2.exercise4.flight.booking.system.FlightBooking.TripSource;
/**
 * Hello world!
 *
 */
public class Main 
{
    private static final LocalDate depart = null;
    private static final LocalDate returnDate = null;
    public static void main( String[] args )
    {   FlightBooking fb = new FlightBooking("null", depart, returnDate, 2, 3);
    Scanner zlx = new Scanner(System.in);
    System.out.println("Give name :");
    String passengerFullName = zlx.nextLine();
   
    Scanner a = new Scanner(System.in);
    System.out.println("请输入你想要的舱：");
    System.out.println("1. First "+"\n" + "2.Business" + "\n" +"3. Economy ");
    int b = a.nextInt();
    String qq = new String();
   
    switch(b){
        case 1 : qq = "1"; fb.setBookingClass(qq);break;
    }
    switch(b){
        case 2 : qq = "2"; fb.setBookingClass(qq);break;
    }
    switch(b){
        case 3 : qq = "3"; fb.setBookingClass(qq);break;
    }
    
    Scanner e = new Scanner(System.in);
    System.out.println("请选择方式:");
    System.out.println("1. One way" + "\n" + "2. Return" + "\n");
    int f = e.nextInt();
    
    String ww = new String();
   
    switch(f){
        case 1 : ww = "1"; fb.setTripType(ww);break;
    }
    switch(f){
        case 2 : ww = "2"; fb.setTripType(ww);break;
    }
    
    Scanner c = new Scanner(System.in);
    System.out.println("请选择出发地：");
    System.out.println("1. Nanjing" + "\n" +"2.Beijing" + "\n" + "3. Oulu" + "\n" + "4.Helsinki" + "\n" );
    int g = c.nextInt();
    
    String ee = new String();
    
    switch(g){
        case 1 : ee = "1"; fb.setTripSource(ee);break;
    }
    switch(g){
        case 2 : ee = "2"; fb.setTripSource(ee);break;
    }
    switch(g){
        case 3 : ee = "3"; fb.setTripSource(ee);break;
    }
    switch(g){
        case 4 : ee = "4"; fb.setTripSource(ee);break;
    }
    
    Scanner d = new Scanner(System.in);
    System.out.println("请选择目的地：");
    System.out.println("1. Nanjing" + "\n" +"2.Beijing" + "\n" + "3. Oulu" + "\n" + "4.Helsinki" + "\n");
    int h = d.nextInt();
    
    String ff = new String();
    
    switch(h){
        case 1 : ff = "1"; fb.setTripDestination(ff);break;
    }
    switch(h){
        case 2 : ff = "2"; fb.setTripDestination(ff);break;
    }
    switch(h){
        case 3 : ff = "3"; fb.setTripDestination(ff);break;
    }
    switch(h){
        case 4 : ff = "4"; fb.setTripDestination(ff);break;
    }
    
    
    Scanner i = new Scanner(System.in);
    System.out.println("出发时间：");
    String departingDate = i.nextLine();
    LocalDate df = LocalDate.parse(departingDate);
    fb.setDepartureDate(df);
    fb.getDepartureDate();
    
    LocalDate dateParam = LocalDate.parse("2023-03-06");
    System.out.println("String => LocalDate: " + dateParam);
    
    Scanner j = new Scanner(System.in);
    System.out.println("返程时间：");
    String returnDate = j.nextLine();
    LocalDate rf = LocalDate.parse(returnDate);
    fb.setReturnDate(rf);
    fb.getReturnDate();

    Scanner k = new Scanner(System.in);
    System.out.println("票号是什么：");
    String ticketNumber = k.nextLine();
    fb.getTicketNumber();

    Scanner l = new Scanner(System.in);
    System.out.println("总票价为：");
    String totalTicketPrice = k.nextLine();
    fb.getTotalTicketPrice();
    

    
   
    String company = fb.getFlightCompany();
    TripSource TripSource = fb.getTripSource();
    TripDestination TripDestination = fb.getTripDestination(); 
   
    fb.setTotalPassengers(1, 3);
    int totalPassengers = fb.getTotalPassengers();
    
    System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " + 
    company + ". Following are the details of your booking and the trip:" + "\n" + 
    "Ticket Number: " + ticketNumber + "\n" + 
    "From " + TripSource + " to " + TripDestination + "\n" +
    "Date of departure: " + departingDate + "\n" +
    "Date of return: " + returnDate + "\n" +
    "Total passengers: " + totalPassengers + "\n" +
    "Total ticket price in Euros: " + totalTicketPrice);
    a.close();
    zlx.close();
    c.close();
    d.close();
    e.close();
    i.close();
    j.close();
    k.close();
    l.close();

}
}


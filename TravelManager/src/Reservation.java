

public class Reservation {
    public static Passenger passenger=new  Passenger("", "", "", "");
    Bus bus;
    Plane plane;
    Train train;
    static String seatNumber="";
    static String yolcusayisi;
    static String kalkis;
    static String varis;
    static String tarih;
    static String seferno;
    static int ucret;

    public static int getUcret() {
        
        return ucret;
    }

    public static void setUcret(int ucret) {
        Reservation.ucret = ucret;
    }
    
    
    
    public static Passenger getPassenger() {
        return passenger;
    }

    public static void setPassenger(Passenger passenger) {
        Reservation.passenger = passenger;
    }
    

    public static String getSeferno() {
        return seferno;
    }

    public static void setSeferno(String seferno) {
        Reservation.seferno = seferno;
    }
    
    

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatnumber) {
        this.seatNumber=seatnumber;
    }
    
}

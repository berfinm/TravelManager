import java.util.ArrayList;
import java.util.Random;

 public abstract class Vehicle{
    int seatCapacity;
    int distance;
    int customerPay;
    Trip chosenTrip; 
    Route chosenRoute;
    ArrayList<Personel> chosenPersonelList;
    int fuelCost;
    double totalfuelCost;
    double totalCustomerPay;
    int vehicleID;
    String namecompany;
    int [] seats;
    String vehicleName;
    double personelCost;

    public Vehicle() {
    
    }
    
    
    
    public int setDistance() {
        int[] result = chosenRoute.customerPayHighway(chosenRoute.getStartPoint(), chosenRoute.getEndPoint());
        int customerPay = result[0];
        this.distance = result[1];
        return distance;
    }
    
    public int setCustomerPay() {
        int[] result = chosenRoute.customerPayAirway(chosenRoute.getStartPoint(), chosenRoute.getEndPoint());
         this.customerPay = result[0];
        //int distance = result[1];
        return customerPay;
    }
    
    public void initializeSeatsRandomly() {
        Random random = new Random();
        for (int i = 0; i < seatCapacity; i++) {
            seats[i] = random.nextInt(2);
        }
    }
    
    public void getPersonel(Personel yeniPersonel, ArrayList<Personel> chosenPersonelList) {
        chosenPersonelList.add(yeniPersonel);
    }
    public Vehicle(String vehicleName, int seatCapacity, Trip chosenTrip, Route chosenRoute, int fuelCost, int vehicleID,String namecompany) {
        this.vehicleName = vehicleName;
        this.seatCapacity = seatCapacity;
        this.chosenTrip = chosenTrip;
        this.chosenRoute = chosenRoute;
        //this.chosenPersonelList = chosenPersonelList;
        this.fuelCost = fuelCost;
        this.vehicleID = vehicleID;
        this.namecompany=namecompany;
        this.seats = new int[seatCapacity];
        initializeSeatsRandomly();
    }
    
    abstract double calculateFuelCost();
}
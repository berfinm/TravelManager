import java.util.ArrayList;

public class Bus extends Vehicle {
    
    public Bus(String vehicleName,int seatCapacity, Trip chosenTrip, Route chosenRoute, int fuelCost, int vehicleID,String namecompany) {
        super(vehicleName,seatCapacity, chosenTrip, chosenRoute,fuelCost, vehicleID,namecompany);
    }
    public Bus (int seatCapacity){
        super("",seatCapacity, null, null, 0, 0,"");
        this.seats = new int[seatCapacity];
        initializeSeatsRandomly();
    }
    public Bus(){
    
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

    @Override
    public double calculateFuelCost() {
        return distance * fuelCost;
    } 

    void getPersonel(Person yeniPersonel, ArrayList<Person> chosenPersonelList) {
        chosenPersonelList.add(yeniPersonel);
    }
}
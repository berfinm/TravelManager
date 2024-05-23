import java.util.ArrayList;

public class Train extends Vehicle{
    public Train(String vehicleName, int seatCapacity, Trip chosenTrip, Route chosenRoute, int fuelCost, int vehicleID,String namecompany) {
        super(vehicleName, seatCapacity, chosenTrip, chosenRoute, fuelCost, vehicleID,namecompany);
    }
    public Train (int seatCapacity){
        super("",seatCapacity, null, null, 0, 0,"");
        this.seats = new int[seatCapacity];
        initializeSeatsRandomly();
    }
     public Train(){
    
    }

    public int setDistance() {
        int[] result = chosenRoute.customerPayRailway(chosenRoute.getStartPoint(), chosenRoute.getEndPoint());
        int customerPay = result[0];
        this.distance = result[1];
        return distance;
    }
    public int setCustomerPay() {
        int[] result = chosenRoute.customerPayAirway(chosenRoute.getStartPoint(), chosenRoute.getEndPoint());
        int customerPay = result[0];
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
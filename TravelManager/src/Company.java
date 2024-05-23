import java.util.ArrayList;

interface IProfitable{
    public double calculateProfit(Vehicle vehicle);
}

public class Company extends User implements IProfitable{
    ArrayList<Bus>companyBus;
    ArrayList<Plane> companyPlane;
    ArrayList<Train> companyTrain;
    ArrayList<Vehicle> companyVehicle;
    ArrayList<String> citytogo;
    String companyname;
    double profit;
    public Company(String name, String password, String companyname) {
        super(name, password);
        this.companyname=companyname;
        this.companyBus = new ArrayList<>();
        this.companyPlane = new ArrayList<>();
        this.companyTrain = new ArrayList<>();
        this.citytogo = new ArrayList<>();
        this.companyVehicle=new ArrayList<>();
    }
    /*public void getBus (Bus bus){
        this.companyBus = bus;
    }*/
    @Override
    public double calculateProfit(Vehicle vehicle){
     this.profit = vehicle.totalCustomerPay - vehicle.fuelCost - vehicle.personelCost;
       
     return profit;
    }
    public void addVehicle(Vehicle vehicle) {
        companyVehicle.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        companyVehicle.remove(vehicle);
    }
    public void addBus(Bus bus) {
        companyBus.add(bus);
    }
    public void removeBus(Bus bus) {
        companyBus.remove(bus);
    }
    public void addPlane (Plane plane){
        companyPlane.add(plane);
    }
    public void removePlane(Plane plane) {
        companyBus.remove(plane);
    }
    public void addTrain (Train train){
        companyTrain.add(train);
    }
    public void removeTrain (Train train){
        companyTrain.remove(train);
    }
   
    public void addCity (String city){
        citytogo.add(city);
    }
   
    public String getCompanyName(Company company) {
       
        return company.companyname;
    }

  
    
    
     public class GlobalArrayList {

    // Declare a static ArrayList to make it accessible across classes
    private static ArrayList<Company> globalList = new ArrayList<>();

    // Method to add an element to the global ArrayList
    public static void addToGlobalList(Company sirket) {
        globalList.add(sirket);
    }

    // Method to get the global ArrayList
    public static ArrayList<Company> getGlobalList() {
        return globalList;
    }
    
    
    public static void removeFromGlobalList(String companyName) {
        Company companyToRemove = null;
        for (Company company : globalList) {
            
            if (company.getCompanyName(company).equals(companyName)) {
                companyToRemove = company;
                break;
            }
        }
        if (companyToRemove != null) {
            globalList.remove(companyToRemove);
        }
    }
    
    
    
    
}
    
   
}
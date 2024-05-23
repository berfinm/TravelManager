public class Trip {
    Vehicle vehicle;
    Route route;
    String city;
    String tripName;
    //günü de olacak
    public void getRoute(Route route){
        this.route = route;
    }
 }
class Highway extends Trip{
    String highwayRoute1 = "Istanbul,Kocaeli,Ankara,Kocaeli,Istanbul";
    int highwayRoute1Cost = 300*2;
    int highwayRoute1Distance = 500*2;
    String highwayRoute2 = "Istanbul,Kocaeli,Eskisehir,Konya,Eskisehir,Kocaeli,Istanbul";
    int highwayRoute2Cost = 300*2;
    int highwayRoute2Distance = 600*2;
    public void getVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void getRoute(Route route){
        this.route = route;
    }
    public String getCity1(){
        this.tripName="3.Sefer";
        return highwayRoute1;
    }
    
    public int getCost1(){
        return highwayRoute1Cost;
    }
    public int getDistance1(){
        return highwayRoute1Distance;
    }
    public String getCity2(){
        this.tripName="4.Sefer";
        return highwayRoute2;
    }
    public int getCost2(){
        return highwayRoute2Cost;
    }
    public int getDistance2(){
        return highwayRoute2Distance;
    }
}
class Airway extends Trip{
    String airwayRoute1 = "Istanbul,Konya,Istanbul";
    int airwayRoute1Cost = 1200*2;
    int airwayRoute1Distance = 300*2;
    String airwayRoute2 = "Istanbul,Ankara,Istanbul";
    int airwayRoute2Cost = 1000*2;
    int airwayRoute2Distance = 250*2;
    public void getVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void getRoute(Route route){
        this.route = route;
    }
    public String getCity1(){
        this.tripName="5.Sefer";
        return airwayRoute1;
    }
    public int getCost1(){
        return airwayRoute1Cost;
    }
    public int getDistance1(){
        return airwayRoute1Distance;
    }
    public String getCity2(){
        this.tripName="6.Sefer";
        return airwayRoute2;
    }
    public int getCost2(){
        return airwayRoute2Cost;
    }
    public int getDistance2(){
        return airwayRoute2Distance;
    }
}
class Railway extends Trip{
    String railwayRoute1 = "Istanbul,Kocaeli,Bilecik,Eskisehir,Ankara,Eskisehir,Bilecik,Kocaeli,Istanbul";
    int railwayRoute1Cost = 250*2;
    int railwayRoute1Distance = 375*2;
    String railwayRoute2 = "Istanbul,Kocaeli,Bilecik,Eskisehir,Konya,Eskisehir,Bilecik,Kocaeli,Istanbul";
    int railwayRoute2Cost = 300*2;
    int railwayRoute2Distance = 450*2;
    
    public void getVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void getRoute(Route route){
        this.route = route;
    }
    public String getCity1(){
        this.tripName="1.Sefer";
        return railwayRoute1;
    }
    public int getCost1(){
        return railwayRoute1Cost;
    }
    public int getDistance1(){
        return railwayRoute1Distance;
    }
    public String getCity2(){
        this.tripName="2.Sefer";
        return railwayRoute2;
    }
    public int getCost2(){
        return railwayRoute2Cost;
    }
    public int getDistance2(){
        return railwayRoute2Distance;
    }
}
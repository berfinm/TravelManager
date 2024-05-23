import java.util.ArrayList;



interface IReservable{
    boolean isSeatEmpty(int [] seat, int seatCapacity);
}



public class Transport implements IReservable{
   public static Passenger passenger=new  Passenger("", "", "", "");
   public static Passenger passenger1=new  Passenger("", "", "", "");
   public static ArrayList<Vehicle> uygunaraclar=new ArrayList<>();
   public void addVehicle(Vehicle vehicle, ArrayList<Vehicle> uygunaraclar) {
        uygunaraclar.add(vehicle);
    }
   @Override
   public boolean isSeatEmpty(int[] seat, int index) {
            return seat[index] != 1;
    }
   
   public static ArrayList<Vehicle> getVehicleList(){
   
   return uygunaraclar;
   }
   public static void removeVehicleList(Vehicle vehicle){
       uygunaraclar.remove(vehicle);
   }
   public static void addVehicleList(Vehicle vehicle){
       uygunaraclar.add(vehicle);
   }

    public static Passenger getPassenger() {
        return passenger;
    }

    public static void setPassenger(Passenger passenger) {
        Transport.passenger = passenger;
    }
    public static Passenger getPassenger1() {
        return passenger1;
    }

    public static void setPassenger1(Passenger passenger) {
        Transport.passenger1 = passenger;
    }
   
    
   
    
    public static void main(String[] args) {
    Transport transport=new Transport();
    Company companyA = new Company("companyA", "1234a","A");
    Company.GlobalArrayList.addToGlobalList(companyA);
    //Otobus1 icin islemler
    Route route1A = new Route();
    Trip trip1A = new Highway();
    
    Highway highway1A = (Highway) trip1A;
    trip1A.city = highway1A.getCity1();
    companyA.citytogo.add(trip1A.city);
    //System.out.println(companyA.citytogo.get(0));
    
    Personel personel1Bus1A = new Personel("Fırat", "Yılmaz",5000);
    Personel personel2Bus1A = new Personel("Fırat", "Yılmaz",5000);
    Personel personel3Bus1A = new Personel("Fırat", "Yılmaz",2000);
    Personel personel4Bus1A = new Personel("Fırat", "Yılmaz",2000);
    ArrayList<Personel> chosenPersonelList = new ArrayList<>();
    Bus bus1A = new Bus("1. Otobus",20, trip1A, route1A, 10, 0,"A");
    //route1A.startPoint = route1A.getStartPoint();
    //route1A.endPoint = route1A.getEndPoint();
    //route1A.result = route1A.customerPayHighway(route1A.startPoint, route1A.endPoint);
    bus1A.customerPay = 300*2; //istanbul - ankara - istanbul
    bus1A.distance = 500*2; //istanbul - ankara - istanbul
    bus1A.getPersonel(personel1Bus1A, chosenPersonelList);
    bus1A.getPersonel(personel2Bus1A, chosenPersonelList);
    bus1A.getPersonel(personel3Bus1A, chosenPersonelList);
    bus1A.getPersonel(personel4Bus1A, chosenPersonelList);
    bus1A.chosenPersonelList = chosenPersonelList;
    for(Personel personel : bus1A.chosenPersonelList){
        bus1A.personelCost += (personel.servicePersonelCost*2);
    }
    //bus1A.distance = bus1A.getDistance();
    //bus1A.customerPay = bus1A.getCustomerPay();
    bus1A.totalfuelCost =bus1A.calculateFuelCost();
    companyA.addBus(bus1A);
    transport.addVehicle(bus1A, uygunaraclar);
    companyA.addVehicle(bus1A);
    for (int i = 0; i < bus1A.seats.length; i++) {
    int seatIndex = bus1A.seats[i];
    //System.out.println(seatIndex);
    if(transport.isSeatEmpty(bus1A.seats, i)){
        bus1A.totalCustomerPay+=bus1A.customerPay;
        }
    }
    
    companyA.profit += companyA.calculateProfit(bus1A);
     //System.out.println(bus1A.totalCustomerPay);
    //
    //Otobus2 icin islemler
    Trip trip2A = new Highway();
    Route route2A = new Route();
  
    Highway highway2A = (Highway) trip2A;
    trip2A.city = highway2A.getCity1();
    
    companyA.citytogo.add(trip2A.city);
    Personel personel1Bus2A = new Personel("Fırat", "Yılmaz",5000);
    Personel personel2Bus2A = new Personel("Fırat", "Yılmaz",5000);
    Personel personel3Bus2A = new Personel("Fırat", "Yılmaz",2000);
    Personel personel4Bus2A = new Personel("Fırat", "Yılmaz",2000);
    ArrayList<Personel> chosenPersonelList1 = new ArrayList<>();
    Bus bus2A = new Bus("2. Otobus",15, trip2A, route2A, 10, 0,"A");
    //route2A.startPoint = route2A.getStartPoint();
    //route2A.endPoint = route2A.getEndPoint();
    //route2A.result = route2A.customerPayHighway(route2A.startPoint, route2A.endPoint);
    bus2A.customerPay =300*2; //istanbul - ankara - istanbul
    bus2A.distance = 500*2; //istanbul - ankara - istanbul
    bus2A.getPersonel(personel1Bus2A, chosenPersonelList1);
    bus2A.getPersonel(personel2Bus2A, chosenPersonelList1);
    bus2A.getPersonel(personel3Bus2A, chosenPersonelList1);
    bus2A.getPersonel(personel4Bus2A, chosenPersonelList1);
    bus2A.chosenPersonelList = chosenPersonelList1;
    for(Personel personel : bus2A.chosenPersonelList){
        bus2A.personelCost += (personel.servicePersonelCost*2);
    }
    //bus2A.distance = bus2A.getDistance();
    //bus2A.customerPay = bus2A.getCustomerPay();
    //bus2A.calculateFuelCost();
    bus2A.totalfuelCost =bus2A.calculateFuelCost();
    companyA.addBus(bus2A);
    transport.addVehicle(bus2A, uygunaraclar);
    companyA.addVehicle(bus2A);
    for (int i = 0; i < bus2A.seats.length; i++) {
    int seatIndex = bus2A.seats[i];
    //System.out.println(seatIndex);
    if(transport.isSeatEmpty(bus2A.seats, i)){
        bus2A.totalCustomerPay+=bus2A.customerPay;
        }
    }
    companyA.profit += companyA.calculateProfit(bus2A);
    // System.out.println("*********"+companyA.profit);
   
    //
    Company companyB = new Company("companyB", "1234b","B");
    Company.GlobalArrayList.addToGlobalList(companyB);
    //Otobus1 icin islemler
    Trip trip1B = new Highway();
    Route route1B= new Route();
    
    Highway highway1B = (Highway) trip1B;
    trip1B.city = highway1B.getCity1();
    
    companyB.citytogo.add(trip1B.city);
    Personel personel1Bus1B = new Personel("Fırat", "Yılmaz",3000);
    Personel personel2Bus1B = new Personel("Fırat", "Yılmaz",3000);
    Personel personel3Bus1B = new Personel("Fırat", "Yılmaz",1500);
    Personel personel4Bus1B = new Personel("Fırat", "Yılmaz",1500);
    ArrayList<Personel> chosenPersonelListB = new ArrayList<>();
    Bus bus1B = new Bus("1. Otobus",15, trip1B, route1B, 5, 0,"B");
    //route1B.startPoint = route1B.getStartPoint();
    //route1B.endPoint = route1B.getEndPoint();
    //route1B.result = route1B.customerPayHighway(route1B.startPoint, route1B.endPoint);
    bus1B.customerPay = 300*2; // istanbul - ankara - istanbul
    bus1B.distance = 500*2; //istanbul - ankara - istanbul 
    bus1B.getPersonel(personel1Bus1B, chosenPersonelListB);
    bus1B.getPersonel(personel2Bus1B, chosenPersonelListB);
    bus1B.getPersonel(personel3Bus1B, chosenPersonelListB);
    bus1B.getPersonel(personel4Bus1B, chosenPersonelListB);
    bus1B.chosenPersonelList = chosenPersonelListB;
    for(Personel personel : bus1B.chosenPersonelList){
        bus1B.personelCost += (personel.servicePersonelCost*2);
    }
    //bus1B.distance = bus1B.getDistance();
    //bus1B.customerPay = bus1B.getCustomerPay();
    bus1B.totalfuelCost=bus1B.calculateFuelCost();
    companyB.addBus(bus1B);
    transport.addVehicle(bus1B, uygunaraclar);
    companyB.addVehicle(bus1B);
    for (int i = 0; i < bus1B.seats.length; i++) {
    int seatIndex = bus1B.seats[i];
    if(transport.isSeatEmpty(bus1B.seats, i)){
        bus1B.totalCustomerPay+=bus1B.customerPay;
        }
    }
    companyB.profit += companyB.calculateProfit(bus1B);
    //
    // Otobus 2 icin islemler
    Trip trip2B = new Highway();
    Route route2B= new Route();
   
    Highway highway2B = (Highway) trip2B;
    trip2B.city = highway2B.getCity2();
    
    companyB.citytogo.add(trip2B.city);
    Personel personel1Bus2B = new Personel("Fırat", "Yılmaz",3000);
    Personel personel2Bus2B = new Personel("Fırat", "Yılmaz",3000);
    Personel personel3Bus2B = new Personel("Fırat", "Yılmaz",1500);
    Personel personel4Bus2B = new Personel("Fırat", "Yılmaz",1500);
    ArrayList<Personel> chosenPersonelListB2 = new ArrayList<>();
    Bus bus2B = new Bus("2. Otobus",20, trip2B, route2B, 5, 0,"B");
    //route2B.startPoint = route2B.getStartPoint();
    //route2B.endPoint = route2B.getEndPoint();
    //route2B.result = route2B.customerPayHighway(route2B.startPoint, route2B.endPoint);
    bus2B.customerPay = 300*2; //istanbul-konya-istanbul
    bus2B.distance = 600*2;//istanbul-konya-istanbul
    bus2B.getPersonel(personel1Bus2B, chosenPersonelListB2);
    bus2B.getPersonel(personel2Bus2B, chosenPersonelListB2);
    bus2B.getPersonel(personel3Bus2B, chosenPersonelListB2);
    bus2B.getPersonel(personel4Bus2B, chosenPersonelListB2);
    bus2B.chosenPersonelList = chosenPersonelListB2;
    for(Personel personel : bus2B.chosenPersonelList){
        bus2B.personelCost += (personel.servicePersonelCost*2);
    }
    //bus2B.distance = bus2B.getDistance();
    //bus2B.customerPay = bus2B.getCustomerPay();
    bus2B.totalfuelCost=bus2B.calculateFuelCost();
    companyB.addBus(bus2B);
    transport.addVehicle(bus2B, uygunaraclar);
    companyB.addVehicle(bus2B);
    for (int i = 0; i < bus2B.seats.length; i++) {
    int seatIndex = bus2B.seats[i];
    if(transport.isSeatEmpty(bus2B.seats, i)){
        bus2B.totalCustomerPay+=bus2B.customerPay;
        }
    }
    companyB.profit += companyB.calculateProfit(bus2B);
    
     Company companyC = new Company("companyC", "1234c","C");
     Company.GlobalArrayList.addToGlobalList(companyC);
    //Otobus1 icin islemler
    Trip trip1C = new Highway();
    Route route1C = new Route();
    Highway highway1C = (Highway) trip1C;
    trip1C.city = highway1C.getCity2();
    
    companyC.citytogo.add(trip1C.city);
    Personel personel1Bus1C = new Personel("Fırat", "Yılmaz",4000);
    Personel personel2Bus1C = new Personel("Fırat", "Yılmaz",4000);
    Personel personel3Bus1C = new Personel("Fırat", "Yılmaz",2000);
    Personel personel4Bus1C = new Personel("Fırat", "Yılmaz",2000);
    ArrayList<Personel> chosenPersonelListC = new ArrayList<>();
    Bus bus1C = new Bus("1. Otobus",20, trip1C, route1C, 6, 0,"C");
    //route1C.startPoint = route1C.getStartPoint();
    //route1C.endPoint = route1C.getEndPoint();
    //route1C.result = route1C.customerPayHighway(route1C.startPoint, route1C.endPoint);
    bus1C.customerPay = 300*2; //istanbul-konya-istanbul
    bus1C.distance = 600*2;//istanbul-konya-istanbul
    bus1C.getPersonel(personel1Bus1C, chosenPersonelListC);
    bus1C.getPersonel(personel2Bus1C, chosenPersonelListC);
    bus1C.getPersonel(personel3Bus1C, chosenPersonelListC);
    bus1C.getPersonel(personel4Bus1C, chosenPersonelListC);
    bus1C.chosenPersonelList = chosenPersonelListC;
    for(Personel personel : bus1C.chosenPersonelList){
        bus1C.personelCost += (personel.servicePersonelCost*2);
    }
    //bus1C.distance = bus1C.getDistance();
    //bus1C.customerPay = bus1C.getCustomerPay();
    bus1C.totalfuelCost = bus1C.calculateFuelCost();
    companyC.addBus(bus1C);
    transport.addVehicle(bus1C, uygunaraclar);
    companyC.addVehicle(bus1C);
    for (int i = 0; i < bus1C.seats.length; i++) {
    int seatIndex = bus1C.seats[i];
    if(transport.isSeatEmpty(bus1C.seats, i)){
        bus1C.totalCustomerPay+=bus1C.customerPay;
        }
    }
    companyC.profit += companyC.calculateProfit(bus1C);
    //
    //Ucak1 icin islemler
    Trip tripPlane1C = new Airway();
    Airway airway1C = (Airway) tripPlane1C;
    Route routePlane1C = new Route();
    tripPlane1C.city = airway1C.getCity1();
    
    companyC.citytogo.add(tripPlane1C.city);
    Personel personel1Plane1C = new Personel("Fırat", "Yılmaz",10000);
    Personel personel2Plane1C = new Personel("Fırat", "Yılmaz",10000);
    Personel personel3Plane1C = new Personel("Fırat", "Yılmaz",6000);
    Personel personel4Plane1C = new Personel("Fırat", "Yılmaz",6000);
    ArrayList<Personel> chosenPersonelListCPlane = new ArrayList<>();
    Plane plane1C = new Plane("1. Ucak",30, tripPlane1C, routePlane1C, 25, 0,"C");
    //routePlane1C.startPoint = routePlane1C.getStartPoint();
    //routePlane1C.endPoint = routePlane1C.getEndPoint();
    //routePlane1C.result = routePlane1C.customerPayAirway(routePlane1C.startPoint, routePlane1C.endPoint);
    plane1C.customerPay = 1200*2; //istanbul-konya-istanbul
    plane1C.distance = 300*2;//istanbul-konya-istanbul
    plane1C.getPersonel(personel1Plane1C, chosenPersonelListCPlane);
    plane1C.getPersonel(personel2Plane1C, chosenPersonelListCPlane);
    plane1C.getPersonel(personel3Plane1C, chosenPersonelListCPlane);
    plane1C.getPersonel(personel4Plane1C, chosenPersonelListCPlane);
    plane1C.chosenPersonelList = chosenPersonelListCPlane;
    for(Personel personel : plane1C.chosenPersonelList){
        plane1C.personelCost += (personel.servicePersonelCost*2);
    }
    //planeC1.distance = planeC1.getDistance();
    //planeC1.customerPay = planeC1.getCustomerPay();
    plane1C.totalfuelCost = plane1C.calculateFuelCost();
    companyC.addPlane(plane1C);
    transport.addVehicle(plane1C, uygunaraclar);
    companyC.addVehicle(bus1C);
    for (int i = 0; i < plane1C.seats.length; i++) {
    int seatIndex = plane1C.seats[i];
    if(transport.isSeatEmpty(plane1C.seats, i)){
        plane1C.totalCustomerPay+=plane1C.customerPay;
        }
    }
    companyC.profit += companyC.calculateProfit(plane1C);
    //
    //Ucak2 icin islemler
    Trip tripPlane2C = new Airway();
    Route routePlane2C = new Route();
    Airway airway2C = (Airway) tripPlane2C;
    tripPlane2C.city = airway2C.getCity1();
    
    companyC.citytogo.add(tripPlane2C.city);
    Personel personel1Plane2C = new Personel("Fırat", "Yılmaz",10000);
    Personel personel2Plane2C = new Personel("Fırat", "Yılmaz",10000);
    Personel personel3Plane2C = new Personel("Fırat", "Yılmaz",6000);
    Personel personel4Plane2C = new Personel("Fırat", "Yılmaz",6000);
    ArrayList<Personel> chosenPersonelListCPlane2 = new ArrayList<>();
    Plane plane2C = new Plane("2. Ucak",30, tripPlane2C, routePlane2C, 25, 0,"C");
    //routePlane2C.startPoint = routePlane2C.getStartPoint();
    //routePlane2C.endPoint = routePlane2C.getEndPoint();
    //routePlane2C.result = routePlane2C.customerPayAirway(routePlane2C.startPoint, routePlane2C.endPoint);
    plane2C.customerPay =1200*2; //istanbul-konya-istanbul 
    plane2C.distance = 300*2;//istanbul-konya-istanbul
    plane2C.getPersonel(personel1Plane2C, chosenPersonelListCPlane2);
    plane2C.getPersonel(personel2Plane2C, chosenPersonelListCPlane2);
    plane2C.getPersonel(personel3Plane2C, chosenPersonelListCPlane2);
    plane2C.getPersonel(personel4Plane2C, chosenPersonelListCPlane2);
    plane2C.chosenPersonelList = chosenPersonelListCPlane2;
    for(Personel personel : plane2C.chosenPersonelList){
        plane2C.personelCost += (personel.servicePersonelCost*2);
    }
    //planeC2.distance = planeC2.getDistance();
    //planeC2.customerPay = planeC2.getCustomerPay();
    plane2C.totalfuelCost = plane2C.calculateFuelCost();
    companyC.addPlane(plane2C);
    transport.addVehicle(plane2C, uygunaraclar);
    companyC.addVehicle(plane2C);
    for (int i = 0; i < plane2C.seats.length; i++) {
    int seatIndex = plane2C.seats[i];
    if(transport.isSeatEmpty(plane2C.seats, i)){
        plane2C.totalCustomerPay+=plane2C.customerPay;
        }
    }
    companyC.profit += companyC.calculateProfit(plane2C);
    //
    
    Company companyD = new Company("companyD", "1234d","D");
    Company.GlobalArrayList.addToGlobalList(companyD);
    //Tren1 icin islemler
    Trip tripD1 = new Railway();
    Route routeD1 = new Route();
    Railway railwayD1 = (Railway) tripD1;
    tripD1.city = railwayD1.getCity1();
    
    companyD.citytogo.add(tripD1.city);
    Personel personel1D1 = new Personel("Fırat", "Yılmaz",2000);
    Personel personel2D1 = new Personel("Fırat", "Yılmaz",2000);
    Personel personel3D1 = new Personel("Fırat", "Yılmaz",1000);
    Personel personel4D1 = new Personel("Fırat", "Yılmaz",1000);
    ArrayList<Personel> chosenPersonelListD1 = new ArrayList<>();
    Train trainD1 = new Train("1. Tren",25, tripD1, routeD1, 3, 0,"D");
    //routeD1.startPoint = routeD1.getStartPoint();
    //routeD1.endPoint = routeD1.getEndPoint();
    //routeD1.result = routeD1.customerPayRailway(routeD1.startPoint, routeD1.endPoint);
    trainD1.customerPay = 250*2;//istanbul-ankara-istanbul
    trainD1.distance = 375*2;//istanbul-ankara-istanbul
    trainD1.getPersonel(personel1D1, chosenPersonelListD1);
    trainD1.getPersonel(personel2D1, chosenPersonelListD1);
    trainD1.getPersonel(personel3D1, chosenPersonelListD1);
    trainD1.getPersonel(personel4D1, chosenPersonelListD1);
    trainD1.chosenPersonelList = chosenPersonelListD1;
    for(Personel personel : trainD1.chosenPersonelList){
        trainD1.personelCost += (personel.servicePersonelCost*2);
    }
    //trainD1.distance = trainD1.getDistance();
    //trainD1.customerPay = trainD1.getCustomerPay();
    trainD1.totalfuelCost=trainD1.calculateFuelCost();
    companyD.addTrain(trainD1);
    transport.addVehicle(trainD1, uygunaraclar);
    companyD.addVehicle(trainD1);
    for (int i = 0; i < trainD1.seats.length; i++) {
    int seatIndex = trainD1.seats[i];
    if(transport.isSeatEmpty(trainD1.seats, i)){
        trainD1.totalCustomerPay+=trainD1.customerPay;
        }
    }
    companyD.profit += companyD.calculateProfit(trainD1);
    //
    //Tren2 icin islemler
    Trip tripD2 = new Railway();
    Route routeD2 = new Route();
    Railway railwayD2 = (Railway) tripD2;
    tripD2.city = railwayD2.getCity2();
    
    companyD.citytogo.add(tripD2.city);
    Personel personel1D2 = new Personel("Fırat", "Yılmaz",2000);
    Personel personel2D2 = new Personel("Fırat", "Yılmaz",2000);
    Personel personel3D2 = new Personel("Fırat", "Yılmaz",1000);
    Personel personel4D2 = new Personel("Fırat", "Yılmaz",1000);
    ArrayList<Personel> chosenPersonelListD2 = new ArrayList<>();
    Train trainD2 = new Train("2. Tren",25, tripD2, routeD2, 3, 0,"D");
    //routeD2.startPoint = routeD2.getStartPoint();
    //routeD2.endPoint = routeD2.getEndPoint();
    //routeD2.result = routeD2.customerPayRailway(routeD2.startPoint, routeD2.endPoint);
    trainD2.customerPay = 300*2; //istanbul-konya-istanbul
    trainD2.distance = 450*2;//istanbul-konya-istanbul
    trainD2.getPersonel(personel1D2, chosenPersonelListD2);
    trainD2.getPersonel(personel2D2, chosenPersonelListD2);
    trainD2.getPersonel(personel3D2, chosenPersonelListD2);
    trainD2.getPersonel(personel4D2, chosenPersonelListD2);
    trainD2.chosenPersonelList = chosenPersonelListD2;
    for(Personel personel : trainD2.chosenPersonelList){
        trainD2.personelCost += (personel.servicePersonelCost*2);
    }
    //trainD2.distance = trainD2.getDistance();
    //trainD2.customerPay = trainD2.getCustomerPay();
    trainD2.totalfuelCost = trainD2.calculateFuelCost();
    companyD.addTrain(trainD2);
    transport.addVehicle(trainD2, uygunaraclar);
    companyD.addVehicle(trainD2);
    for (int i = 0; i < trainD2.seats.length; i++) {
    int seatIndex = trainD2.seats[i];
    if(transport.isSeatEmpty(trainD2.seats, i)){
        trainD2.totalCustomerPay+=trainD2.customerPay;
        }
    }
    companyD.profit += companyD.calculateProfit(trainD2);
    //
    //Tren3 icin islemler
    Trip tripD3 = new Railway();
    Route routeD3 = new Route();
    Railway railwayD3 = (Railway) tripD3;
    tripD3.city = railwayD3.getCity2();
   
    companyD.citytogo.add(tripD3.city);
    Personel personel1D3 = new Personel("Fırat", "Yılmaz",2000);
    Personel personel2D3 = new Personel("Fırat", "Yılmaz",2000);
    Personel personel3D3 = new Personel("Fırat", "Yılmaz",1000);
    Personel personel4D3 = new Personel("Fırat", "Yılmaz",1000);
    ArrayList<Personel> chosenPersonelListD3 = new ArrayList<>();
    Train trainD3 = new Train("3. Tren",25, tripD3, routeD3, 3, 0,"D");
    //routeD3.startPoint = routeD3.getStartPoint();
    //routeD3.endPoint = routeD3.getEndPoint();
    //routeD3.result = routeD3.customerPayRailway(routeD3.startPoint, routeD3.endPoint);
    trainD3.customerPay = 300*2; //istanbul-konya-istanbul
    trainD3.distance = 450*2;//istanbul-konya-istanbul
    trainD3.getPersonel(personel1D3, chosenPersonelListD3);
    trainD3.getPersonel(personel2D3, chosenPersonelListD3);
    trainD3.getPersonel(personel3D3, chosenPersonelListD3);
    trainD3.getPersonel(personel4D3, chosenPersonelListD3);
    trainD3.chosenPersonelList = chosenPersonelListD3;
    for(Personel personel : trainD3.chosenPersonelList){
        trainD3.personelCost += (personel.servicePersonelCost*2);
    }
    //trainD3.distance = trainD3.getDistance();
    //trainD3.customerPay = trainD3.getCustomerPay();
    trainD3.totalfuelCost = trainD3.calculateFuelCost();
    companyD.addTrain(trainD3);
    transport.addVehicle(trainD3, uygunaraclar);
    companyD.addVehicle(trainD3);
    for (int i = 0; i < trainD3.seats.length; i++) {
    int seatIndex = trainD3.seats[i];
    if(transport.isSeatEmpty(trainD3.seats, i)){
        trainD3.totalCustomerPay+=trainD3.customerPay;
        }
    }
    companyD.profit += companyD.calculateProfit(trainD3);
    //
    
    Company companyF = new Company("companyF", "1234f","F");
    Company.GlobalArrayList.addToGlobalList(companyF);
    //Ucak1 icin islemler
    Trip tripF1 = new Airway();
    Route routeF1 = new Route();
    Airway airwayF1 = (Airway) tripF1;
    tripF1.city = airwayF1.getCity2();
    
    companyF.citytogo.add(tripF1.city);
    Personel personel1F1 = new Personel("Fırat", "Yılmaz",7500);
    Personel personel2F1 = new Personel("Fırat", "Yılmaz",7500);
    Personel personel3F1 = new Personel("Fırat", "Yılmaz",4000);
    Personel personel4F1 = new Personel("Fırat", "Yılmaz",4000);
    ArrayList<Personel> chosenPersonelListF1= new ArrayList<>();
    Plane planeF1 = new Plane("1. Ucak",30, tripF1, routeF1, 20, 0,"F");
    //routeF1.startPoint = routeF1.getStartPoint();
    //routeF1.endPoint = routeF1.getEndPoint();
    //routeF1.result = routeF1.customerPayAirway(routeF1.startPoint, routeF1.endPoint);
    planeF1.customerPay = 1000*2; //istanbul-ankara-istanbul
    planeF1.distance = 250*2;//istanbul-ankara-istanbul
    planeF1.getPersonel(personel1F1, chosenPersonelListF1);
    planeF1.getPersonel(personel2F1, chosenPersonelListF1);
    planeF1.getPersonel(personel3F1, chosenPersonelListF1);
    planeF1.getPersonel(personel4F1, chosenPersonelListF1);
    planeF1.chosenPersonelList = chosenPersonelListF1;
    for(Personel personel : planeF1.chosenPersonelList){
        planeF1.personelCost += (personel.servicePersonelCost*2);
    }
    planeF1.totalfuelCost = planeF1.calculateFuelCost();
    companyF.addPlane(planeF1);
    transport.addVehicle(planeF1, uygunaraclar);
    companyF.addVehicle(planeF1);
    for (int i = 0; i < planeF1.seats.length; i++) {
    int seatIndex = planeF1.seats[i];
    if(transport.isSeatEmpty(planeF1.seats, i)){
        planeF1.totalCustomerPay+=planeF1.customerPay;
        }
    }
    companyF.profit += companyF.calculateProfit(planeF1);
    //
    //Ucak2 icin islemler
    Trip tripF2 = new Airway();
    Route routeF2 = new Route();
    Airway airwayF2 = (Airway) tripF2;
    tripF2.city = airwayF2.getCity2();
    
    companyF.citytogo.add(tripF2.city);
    Personel personel1F2 = new Personel("Fırat", "Yılmaz",7500);
    Personel personel2F2 = new Personel("Fırat", "Yılmaz",7500);
    Personel personel3F2 = new Personel("Fırat", "Yılmaz",4000);
    Personel personel4F2 = new Personel("Fırat", "Yılmaz",4000);
    ArrayList<Personel> chosenPersonelListF2= new ArrayList<>();
    Plane planeF2 = new Plane("2. Ucak",30, tripF2, routeF2, 20, 0,"F");
    //routeF2.startPoint = routeF2.getStartPoint();
    //routeF2.endPoint = routeF2.getEndPoint();
    //routeF2.result = routeF2.customerPayAirway(routeF2.startPoint, routeF2.endPoint);
    planeF2.customerPay = 1000*2; //istanbul-ankara-istanbul
    planeF2.distance = 250*2;//istanbul-ankara-istanbul
    planeF2.getPersonel(personel1F2, chosenPersonelListF2);
    planeF2.getPersonel(personel2F2, chosenPersonelListF2);
    planeF2.getPersonel(personel3F2, chosenPersonelListF2);
    planeF2.getPersonel(personel4F2, chosenPersonelListF2);
    planeF2.chosenPersonelList = chosenPersonelListF2;
    for(Personel personel : planeF2.chosenPersonelList){
        planeF2.personelCost += (personel.servicePersonelCost*2);
    }
    planeF2.totalfuelCost = planeF2.calculateFuelCost();
    companyF.addPlane(planeF2);
    transport.addVehicle(planeF2, uygunaraclar);
    companyF.addVehicle(planeF2);
    for (int i = 0; i < planeF2.seats.length; i++) {
    int seatIndex = planeF2.seats[i];
    if(transport.isSeatEmpty(planeF2.seats, i)){
        planeF2.totalCustomerPay+=planeF2.customerPay;
        }
    }
    companyF.profit += companyF.calculateProfit(planeF2);
    //
        /*System.out.println(companyA.companyname);
        System.out.println(companyA.name);
    for(int i = 0; i < Company.GlobalArrayList.getGlobalList().size();i++){
        System.out.println(Company.GlobalArrayList.getGlobalList().get(i).companyname);
    }*/
    for(Company company : Company.GlobalArrayList.getGlobalList()){
      
    }
       
    
        YuklemePaneli yuklemePaneli =new YuklemePaneli();
        yuklemePaneli.setVisible(true);
    }
}
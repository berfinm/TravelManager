

import java.util.ArrayList;

public class Admin extends User {
    static int hizmetbedeli=1000;
    static int tabloyazdirma=0;
  public Admin(String name, String password) {
        super(name="admin", password="1234");
    }

    public static String getName() {
        return "admin";
    }

    public static String getPassword() {
        return "1234";
    }
    
 
    
    public  static int getHizmetbedeli() {
        return hizmetbedeli;
    }

    public static void setHizmetbedeli(int hizmetbedeli) {
        Admin.hizmetbedeli = hizmetbedeli;
    }

    public static int getTabloyazdirma() {
        return tabloyazdirma;
    }

    public static void setTabloyazdirma(int tabloyazdirma) {
        Admin.tabloyazdirma = tabloyazdirma;
    }

    int serviceCost;

  

    public void showCompany() {
        // Metotun implementasyonu
    }

    public void addCompany() {
        // Metotun implementasyonu
    }

    public void deleteCompany() {
        // Metotun implementasyonu
    }

    public int setServiceCost(int serviceCost) {
        return this.serviceCost = serviceCost;
    }
}
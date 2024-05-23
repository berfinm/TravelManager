

import java.util.ArrayList;

abstract class Person {
    String name;
    String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
class Personel extends Person {
    int servicePersonelCost;
   // int userPersonelCost;
    public Personel(String name, String surname,int servicePersonelCost) {
        super(name, surname);
        this.servicePersonelCost = servicePersonelCost;
    }
    
    }

class Passenger extends Person {
    String tckimlik;
    String dogumtarihi;
    public Passenger(String name,String surname, String tckimlik, String dogumtarihi) {
        super(name,surname);
        this.tckimlik = tckimlik;
        this.dogumtarihi=dogumtarihi;
    }
   
    }


public class Route {
    String routeName;
    String startPoint;
    String endPoint;
    int customerPay;
    int distance;
    int [] result;

    public Route(String routeName) {
        this.routeName = routeName;
    }

    public Route() {
    }
    
    String locations = "Istanbul,Kocaeli,Bilecik,Eskisehir,Ankara,Konya";
    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public int[] customerPayHighway(String startPoint, String endPoint) {
        String cityPair = startPoint + "," + endPoint;
        int [] result = new int[2];  // 0. indeks customerPay, 1. indeks distance
        if (cityPair.equals("Istanbul,Kocaeli") || cityPair.equals("Kocaeli,Istanbul")) {
            result[0] = 50;
            result[1] = 100;
        } 
        else if (cityPair.equals("Istanbul,Ankara") || cityPair.equals("Ankara,Istanbul")) {
            result[0] = 300;
            result[1] = 500;
        } 
        else if (cityPair.equals("Istanbul,Eskisehir") || cityPair.equals("Eskisehir,Istanbul")) {
            result[0] = 150;
            result[1] = 300;
        } 
        else if (cityPair.equals("Istanbul,Konya") || cityPair.equals("Konya,Istanbul")) {
            result[0] = 300;
            result[1] = 600;
        } 
        else if (cityPair.equals("Kocaeli,Ankara") || cityPair.equals("Ankara,Kocaeli")) {
            result[0] = 400;
            result[1] = 100;
        } 
        else if (cityPair.equals("Kocaeli,Eskisehir") || cityPair.equals("Eskisehir,Kocaeli")) {
            result[0] = 100;
            result[1] = 200;
        }
        else if (cityPair.equals("Kocaeli,Konya") || cityPair.equals("Konya,Kocaeli")) {
            result[0] = 250;
            result[1] = 500;
        }
        else if (cityPair.equals("Eskisehir,Konya") || cityPair.equals("Konya,Eskisehir")) {
            result[0] = 150;
            result[1] = 300;
        }
        return result;
    }
    public int[] customerPayAirway(String startPoint, String endPoint) {
        String cityPair = startPoint + "," + endPoint;
         int[] result = new int[2];// 0. indeks customerPay, 1. indeks distance

        if (cityPair.equals("Istanbul,Ankara") || cityPair.equals("Ankara,Istanbul")) {
            result[0] = 1000; 
            result[1] = 250; 
        } 
        else if (cityPair.equals("Istanbul,Konya") || cityPair.equals("Konya,Istanbul")) {
            result[0] = 1200;
            result[1] = 300;
        }
        return result;
    }
    
    public int[] customerPayRailway(String startPoint, String endPoint) {
        String cityPair = startPoint + "," + endPoint;
        int[] result = new int[2];
        
        if (cityPair.equals("Istanbul,Kocaeli") || cityPair.equals("Kocaeli,Istanbul")) {
            result[0] = 50;
            result[1] = 75;
        } 
        else if (cityPair.equals("Istanbul,Bilecik") || cityPair.equals("Bilecik,Istanbul")) {
            result[0] = 150;
            result[1] = 225;
        }
        else if (cityPair.equals("Istanbul,Ankara") || cityPair.equals("Ankara,Istanbul")) {
            result[0] = 250;
            result[1] = 375;
        } 
        else if (cityPair.equals("Istanbul,Eskisehir") || cityPair.equals("Eskisehir,Istanbul")) {
            result[0] = 200;
            result[1] = 300;
        } 
        else if (cityPair.equals("Istanbul,Konya") || cityPair.equals("Konya,Istanbul")) {
            result[0] = 300;
            result[1] = 400;
        }
        else if (cityPair.equals("Kocaeli,Bilecik") || cityPair.equals("Bilecik,Kocaeli")) {
            result[0] = 50;
            result[1] = 75;
        }
        else if (cityPair.equals("Kocaeli,Ankara") || cityPair.equals("Ankara,Kocaeli")) {
            result[0] = 200;
            result[1] = 300;
        } 
        else if (cityPair.equals("Kocaeli,Eskisehir") || cityPair.equals("Eskisehir,Kocaeli")) {
            result[0] = 100;
            result[1] = 150;
        } 
        else if (cityPair.equals("Kocaeli,Konya") || cityPair.equals("Ankara,Konya")) {
            result[0] = 250;
            result[1] = 350;
        }
        else if (cityPair.equals("Bilecik,Ankara") || cityPair.equals("Ankara,Bilecik")) {
            result[0] = 150;
            result[1] = 225;
        }
        else if (cityPair.equals("Bilecik,Eskisehir") || cityPair.equals("Eskisehir,Bilecik")) {
            result[0] = 50;
            result[1] = 75;
        }
        else if (cityPair.equals("Bilecik,Konya") || cityPair.equals("Konya,Bilecik")) {
            result[0] = 200;
            result[1] = 300;
        }
        else if (cityPair.equals("Eskisehir,Ankara") || cityPair.equals("Ankara,Eskisehir")) {
            result[0] = 100;
            result[1] = 150;
        }
        else if (cityPair.equals("Eskisehir,Konya") || cityPair.equals("Konya,Eskisehir")) {
            result[0] = 150;
            result[1] = 225;
        }

        return result;
    }
    
    
    
    
    
}
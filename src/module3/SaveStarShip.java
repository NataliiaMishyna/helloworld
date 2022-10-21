package module3;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    public int calculateDistance(int distance){
        if (distance > 0) {
            return distance;
        } else{
            return distance * -1;
        }
    }

    public String[] getPlanets(String galaxy){
        if (galaxy.equals("Miaru")){
            String[] masPlanets = {"Maux", "Reux", "Piax"};
            return masPlanets;
        } else if (galaxy.equals("Milkyway")){
            String[] masPlanets =  {"Earth", "Mars", "Jupiter"};
            return masPlanets;
        } else if (galaxy.equals("DangerBanger")){
            String[] masPlanets =  {"Fobius", "Demius"};
            return masPlanets;
        } else{
            String[] masPlanets =  new String[0];
            return masPlanets;
        }
    }

    public String choosePlanet(long distanceToEarth){
        if (distanceToEarth < 45677){
            return "Earth";
        }else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count){
        int summa;
        switch (fuel){
            case "STAR100":
                summa = 70 * count;
                break;
            case "STAR500":
                summa = 120 * count;
                break;
            case "STAR1000":
                summa = 200 * count;
                break;
            default:
                summa = 50 * count;
        }
        return summa;
    }

    public int roundSpeed(int speed){
       int chislo = speed%10;
       if (chislo < 5){
           return speed - chislo;
       } else {
           return speed - chislo + 10;
       }

    }

    public int calculateNeededFuel(int distance){
        int pal;
        if (distance <= 20){
            pal = 1000;
        } else{
            pal = 1000 + (distance - 20) * 5;
        }
        return pal;
    }

    public void calculateMaxPower(){
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int d3 = in.nextInt();
        in.close();
        int max;
        max = d2 > d1 ? d2 : d1;
        max = max > d3 ? max : d3;

        if (max < 10) {
            System.out.println(max * 0.7f);
        } else if (max > 10 && max <= 100){
            System.out.println(max * 1.2f);
        }else{
            System.out.println(max * 2.1f);
        }
    }

    public String getMyPrizes(int ticket){
        String prise = "";
        String prise1 = "";
        String prise2 = "";
        String prise3 = "";

        if (ticket % 10 == 0){
            prise1 = "crystall";
        }
        if (ticket % 10 == 7) {
            prise2 = "chip";
        }
        if (ticket > 200){
            prise3 = "coin";
        }
        prise = String.join(" ", prise1, prise2, prise3);
        return prise.strip().replace("  ", " ");
    }

    public boolean isHangarOk(int side1,int side2,int price){
        int max;
        int min;
        boolean ok1 = false;
        boolean ok2 = false;
        boolean ok3 = false;

        if (side1 > side2){
            max = side1;
            min = side2;
        }else {
            max = side2;
            min = side1;
        }
        int Square = max * min;
        if (Square > 1500){
            ok1 = true;
        }
        if (max / 2 <= min){
            ok2 = true;
        }
        if (price / Square < 1000){
            ok3 = true;
        }
        return ok1 & ok2 & ok3;
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        //ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(47, 94, 1418178));

    }

}

package module5.class25;

public class PlanetTester {
    public String test(SpaceObject object){
        String notPlanet = "Moon";
        boolean bNotPlanet = true;
        if (object instanceof Moon){
            return "not planet";
        }
        return "planet";
    }

    public static void main(String[] args){
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be true
        System.out.println(tester.test(new Moon())); //Should be false
    }
}

package nyc.c4q.ac21;

import java.util.HashMap;

/**
 * Created by July on 3/29/15.
 */
public class MoonsAndPlanets {
    public static void main(String[] args) {

        System.out.println(getNumberOfMoons("TExas"));
        System.out.println(isPlanet("Marss"));
    }

    public static HashMap<String, Integer> getNumberOfMoons() {
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();

        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Earth", 1);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);
        numberOfMoons.put("Neptune", 14);

        return numberOfMoons;
    }

    public static int getNumberOfMoons (String name) {
        Integer number = getNumberOfMoons().get(name);
        if ( number == null) {
            System.err.println("This is a planet!");
            return -1;
        }
        return number;
    }

    public static boolean isPlanet(String name) {
        return (getNumberOfMoons().get(name)!= null);
    }
}

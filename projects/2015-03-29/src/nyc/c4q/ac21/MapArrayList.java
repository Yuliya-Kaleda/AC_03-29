package nyc.c4q.ac21;

/**
 * Created by July on 3/29/15.
 */
 import java.util.ArrayList;
import java.util.HashMap;

public class MapArrayList {
    public static void main (String[] args){
        ArrayList<String> words = new ArrayList<String>();
        words.add("banana");
        words.add("pineapple");
        words.add("cantaloupe");

        HashMap<String, Integer> lengths = getLengths(words);
        System.out.println(getLengths(words));
    }

    public static HashMap<String, Integer> getLengths(ArrayList<String> strings) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String n : strings) {
            result.put(n, n.length());
        }
        return result;
    }
}

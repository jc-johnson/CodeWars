package src.main.java.Welcome;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JJOHN on 7/2/2017.
 */
public class Solution {

    public static String greet(String language){
        // your code


        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("english", "Welcome");
        dictionary.put("czech", "Vitejte");
        dictionary.put("danish", "Velkomst");
        dictionary.put("dutch","Welkom");
        dictionary.put("estonian", "Tere tulemast");
        dictionary.put("finnish", "Tervetuloa");
        dictionary.put("flemish", "Welgekomen");
        dictionary.put("french", "Bienvenue");
        dictionary.put("german", "Willkommen");
        dictionary.put("irish", "Failte");
        dictionary.put("italian", "Benvenuto");
        dictionary.put("latvian", "Gaidits");
        dictionary.put("lithuanian", "Laukiamas");
        dictionary.put("polish", "Witamy");
        dictionary.put("spanish","Bienvenido");
        dictionary.put("swedish", "Valkommen");
        dictionary.put("welsh", "Croeso");

        if (dictionary.containsKey(language)) {
            return dictionary.get(language);
        }

        else return dictionary.get("english");

    }
}

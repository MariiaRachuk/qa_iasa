package qa_iasa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class Task2 {

    private static char changeCase(char c){
        return (Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
    }

    public static String firstNonRepeatingLetter(String string){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        string
            .chars()
            .mapToObj(i -> (char)i)
            .forEach(c -> {
                map.put(c,map.getOrDefault(c,0)+1);
                char C = changeCase(c);
                map.put(C,map.getOrDefault(C,0)+1);
            });
        return map
            .entrySet()
            .stream()
            .filter(e->e.getValue()==1)
            .findFirst()
            .map(c -> c.getKey() + "")
            .orElse("");
    }

}
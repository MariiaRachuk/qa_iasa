package qa_iasa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {

    public static String meeting(String s){
        return Arrays
            .stream(s.toUpperCase().split(";"))
            .map(pair->String.format("(%2$s, %1$s)", (Object[]) pair.split(":")))
            .sorted(Comparator.naturalOrder())
            .reduce("",String::concat)
        ;
    }

}
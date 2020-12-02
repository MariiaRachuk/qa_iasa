package qa_iasa;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<Integer> getIntegerFromList(List<Object> list){
        return list
            .stream()
            .filter(o -> o instanceof Integer)
            .map(o -> (Integer) o)
            .collect(Collectors.toList());
    }

}
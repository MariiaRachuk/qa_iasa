package qa_iasa;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task4 {

    public static int countNumberOfPairs_Stream(int[] numbers,int target){
        return IntStream
            .of(numbers)
            .map(n-> (int) IntStream.of(numbers).filter(i->i+n==target).count())
            .sum()/2
        ;
    }

    public static int countNumberOfPairs_ForLoop(int[] numbers,int target){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                sum+=(numbers[i]+numbers[j]==target ? 1 : 0);
            }
        }
        return sum/2;
    }

}
package qa_iasa;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static qa_iasa.Task4.*;

class Task4Test {

    private static int countNumberOfPairs(int[] numbers,int target,String version){
        switch (version){
            case "stream": return countNumberOfPairs_Stream(numbers,target);
            case "forloop": return countNumberOfPairs_ForLoop(numbers,target);
            default: return -1;
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"stream","forloop"})
    public void Should_ReturnTotalCountOfPairsTheSumOfWhichGiveTarget_When_ArrayOfAnyNumbersAndAnyTargetNumberIsPassed(String version){
        assertEquals(1,countNumberOfPairs(new int[]{2,2},4,version));
        assertEquals(0,countNumberOfPairs(new int[]{1,1,1,1},7,version));
        assertEquals(5,countNumberOfPairs(new int[]{4,3,8,4,4,0,4,5},8,version));
    }
}
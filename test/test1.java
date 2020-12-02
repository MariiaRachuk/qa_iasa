package qa_iasa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static qa_iasa.Task1.getIntegerFromList;

class Test1 {

    @Test
    public void Should_ReturnListOfIntegers_When_ListOfIntegersAndStringsIsPassed(){
        assertIterableEquals(Arrays.asList(3,5), getIntegerFromList(Arrays.asList(3,5,"a","b")));
        assertIterableEquals(Arrays.asList(4,6,88,15), getIntegerFromList(Arrays.asList(4,6,"a","b",88,15)));
        assertIterableEquals(Arrays.asList(1,2,567), getIntegerFromList(Arrays.asList(1,2,"a","b","aasf","1","123",567)));
    }
}
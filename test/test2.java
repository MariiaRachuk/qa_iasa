package qa_iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static qa_iasa.Task2.firstNonRepeatingLetter;

class Test2 {

    @Test
    public void Should_ReturnTheFirstCharThatIsNotRepeatedInTheString_When_StringIsPassed(){
        assertEquals("t",firstNonRepeatingLetter("stress"));
        assertEquals("T",firstNonRepeatingLetter("sTreSS"));
        assertEquals("",firstNonRepeatingLetter("SSTTKK"));

    }

}
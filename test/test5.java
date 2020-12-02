package qa_iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static qa_iasa.Task5.meeting;

class Task5Test {

    @Test
    public void Should_ReturnAlphabeticallyOrderedStringOfNameSurnamePairs_When_UnorderedStringIsPassed(){
        assertEquals(
            "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)",
            meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill")
        );
    }
}
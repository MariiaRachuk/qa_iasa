package qa_iasa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static qa_iasa.Task3.digitalRoot;

class Test3 {

    @Test
    public void Should_ReturnDigitalRootOfNumber_When_NonNegativeValueIsPassed(){
        assertEquals(7,digitalRoot(16));
        assertEquals(6,digitalRoot(123));
        assertEquals(3,digitalRoot(123123));
    }

}
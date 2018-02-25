import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzTest() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(27));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(81));
    }

    @Test
    public void buzzTest() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(85));
    }

    @Test
    public void fizzBuzzTest() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
    }
}

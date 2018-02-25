import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void recursiveTest() {
        assertEquals(0, Fibonacci.fibonacciRecursive(0));
        assertEquals(1, Fibonacci.fibonacciRecursive(1));
        assertEquals(1, Fibonacci.fibonacciRecursive(2));
        assertEquals(13, Fibonacci.fibonacciRecursive(7));
        assertEquals(55, Fibonacci.fibonacciRecursive(10));
        assertEquals(144, Fibonacci.fibonacciRecursive(12));
    }

    @Test
    public void fibonacciTest() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(55, Fibonacci.fibonacci(10));
        assertEquals(144, Fibonacci.fibonacci(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentTest() {
        Fibonacci.fibonacciRecursive(-5);
        Fibonacci.fibonacci(-10);
    }
}

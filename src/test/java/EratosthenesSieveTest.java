import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EratosthenesSieveTest {
    @Test
    public void eratosthenesSieveTest1() {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        assertEquals(expectedResult, EratosthenesSieve.eratosthenesSieve(7));
    }

    @Test
    public void eratosthenesSieveTest2() {
        List<Integer> expectedResult = new ArrayList<>();
        Integer[] arrayResult = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        expectedResult.addAll(Arrays.asList(arrayResult));
        assertEquals(expectedResult, EratosthenesSieve.eratosthenesSieve(100));

    }

    @Test
    public void eratosthenesSieveTest3() {
        List<Integer> expectedResult = new ArrayList<>();
        Integer[] arrayResult = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        expectedResult.addAll(Arrays.asList(arrayResult));
        assertEquals(expectedResult, EratosthenesSieve.eratosthenesSieve(203));
    }

    @Test
    public void eratosthenesSieveTest4() {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        assertEquals(expectedResult, EratosthenesSieve.eratosthenesSieve(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentTest() {
        EratosthenesSieve.eratosthenesSieve(1);
        EratosthenesSieve.eratosthenesSieve(0);
        EratosthenesSieve.eratosthenesSieve(-10);
    }
}

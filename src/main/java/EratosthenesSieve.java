import java.util.ArrayList;
import java.util.List;

public class EratosthenesSieve {

    public static List eratosthenesSieve(int range) {
        if (range < 2) {
            throw new IllegalArgumentException("Range must be greater than 1");
        }

        boolean[] sieveArray = new boolean[range + 1];

        for (int i = 0; i < sieveArray.length; i++) {
            if (i == 0 || i == 1) {
                sieveArray[i] = false;
            } else {
                sieveArray[i] = true;
            }
        }

        for (int i = 0; i < Math.sqrt(sieveArray.length); i++) {
            if (sieveArray[i] == true) {
                for (int j = i + i; j < sieveArray.length; j = j + i) {
                    sieveArray[j] = false;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sieveArray.length; i++) {
            if (sieveArray[i] == true) {
                result.add(i);
            }
        }
        return result;
    }
}

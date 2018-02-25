public class FizzBuzz {
    public static String fizzBuzz(int number) {

        StringBuilder stringBuilder = new StringBuilder();

        if (isDivisible(number, 3))
            stringBuilder.append("Fizz");
        if (isDivisible(number, 5))
            stringBuilder.append("Buzz");
        if (stringBuilder.length() == 0)
            stringBuilder.append(number);

        return stringBuilder.toString();
    }


    public static boolean isDivisible(int dividend, int divider) {
        return dividend % divider == 0;
    }
}

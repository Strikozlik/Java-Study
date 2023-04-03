import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        return (calculateList(a, b));
    }

    private static List<Long> calculateList(long a, long b) {
        List<Long> resultList = new ArrayList<Long>();
        for (long i = a; i < b; i++) {
            if (isEureka(i)) {
                resultList.add(i);
            }
        }
        return (resultList);
    }

    private static boolean isEureka(long number) {
        String longString = String.valueOf(number);
        long sum = 0;
        for (int i = 0; i < longString.length(); i++) {
            long digit = Long.parseLong(String.valueOf(longString.charAt(i)));
            sum += Math.pow(digit, i+1);
        }
        return (sum == number);
    }


}
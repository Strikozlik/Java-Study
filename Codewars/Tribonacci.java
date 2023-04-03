package Codewars;

import java.util.Arrays;

public class Tribonacci {
    public static double[] tribonaci(double[] s, int n) {
        if (n == 0) {
            return new double[0];
        }
        double[] res = new double[n];
        if (n < s.length) {
            for (int i = 0; i < n; i++) {
                res[i] = s[i];
            }
            }else
            for (int i = 0; i < s.length; i++) {
                res[i] = s[i];
            }


        for (int i = s.length; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];

        }
        return res;
    }

    public static void main(String[] args) {
        double[] test = {20, 12, 7};

        System.out.println(Arrays.toString(tribonaci(test, 1)));
    }
}

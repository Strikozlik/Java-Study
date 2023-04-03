package Codewars;

import java.util.Arrays;

public class CatDogYears {
    public static  int [] humanYearsCarYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            return new int[]{humanYears, 15, 15};
        }
        if (humanYears == 2) {
            return new int[]{humanYears, 15 + 9, 15 + 9};
        }
        if (humanYears > 3) {
            return new int[]{humanYears, 15 + 9 + (humanYears - 2) * 4, 15 + 9 + (humanYears - 2) * 5};
        }return new int[]{0, 0, 0};
    }

    public static void main(String[] args) {
        String s = Arrays.toString(humanYearsCarYearsDogYears(4));
        System.out.println(s);
    }
}

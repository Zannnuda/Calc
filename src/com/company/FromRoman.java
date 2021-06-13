package com.company;

public class FromRoman {


    public FromRoman(String n) {
    }
    public static int fromRoman(String n) {
        int result = 0;
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < decimal.length; i++) {
            while (n.indexOf(roman[i]) == 0) {
                result += decimal[i];
                n = n.substring(roman[i].length());
            }
        }
        //System.out.println(result);
        return result;
    }
}


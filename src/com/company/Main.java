package com.company;

import java.util.Scanner;

import static com.company.ToRoman.integerToRomanNumeral;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите арифметическое выражение из двух чисел: ");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt())

        {
            int a = sc.nextInt();

            String operator = sc.next();

            int b = 0;
            try {
                b = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Введите либо два арабских, либо два римских числа!");
                System.exit(1);
            }

            switch (operator) {
                case "+":
                    a += b;
                    break;
                case "-":
                    a -= b;
                    break;
                case "*":
                    a *= b;
                    break;
                case "/":
                    a /= b;
                    break;
            }
            System.out.println("Результат  = " +  a);

        }
        else {
            String s = sc.next();
            int a = FromRoman.fromRoman(s);

            String operator = sc.next();
            if (!sc.hasNextInt()) {
                String b2 = sc.next();
                int b = FromRoman.fromRoman(b2);

                switch (operator) {
                    case "+":
                        a += b;
                        break;
                    case "-":
                        a -= b;
                        break;
                    case "*":
                        a *= b;
                        break;
                    case "/":
                        a /= b;
                        break;
                }
                System.out.println("Результат = " + ToRoman.integerToRomanNumeral(a));
            } else
                System.out.println("Введите либо два арабских, либо два римских числа!");




        }

        sc.close();


    }

}

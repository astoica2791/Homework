package com.lseg.Homework5;

import java.util.Scanner;

public class Homework5 {

        public static void main(String[] args) {
            //ex2();
            //ex3();
            ex4();

        }

        public static void ex2() {
            int pozitive = 0;
            int negative = 0;
            int zero = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Introduceti numarul");
                int numarCitit = scanner.nextInt();
                if (numarCitit == -5) {
                    System.out.println("Ati introdus -5 --> exit program");
                    break;
                }

                if (numarCitit < 0) {
                    negative++;
                } else if (numarCitit > 0) {
                    pozitive++;
                } else zero++;
            }
            System.out.println("Numarul de numere negative introduse este " + negative);
            System.out.println("Numarul de numere pozitive introduse este " + pozitive);
            System.out.println("Numarul de numere nule introduse este " + zero);
        }

        public static void ex3(){
            System.out.println("Rezultatul functiei sin este " + sin(1, 9));
        }

        public static long sin(int x, int n) {
            long rezultat = x;
            for (int i = 3, semn = 0; i <= n; i = i + 2, semn++) {
                rezultat += (semn % 2 == 0 ? -1 : 1) * putere(x, i) / factorial(i);
            }
            return rezultat;
        }

        public static long factorial(int number) {
            long result = 1;

            for (int factor = 2; factor <= number; factor++) {
                result *= factor;
            }

            return result;
        }

        public static long putere(int baza, int exponent) {
            long result = 1;

            while (exponent != 0) {
                result *= baza;
                exponent--;
            }
            return result;
        }

    public static void ex4() {
        int start = 2;
        int end = 12;
        int divisor = 2;

        System.out.println("Suma numerelor divizibile cu " + divisor + " din intervalul [" + start + "," + end + "]  este " + rangeSum(start, end, divisor));

    }

    public static int rangeSum(int start, int end, int divisor) {
        if (end < start || end <= 0 || start <= 0) {
            return -1;
        }
        int sum = 0;
        int i = start;
        while(i<=end){
            if (isDivisible(i, divisor)) {
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }

    public static boolean isDivisible(int number, int divisor) {
        if (number <= 0) {
            return false;
        }
        return number % divisor == 0;
    }



}

package com.lseg;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        //ex1for();

        //ex2for();

        //ex3for();

        //ex4for();

        //ex5for();

        //ex6for();

        ex7for();

        //ex8for();

        //ex7while();

        //ex3while();

        //ex1switch();


    }

    public static void ex1for() {
        System.out.println("Exercitiul 1 FOR");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ex2Ffor() {
        System.out.println("Exercitiul 2 FOR");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void ex3for() {
        System.out.println("Exercitiul 3 FOR");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i == j - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void ex4for() {
        System.out.println("Exercitiul 4 FOR");
        int n = 10;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (j + i == n - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void ex5for() {
        System.out.println("Exercitiul 5 FOR");
        System.out.println(9 / 10);
        System.out.println(22 / 2);
        System.out.println(2222 / 10);
        System.out.println(33333 / 10);
        System.out.println(88 / 2);
        System.out.println(10 / 2);
    }

    public static void ex6for() {
        System.out.println("Exercitiul 6 FOR");
        System.out.println(111111 / 10);
        System.out.println(4444 / 2);
        System.out.println(666 / 2);
        System.out.println(88 / 2);
        System.out.println(16 / 3);
    }

    public static void ex7for() {
        System.out.println("Exercitiul 7 FOR");
        int n = 10;
        int[] SirNumerePrime = new int[n];
        int CateNumerePrimeAmGasit = 0;

        for (int i = 1; i <= n; i++) {

            boolean numarulEPrim = true;

            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    numarulEPrim = false;
                    break;
                }
            }

            if (numarulEPrim) {
                SirNumerePrime[CateNumerePrimeAmGasit] = i;
                CateNumerePrimeAmGasit++;
            }


        }
        for (int i = 0; i <= CateNumerePrimeAmGasit - 1; i++) {
            System.out.print(SirNumerePrime[i] + " ");
        }

    }

    public static void ex8for() {
        System.out.println("Exercitiul 8 FOR");
        int n = 5;
        int[] arr = {5, 3, 7, 4, 2};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }

    public static void ex3while() {
        System.out.println("Exercitiul 3 While");
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduceti numarul");
            int numarCitit = scanner.nextInt();
            if (numarCitit == 0) {
                System.out.println("Ati introdus 0 --> exit program");
                break;
            }

            sum = sum + numarCitit;
            System.out.println("Suma este " + sum);
        }
    }
    public static void ex7while() {
        System.out.println("Exercitiul 7 While");
        int pin = 1234;
        int attempt = 0;
        int incercarimaxime = 3;
        Scanner scanner = new Scanner(System.in);
        while (attempt < incercarimaxime) {
            System.out.println("Introduceti PIN-ul");
            int numarCitit = scanner.nextInt();
            if (numarCitit == pin) {
                System.out.println("PIN corect");
                break;
            } else {
                attempt++;
                System.out.println("PIN gresit - mai aveti " + (incercarimaxime - attempt) + " incercari");
            }
        }
    }
    public static void ex1switch() {
        System.out.println("Exercitiul 1 Switch");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Introduceti o cifra");
        switch(scanner.nextInt()){
            case 0:
                System.out.println("Ziua este duminica");
                break;
            case 1:
                System.out.println("Ziua este luni");
                break;
            case 2:
                System.out.println("Ziua este marti");
                break;
            case 3:
                System.out.println("Ziua este miercuri");
                break;
            case 4:
                System.out.println("Ziua este joi");
                break;
            case 5:
                System.out.println("Ziua este vineri");
                break;
            case 6:
                System.out.println("Ziua este sambata");
                break;
            default: System.out.println ("Out of range");
        }
    }

}













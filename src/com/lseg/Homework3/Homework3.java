package com.lseg.Homework3;

public class Homework3 {


    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();

    }

    public static void ex1() {
        System.out.println("The converted value of 13.78 miles/h is " + convertToKilometersPerHour(13.78) + " km/h");
    }

    public static double convertToKilometersPerHour(double milesPerHour) {
        double kmInAMile = 1.609344;

        return kmInAMile * milesPerHour;
    }

    public static void ex2() {
        System.out.println("shouldWakeUp(true, 10)=" + shouldWakeUp(true, 10));
    }

    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour > 24 || hour < 0) {
            System.out.println("Formatul orei este gresit");
            return false;
        }

        if (hour < 8 || hour > 22) {
            return barking == true;
        } else return false;

    }

    public static void ex3() {
        int year = 1896;
        System.out.println("Anul " + year + " este bisect? " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void ex4() {
        System.out.println("Is the cat playing? " + isCatPlaying(true, 40));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25) {
            if (summer == true && temperature <= 45) {
                return true;
            } else {
                if (temperature <= 35) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


}



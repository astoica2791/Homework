package com.lseg.primitives;

public class Operators {

    public static void main(String[] args) {
        //--, ++
        int a = 5;
//      System.out.println(++a); //6
        System.out.println(a++); //5
        System.out.println(a);//6
        a++;
        ++a;
        System.out.println("a = " + a);

        //a=8
        boolean result = a++ > 8 && --a < 7 - 2; //a --> 9
        System.out.println("a after evaluate:  (a++ > 8) && (--a < 7) --> " + a);
        a = 8;
        boolean result1 = (a++ > 8) || (--a < 7); //a --> 8
        System.out.println("a after evaluate:  (a++ > 8) || (--a < 7) --> " + a);
        System.out.println("result = " + result);
        System.out.println("negated result = " + (!result));

//      ref!=null && ref.metoda()

        boolean test = a == 8;
        System.out.println("test = " + test);
        System.out.println("test = " + test);

    }
}

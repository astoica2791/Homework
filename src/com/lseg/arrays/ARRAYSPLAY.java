package com.lseg.arrays;

public class ARRAYSPLAY {
    public static void main(String[] args) {

            int d = 7;
            int[] lista = {1,2,3,4,5};
            int dif = d%lista.length;
            for (int i=dif; i<lista.length;i++){
                System.out.print(lista[i]+" ");
            }
            for(int j=0;j<dif;j++){
                System.out.print(lista[j]+" ");
            }

            ex2();

    }


    public static void ex2() {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;

        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.println(intArray[i] + ", ");

        }
    }
}

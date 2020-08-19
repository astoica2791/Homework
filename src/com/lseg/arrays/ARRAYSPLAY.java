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


    }
}

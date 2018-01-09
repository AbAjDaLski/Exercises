package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {


    public static void main(String[] args) {


        System.out.println("    " + Arrays.toString(fillin(15)) + "    ");
        System.out.println("after Sieve");
        System.out.println(" " + Arrays.toString(sieve(15)));

    }

    public static int[] sieve(int maximumNumber) {
        int index =0;
        int a, sqrt;
        int[] tab = new int[maximumNumber + 1];
        sqrt = (int) Math.sqrt(maximumNumber);
        while (tab[index]<=sqrt){
            for (int i = index+1; i<tab.length; i++){
                if(tab[i]%tab[index]==0) tab[i]=0;
            }
            do {
                index++;
            }while (tab[index]==0);

        }

        return tab;
    }

    public static int[] fillin(int maximumNumber) {
        int startNumber = 2;
        int t[] = new int[maximumNumber - startNumber + 1];
        for (int i = 0; i < t.length; i++) {
            t[i] = startNumber + i;

        }
        return t;
    }

}

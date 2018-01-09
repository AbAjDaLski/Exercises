package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {


    public static void main(String[] args) {
        System.out.println(" " + sieve(10));
    }

    public static int[] sieve(int maximumNumber) {
        int startNumber = 2;
        int t[] = new int[maximumNumber - startNumber+1];
        for (int i = 0; i < t.length; i++) {
            t[i] = startNumber + i;
        }
        System.out.println(" " + Arrays.toString(t));
        System.out.println("***********************");
        int index = 0;
        while (t[index] + t[index] <= maximumNumber) {
            for (int i = index + 1; i < t.length; i++) {
                if (t[i] % t[index] == 0) t[i] = 0;
            }
            do {
                index++;
             System.out.println(" " + Arrays.toString(t));
            } while (t[index] == 0);

        }
        return t;
    }

}

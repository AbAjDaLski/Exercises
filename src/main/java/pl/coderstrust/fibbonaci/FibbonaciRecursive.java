package pl.coderstrust.fibbonaci;

public class FibbonaciRecursive {

    static long fibbonaci(int fibbonaciNumberInOrder) {
        if (fibbonaciNumberInOrder == 0) {
            return 0;
        }
        if (fibbonaciNumberInOrder == 1) {
            return 1;
        }
        return fibbonaci(fibbonaciNumberInOrder - 2) + fibbonaci(fibbonaciNumberInOrder - 1);
    }

}


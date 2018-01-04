package pl.coderstrust.fibbonaci;

public class FibbonaciInterative {

    public long fibbonaci(int fibbonaciNumberInOrder) {
        long F1 = 0;
        long F2 = 1;
        long F3 = 0;
        if(fibbonaciNumberInOrder<=1){
            return fibbonaciNumberInOrder;
        }
        for (int i = 1; i < fibbonaciNumberInOrder; i++) {
            F3 = F1 + F2;
            F1 = F2;
            F2 = F3;
        }
        return F3;
    }
}

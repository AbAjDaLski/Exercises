package pl.coderstrust.isFibbonaci;

import java.util.HashSet;
import java.util.Set;

public class FibonacciChecker {
    Set<Long> setFibbonaci = new HashSet<>();

    public FibonacciChecker() {
        this.setFibbonaci = preCalculateSet();
    }

    public boolean isFibonacciNumber(long number) {
        return setFibbonaci.contains(number);
    }

    private Set<Long> preCalculateSet() {
        long F1 = 0;
        long F2 = 1;
        long F3 = 1;

        setFibbonaci.add(F1);
        setFibbonaci.add(F2);

        for (long i = 0L; i < Long.MAX_VALUE; i++) {
            if(F3>0){
                F3 = F1 + F2;
                F1 = F2;
                F2 = F3;
                setFibbonaci.add(F3);
            } else break;
        }
        return setFibbonaci;
    }
}


package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("SelectionSort"); //ss
        Integer[] numbers = {5, 9, 1, 13, 45, 17};   // initiale array
        Integer[] results = insort(numbers);
        System.out.println("results : ");
        System.out.println(Arrays.toString(results));
    }

    public static Integer[] insort(Integer[] numToSort) {
        for (int i = 1; i < numToSort.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numToSort[j - 1] > numToSort[j]) {
                    Integer temporary = numToSort[j];
                    numToSort[j] = numToSort[j - 1];
                    numToSort[j - 1] = temporary;
                }
            }
        }
            return numToSort;
    }
}


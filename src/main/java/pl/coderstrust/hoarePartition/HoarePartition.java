package pl.coderstrust.hoarePartition;

public class HoarePartition {

    public static int partition(int[] items, int firstIndex, int lastIndex) {
        int leftSide = firstIndex;
        int rightSide = lastIndex - 1;
        int pivot = items[lastIndex];
        System.out.println("Pivot is: " + pivot + " position pivot is " + lastIndex);

        while (leftSide < rightSide) {
            while (leftSide <= rightSide && items[leftSide] < pivot) {
                ++leftSide;
            }
            while (leftSide <= rightSide && items[rightSide] > pivot) {
                --rightSide;
            }
            if (leftSide < rightSide) {
                int temp_item = items[leftSide];
                items[leftSide] = items[rightSide];
                items[rightSide] = temp_item;
                System.out.println("Swapped: " + items[leftSide] + " with " + items[rightSide]);
            }
        }

        //new position pivot
        if (items[leftSide] > pivot) {
            int temp_item = items[leftSide];
            items[leftSide] = pivot;
            items[lastIndex] = temp_item;
        }
        return leftSide;
    }
}
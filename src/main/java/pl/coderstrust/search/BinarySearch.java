package pl.coderstrust.search;

public class BinarySearch {

    private int couter;

    public static int search(int[] array, int element) {
        int couter = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (lastIndex >= firstIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;
            if (array[middleIndex] == element) {
                return middleIndex;
            } else if (array[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > element) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arrayTest = new int[200];
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = i + 1;
            System.out.println("Element " + i + " " + arrayTest[i] + " ");
        }
        System.out.println(search(arrayTest, 5));

    }
}

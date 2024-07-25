package Type_1_ComparisonBasedSortingAlgorithms;

public class T_2_SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minDigitIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minDigitIndex]) {
                    minDigitIndex = j;
                }
            }

            swap(arr, i, minDigitIndex);
        }

        return arr;
    }

    public static int[] selectionSort(int[] arr, boolean ascending) {
        int[] sortedArray = selectionSort(arr);

        if (ascending) {
            return arr;
        }

        return reverseInEfficientWay(arr);
    }

    private static int[] reverseInEfficientWay(int[] integerArray) {
        for (int i = 0; i < integerArray.length/2; i++) {
            swap(integerArray, i, integerArray.length - i - 1);
        }

        return integerArray;
    }

    private static int[] swap(int[] array, int firstDigitIndex, int secondDigitIndex) {
        int temp = array[firstDigitIndex];
        array[firstDigitIndex] = array[secondDigitIndex];
        array[secondDigitIndex] = temp;

        return array;
    }

    private static void printArray(int[] arr) {
        System.out.println("*** printing array ***");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 9, 8,7,6,5,4,3,2,1 };
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
        selectionSort(arr, false);
        printArray(arr);

    }
}

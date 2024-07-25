package Type_1_ComparisonBasedSortingAlgorithms;

public class T_3_InsertionSort {

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i + 1;

            while (--index > 0) {
                if (arr[index] < arr[index - 1]) {
                    swap(arr, index, index - 1);
                }
            }
        }

        return arr;
    }

    private static int[] efficientInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i + 1;

            while (--index > 0 && arr[index-1] > arr[index]) {
                if (arr[index] < arr[index - 1]) {
                    swap(arr, index, index - 1);
                }
            }
        }

        return arr;
    }

    private static int[] efficientInsertionSort(int[] arr, boolean ascending) {
        int[] sortedArr = efficientInsertionSort(arr);
        if (ascending) {
            return sortedArr;
        }
        return reverseInEfficientWay(sortedArr);
    }

    private static int[] insertionSort(int[] arr, boolean ascending) {
        int[] sortedArr = insertionSort(arr);
        if (ascending) {
            return sortedArr;
        }
        return reverseInEfficientWay(sortedArr);
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

        int[] arr = { 1,2,3,4,5,100,6,6,7,4, 7, 500,0,8,9,10 };
        printArray(arr);
        efficientInsertionSort(arr);
        printArray(arr);
        efficientInsertionSort(arr, false);
        printArray(arr);

    }
}

package Type_1_ComparisonBasedSortingAlgorithms;

public class T_1_BubbleSort {

    public static int[] bubbleSort(int[] integerArray) {
        int counter = 0;
        for (int i = 0; i < integerArray.length - 1; i++) {
            ++counter;
            for (int j = 0; j < integerArray.length - 1 - i; j++) {
                if (integerArray[j] > integerArray[j + 1]) {
                    swap(integerArray, j, j + 1);
                }
            }
        }

        System.out.println("normal bubble sort: " + counter);
        return integerArray;
    }

    public static int[] bubbleSort(int[] integerArray, boolean ascending) {
        int[] sortedArray = bubbleSort(integerArray);

        if (ascending) {
            return sortedArray;
        }

        return reverseInEfficientWay(sortedArray);
    }

    public static int[] bubbleSort(boolean ascending, int[] integerArray) {
        int counter = 0;
        for (int i = 0; i < integerArray.length - 1; i++) {
            ++counter;
            for (int j = 0; j < integerArray.length - 1 - i; j++) {
                if (integerArray[j] > integerArray[j + 1] && ascending) {
                    swap(integerArray, j, j + 1);
                }

                if (ascending == false && integerArray[j] < integerArray[j + 1]) {
                    swap(integerArray, j, j + 1);
                }
            }
        }

        System.out.println("ascending feature normal bubble sort: " + counter);
        return integerArray;
    }

    public static int[] bubbleSortEfficientWay(int[] integerArray, boolean ascending) {
        int counter = 0;
        for (int i = 0; i < integerArray.length - 1; i++) {
            boolean isSwappedDone = false;
            ++counter;
            for (int j = 0; j < integerArray.length - 1 - i; j++) {
                if (ascending && integerArray[j] > integerArray[j + 1]) {
                    swap(integerArray, j, j + 1);
                    isSwappedDone = true;
                }

                if (ascending == false && integerArray[j] < integerArray[j + 1]) {
                    swap(integerArray, j, j + 1);
                    isSwappedDone = true;
                }
            }

            if (!isSwappedDone) {
                System.out.println("efficient way bubble sort: " + counter);
                return integerArray;
            }
        }

        System.out.println("efficient way bubble sort: " + counter);
        return integerArray;
    }

    private static int[] reverse(int[] integerArray) {
        int[] reversedArray = new int[integerArray.length];

        for (int i = 0; i < integerArray.length; i++) {
            reversedArray[i] = integerArray[integerArray.length - 1 - i];
        }

        return reversedArray;
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

        int[] arr = { 5,2,3,1 };
        bubbleSort(true, arr);
        printArray(arr);
        arr = new int[] { 5,2,3,1 };
        bubbleSortEfficientWay(arr, true);
        printArray(arr);
        arr = new int[] { 5,2,3,1 };
        bubbleSort(arr, true);
        printArray(arr);
    }
}

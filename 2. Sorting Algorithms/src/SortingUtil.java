public class SortingUtil {

    public static void swap(
            int firstNumber,
            int secondNumber
    ) {
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("firstNumber: " + firstNumber + " secondNumber: " + secondNumber);
    }

    public static int[] swap(int[] array) {
        if (array == null || array.length == 0 || array.length != 2) {
            throw new IllegalArgumentException("Input array is not for swap. you need to pass 2 length array.");
        }

        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        return array;
    }

    public static int[] swap(int[] array, int firstDigitIndex, int secondDigitIndex) {
        int temp = array[firstDigitIndex];
        array[firstDigitIndex] = array[secondDigitIndex];
        array[secondDigitIndex] = temp;

        return array;
    }

    public static void main(String[] args) {
        int[] arrayToSort = {5, 6};

        System.out.println("firstNumber: " + arrayToSort[0] + " secondNumber: " + arrayToSort[1]);

        SortingUtil.swap(arrayToSort);

        System.out.println("firstNumber: " + arrayToSort[0] + " secondNumber: " + arrayToSort[1]);
    }
}

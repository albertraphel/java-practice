package ds.arrays;

public class MoveZerosToEndArray {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12, 0, 5, 0, 324, 456, 3, 0, 234};
        moveZerosToEnd(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
}

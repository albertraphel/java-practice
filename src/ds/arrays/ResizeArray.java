package ds.arrays;


public class ResizeArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + arr.length);
        arr = resizeArray(arr, 10);
        System.out.println("Resized Array: " + arr.length);
        printArray(arr);
    }

    private static int[] resizeArray(int[] arr, int i) {
        int temp[] = new int[i];
        for (int j = 0; j < arr.length; j++) {
            temp[j] = arr[j];
        }
        arr = temp;
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

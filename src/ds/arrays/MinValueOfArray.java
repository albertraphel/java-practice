package ds.arrays;

public class MinValueOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 54, 2, 56, 3, 5, 6, 4, 56, 1, 6, 54};
        System.out.println(minValue(arr));
    }

    private static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


}

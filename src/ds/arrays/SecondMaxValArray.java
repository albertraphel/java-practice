package ds.arrays;

public class SecondMaxValArray {
    public static void main(String[] args) {
        int[] arr = {1, 22, 13, 4, 5};
        System.out.println(secondMaxVal(arr));
    }

    private static int secondMaxVal(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}

package ds.arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum -= num;
        }

        return sum;
    }
}

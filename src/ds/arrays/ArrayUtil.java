package ds.arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.demo();
    }

    public void demo() {
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 4;
        array[2] = 3;
        array[3] = 9;
        array[4] = 4;
        System.out.println("Length: " + array.length);
        printArray(array);

        int[] arr = {43, 56, 1, 34, 67};
        System.out.println();
        printArray(arr);
    }

    public void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

package ds.arrays;

public class Palindrome {
    public static void main(String[] args) {
        String word = "malayalam";
        System.out.println(isPalindrome(word));
    }

    private static boolean isPalindrome(String word) {
        char arr[] = word.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

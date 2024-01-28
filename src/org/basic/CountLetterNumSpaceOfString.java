package org.basic;

public class CountLetterNumSpaceOfString {
    public static void main(String[] args) {
        String s = "There are many 23 4237 &^ dsfda*&^*&^* sadgg   dsgfdagdfg4653765 6586786";

        count(s);
    }

    private static void count(String s){

        int letters=0;
        int numbers=0;
        int spaces=0;
        int others=0;

        char[] chArr = s.toCharArray();
        for(int i = 0; i< chArr.length; i++){
            if(Character.isLetter(chArr[i])){
                letters++;
            } else if(Character.isDigit(chArr[i])){
                numbers++;
            } else if(Character.isSpaceChar(chArr[i])){
                spaces++;
            } else{
                others++;
            }
        }

        System.out.println("Letters: "+ letters);
        System.out.println("Numbers: "+ numbers);
        System.out.println("Spaces: "+ spaces);
        System.out.println("Others: "+ others);
    }
}

package digitalocean;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 45;
        System.out.println(" Before swap: a = "+ a +" b= "+b);
        swap(a,b);
    }

    public static void swap(int a, int b){
        a = a+b; // 65
        b = a - b; //20
        a = a -b;
        System.out.println(" After swap: a = "+ a +" b= "+b);
    }
}

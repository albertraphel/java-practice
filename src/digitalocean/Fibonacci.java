package digitalocean;

public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(10);
    }

    public static void fibonacci(int n){
        if(n <=1){
            return;
        }
        int a =0;
        int b = 1;
        int next;
        System.out.print("Fibonacci: "+ a + ", "+b + ", ");
        for(int i=2; i<=n; i++){
           next = a+b;
            System.out.print(next + ", ");
            a= b;
            b =next;

        }
    }
}

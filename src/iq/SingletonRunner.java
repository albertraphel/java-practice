package iq;

public class SingletonRunner {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Hash code of s : "+ s.hashCode());
        System.out.println("Hash code of s1 : "+ s1.hashCode());
        System.out.println("Hash code of s2 : "+ s2.hashCode());

        if (s == s1 && s1 == s2) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}

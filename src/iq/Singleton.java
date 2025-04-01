package iq;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Singleton constructor executed");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance =  new Singleton();
        }

        return instance;
    }
}

package Singleton;

public class SingletonExample {

    public static void show(){

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("the memory location of singleton1 is: " + singleton1.hashCode());
        System.out.println("the memory location of singleton2 is: " + singleton2.hashCode());


    }

}

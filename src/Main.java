import Builder.BuilderExample;
import Factory.AbstractFactoryExample;
import Factory.FactoryExample;
import Singleton.SingletonExample;

public class Main {
    public static void main(String[] args) {

        // Creational design patterns:

        System.out.println("\n Factory Method: \n");
        FactoryExample.show("Dog");
        // Factory Method is a creational design pattern
        // that provides an interface for creating objects in a superclass,
        // but allows subclasses to alter the type of objects that will be created.


        System.out.println("\n Abstract Factory: \n");
        AbstractFactoryExample.show("Duck", "Black");
        //Abstract Factory is a creational design pattern
        //that lets you produce families of related objects
        // without specifying their concrete classes.



        System.out.println("\n Builder: \n");
        BuilderExample.show();
        //Builder is a creational design pattern
        //that lets you construct complex objects step by step.
        //The pattern allows you to produce different types and representations of an object
        //using the same construction code.




        System.out.println("\n Singleton: \n");
        SingletonExample.show();
        // Singleton.Singleton is a creational design pattern
        // that lets you ensure that a class has only one instance,
        // while providing a global access point to this instance.


    }
}
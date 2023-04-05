import behavioral.Iterator.IteratorExample;
import behavioral.Visitor.VisitorExample;
import behavioral.chain_of_responsibility.ChainOfResponsibilityExample;
import behavioral.command.CommandExample;
import behavioral.mediator.MediatorExample;
import behavioral.memento.MementoExample;
import behavioral.observer.ObserverExample;
import behavioral.state.StateExample;
import behavioral.strategy.StrategyExample;
import behavioral.template_method.TemplateMethodExample;
import creational.builder.BuilderExample;
import creational.factory.AbstractFactoryExample;
import creational.factory.FactoryExample;
import creational.prototype.PrototypeExample;
import creational.singleton.SingletonExample;
import structural.adapter.AdapterExample;
import structural.bridge.BridgeExample;
import structural.composite.CompositeExample;
import structural.decorator.DecoratorExample;
import structural.facade.FacadeExample;
import structural.flyweight.FlyweightExample;
import structural.proxy.ProxyExample;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println();
            System.out.println("select a pattern to show example output");
            System.out.println("prefix with 'explain' to show explanation");
            System.out.println();
            System.out.println();

            System.out.println("Creational patterns:");
            System.out.println();

            System.out.println("Factory Method");
            System.out.println("Abtract Factory");
            System.out.println("Builder");
            System.out.println("Prototype");
            System.out.println("Singleton");

            System.out.println();
            System.out.println();

            System.out.println("Structural patterns:");
            System.out.println();

            System.out.println("Adapter");
            System.out.println("Bridge");
            System.out.println("Composite");
            System.out.println("Decorator");
            System.out.println("Facade");
            System.out.println("Flyweight");
            System.out.println("Proxy");

            System.out.println();

            System.out.println("Behavioral patterns:");
            System.out.println();

            System.out.println("Chain of Responsibility");
            System.out.println("Command");
            System.out.println("Iterator");
            System.out.println("Mediator");
            System.out.println("Memento");
            System.out.println("Observer");
            System.out.println("State");
            System.out.println("Strategy");
            System.out.println("Template Method");
            System.out.println("Visitor");


            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            if (input.split(" ").length > 1) {
                System.out.println();
                String[] split = input.split(" ");
                input = split[0];
                String arg = split[1];
                switch (input.toLowerCase()) {
                    case "explain" -> explain(arg);
                    default -> System.out.println("invalid input");
                }
                input = scanner.nextLine(); //to wait for key press after example
                continue;
            }

            switch (input.toLowerCase()) {

                case "show all" -> showAll();


                //creational patterns

                case "factory method" -> FactoryExample.show("Dog");
                case "abstract factory" -> AbstractFactoryExample.show("Duck", "Black");
                case "builder" -> BuilderExample.show();
                case "prototype" -> PrototypeExample.show();
                case "singleton" -> SingletonExample.show();

                //structural patterns

                case "adapter" -> AdapterExample.show();
                case "bridge" -> BridgeExample.show();
                case "composite" -> CompositeExample.show();
                case "decorator" -> DecoratorExample.show();
                case "facade" -> FacadeExample.show();
                case "flyweight" -> FlyweightExample.show();
                case "proxy" -> ProxyExample.show();

                //behavioral patterns

                case "chain of responsibility" -> ChainOfResponsibilityExample.show();
                case "command" -> CommandExample.show();
                case "iterator" -> IteratorExample.show();
                case "mediator" -> MediatorExample.show();
                case "memento" -> MementoExample.show();
                case "observer" -> ObserverExample.show();
                case "state" -> StateExample.show();
                case "strategy" -> StrategyExample.show();
                case "template method" -> TemplateMethodExample.show();
                case "visitor" -> VisitorExample.show();


                case "exit" -> System.exit(0);
                default -> System.out.println("invalid input");


            }

            input = scanner.nextLine(); //to wait for key press after example


        }


    }


    public static void showAll() throws IOException {

        // Creational design patterns:

        System.out.println("\n Factory Method: \n");
        FactoryExample.show("Dog");
        // Factory Method is a creational design pattern
        // that provides an interface for creating objects in a superclass,
        // but allows subclasses to alter the type of objects that will be created.


        System.out.println("\n Abstract Factory: \n");
        AbstractFactoryExample.show("Duck", "Black");
        // Abstract Factory is a creational design pattern
        // that lets you produce families of related objects
        // without specifying their concrete classes.


        System.out.println("\n Builder: \n");
        BuilderExample.show();
        // Builder is a creational design pattern
        // that lets you construct complex objects step by step.
        // The pattern allows you to produce different types and representations of an object
        // using the same construction code.


        System.out.println("\n Prototype: \n");
        PrototypeExample.show();
        // Prototype is a creational design pattern
        // that allows cloning objects, even complex ones,
        // without coupling to their specific classes.


        System.out.println("\n Singleton: \n");
        SingletonExample.show();
        // Singleton.Singleton is a creational design pattern
        // that lets you ensure that a class has only one instance,
        // while providing a global access point to this instance.


        //Structural Patterns

        System.out.println("\n Adapter: \n");
        AdapterExample.show();
        // Adapter is a structural design pattern
        // that allows objects with incompatible interfaces to collaborate.


        System.out.println("\n Bridge: \n");
        BridgeExample.show();
        // Bridge is a structural design pattern
        // that lets you split a large class
        // or a set of closely related classes
        // into two separate hierarchies—abstraction
        // and implementation—which can be developed
        // independently of each other.


        System.out.println("\n Composite \n");
        CompositeExample.show();
        // Composite is a structural design pattern
        // that lets you compose objects into tree structures
        // and then work with these structures as if they were individual objects.


        System.out.println("\n Decorator \n");
        DecoratorExample.show();
        // Decorator is a structural design pattern
        // that lets you attach new behaviors to objects
        // by placing these objects inside special wrapper objects that contain the behaviors.


        System.out.println("\n Facade: \n");
        FacadeExample.show();
        // Facade is a structural design pattern
        // that provides a simplified interface to
        // a library, a framework, or any other complex set of classes.


        System.out.println("\n Flyweight: \n");
        FlyweightExample.show();
        // Flyweight is a structural design pattern
        // that lets you fit more objects into the available amount of RAM
        // by sharing common parts of state between multiple objects
        // instead of keeping all of the data in each object.

        System.out.println("\n Proxy: \n");
        ProxyExample.show();
        // Proxy is a structural design pattern
        // that lets you provide a substitute or placeholder
        // for another object. A proxy controls access to the original object,
        // allowing you to perform something either before or after the request gets through to the original object.


        // Behavioral patterns:


        System.out.println("\n Chain of Responsibility: \n");
        ChainOfResponsibilityExample.show();
        // Chain of Responsibility is a behavioral design pattern
        // that lets you pass requests along a chain of handlers.
        // Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.


        System.out.println("\n Command: \n");
        CommandExample.show();
        // Command is a behavioral design pattern
        // that turns a request into a stand-alone object
        // that contains all information about the request.


        System.out.println("\n Iterator: \n");
        IteratorExample.show();
        // Iterator is a behavioral design pattern
        // that lets you traverse elements of a collection
        // without exposing its underlying representation (list, stack, tree, etc.).


        System.out.println("\n Strategy: \n");
        StrategyExample.show();
        // Strategy is a behavioral design pattern that
        // lets you define a family of algorithms,
        // put each of them into a separate class,
        // and make their objects interchangeable.

        System.out.println("\n Mediator: \n");
        MediatorExample.show();
        // Mediator is a behavioral design pattern
        // that lets you reduce chaotic dependencies between objects.
        // The pattern restricts direct communications between the objects
        // and forces them to collaborate only via a mediator object.

        System.out.println("\n Memento: \n");
        MementoExample.show();
        // Memento is a behavioral design pattern
        // that lets you save and restore the previous state of an object
        // without revealing the details of its implementation.

        System.out.println("\n Observer: \n");
        ObserverExample.show();
        // Observer is a behavioral design pattern
        // that lets you define a subscription mechanism
        // to notify multiple objects about any events
        // that happen to the object they’re observing.

        System.out.println("\n State: \n");
        StateExample.show();
        // State is a behavioral design pattern
        // that lets an object alter its behavior
        // when its internal state changes.


        System.out.println("\n Template Method: \n");
        TemplateMethodExample.show();
        // Template Method is a behavioral design pattern
        // that defines the skeleton of an algorithm in the superclass
        // but lets subclasses override specific steps of the algorithm
        // without changing its structure.


        System.out.println("\n Visitor: \n");
        VisitorExample.show();
        // Visitor is a behavioral design pattern
        // that lets you separate algorithms from the objects on which they operate.


    }


    private static void explain(String arg) {

        switch (arg.toLowerCase()) {
            case "factory method" ->
                    System.out.println("Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.");
            case "abstract factory" ->
                    System.out.println("Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.");
            case "builder" ->
                    System.out.println("Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.");
            case "prototype" ->
                    System.out.println("Prototype is a creational design pattern that allows cloning objects, even complex ones, without coupling to their specific classes.");
            case "singleton" ->
                    System.out.println("Singleton.Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.");
            case "adapter" ->
                    System.out.println("Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.");
            case "bridge" ->
                    System.out.println("Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.");
            case "composite" ->
                    System.out.println("Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.");
            case "decorator" ->
                    System.out.println("Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.");
            case "facade" ->
                    System.out.println("Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.");
            case "flyweight" ->
                    System.out.println("Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.");
            case "proxy" ->
                    System.out.println("Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.");
            case "chain of responsibility" ->
                    System.out.println("Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.");
            case "command" ->
                    System.out.println("Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.");
            case "iterator" ->
                    System.out.println("Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).");
            case "mediator" ->
                    System.out.println("Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.");
            case "memento" ->
                    System.out.println("Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.");
            case "observer" ->
                    System.out.println("Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.");
            case "state" ->
                    System.out.println("State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.");
            case "strategy" ->
                    System.out.println("Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.");
            case "template method" ->
                    System.out.println("Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.");
            case "visitor" ->
                    System.out.println("Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.");
            default -> System.out.println("invalid input");

        }


    }
}
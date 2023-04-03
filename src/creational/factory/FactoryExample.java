package creational.factory;

import creational.factory.Animal.Animal;
import creational.factory.Animal.AnimalFactory;


public class FactoryExample {

    public static void show(String animalName){

        AnimalFactory animalFactory = new AnimalFactory();


        Animal animal = animalFactory.create(animalName);

        System.out.print("The " + animal.getType() + " says: " + animal.makeSound());

        System.out.println();

    }

}

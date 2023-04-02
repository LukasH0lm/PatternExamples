package creationalPatterns.factory;

import creationalPatterns.factory.Animal.Animal;
import creationalPatterns.factory.Animal.AnimalFactory;


public class FactoryExample {

    public static void show(String animalName){

        AnimalFactory animalFactory = new AnimalFactory();


        Animal animal = animalFactory.create(animalName);

        System.out.print("The " + animal.getType() + " says: " + animal.makeSound());

        System.out.println();

    }

}

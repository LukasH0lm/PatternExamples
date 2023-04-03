package creational.factory;

import creational.factory.Animal.Animal;
import creational.factory.Color.Color;

public class AbstractFactoryExample {

    public static void show(String inputAnimal, String inputColor){

        AbstractFactory abstractFactory;

        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Animal");
        assert abstractFactory != null;
        Animal animal =(Animal) abstractFactory.create(inputAnimal);

        abstractFactory = FactoryProvider.getFactory("Color");
        assert abstractFactory != null;
        Color color =(Color) abstractFactory.create(inputColor);

        String result = "A " + animal.getType() + " with " + color.getColor() + " color says: " + animal.makeSound();

        System.out.println(result);

    }

}

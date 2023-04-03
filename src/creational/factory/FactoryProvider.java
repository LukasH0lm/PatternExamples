package creational.factory;

import creational.factory.Animal.AnimalFactory;
import creational.factory.Color.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){

        if ("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }

        if ("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;

    }

}

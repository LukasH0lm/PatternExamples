package creational.factory.Animal;

import creational.factory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {

        if ("Dog".equalsIgnoreCase(animalType)){
            return new Dog();
        }

        if ("Duck".equalsIgnoreCase(animalType)){
            return new Duck();
        }

        if ("Bear".equalsIgnoreCase(animalType)){
            return new Bear();
        }


        return null;
    }
}

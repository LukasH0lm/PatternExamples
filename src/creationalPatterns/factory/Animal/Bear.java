package creationalPatterns.factory.Animal;

public class Bear implements Animal{


    @Override
    public String getType() {
        return "bear";
    }

    @Override
    public String makeSound() {
        return "ROAR";
    }
}

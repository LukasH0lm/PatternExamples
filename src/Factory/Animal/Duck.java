package Factory.Animal;

public class Duck implements Animal{


    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "quack";
    }
}
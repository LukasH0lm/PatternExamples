package creationalPatterns.factory;

public interface AbstractFactory<T> {

    T create(String type);

}

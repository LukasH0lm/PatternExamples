package creationalPatterns.factory.Color;

import creationalPatterns.factory.AbstractFactory;


public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String colorType) {

        if ("Black".equalsIgnoreCase(colorType)){
            return new Black();
        }

        if ("Brown".equalsIgnoreCase(colorType)){
            return new Brown();
        }

        if ("White".equalsIgnoreCase(colorType)){
            return new White();
        }


        return null;
    }
}

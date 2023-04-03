package structural.facade;

import java.io.File;

public class FacadeExample {

    public static void show() {

        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}

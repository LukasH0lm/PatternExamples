package behavioral.observer;

import behavioral.observer.editor.Editor;
import behavioral.observer.listeners.EmailNotificationListener;
import behavioral.observer.listeners.LogOpenListener;

public class ObserverExample {


    public static void show() {

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



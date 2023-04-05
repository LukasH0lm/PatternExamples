package behavioral.state;

import behavioral.state.ui.Player;
import behavioral.state.ui.UI;

public class StateExample {

    public static void show(){

        Player player = new Player();
        UI ui = new UI(player);
        ui.init();

    }

}

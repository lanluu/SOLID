package solid;

import solid.repositories.GameMemoryRepository;
import solid.repositories.GamePersistable;

public class Main {

    public static void main(String[] args) {
        // ok, for testing, we persist game to/from memory
        GamePersistable persistable = new GameMemoryRepository();
        // launches game manager
        GameManager manager = new GameManager(persistable);
        // creates a new game
        Game game = manager.create();
        // adds game objects
        game.addSoldier();
        game.addBuilding();
        game.addCloud();
        // starts it
        game.start();
        // stops it
        game.stop();
    }

}

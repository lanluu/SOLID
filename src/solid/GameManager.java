package solid;

import solid.repositories.GamePersistable;

/**
 * Controls game.
 */
public class GameManager {

    private GamePersistable persistable;

    public GameManager(GamePersistable persistable) {
        this.persistable = persistable;
    }

    public Game create() {
        return new Game();
    }

    public void save(Game game){
        persistable.save(game.getGameObjects());
    }

    public Game load(){
        return new Game(persistable.load());
    }

}

package solid.repositories;

import solid.gameObjects.GameObject;

/**
 * Provides contracts for storing and restoring game.
 */
public interface GamePersistable {

    void save(GameObject[] objects);

    GameObject[] load();

}

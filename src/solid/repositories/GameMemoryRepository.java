package solid.repositories;

import solid.gameObjects.GameObject;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Persists game-objects to ... memory.
 */
public class GameMemoryRepository implements GamePersistable {

    @Override
    public void save(GameObject[] objects) {
        throw new NotImplementedException();
    }

    @Override
    public GameObject[] load() {
        throw new NotImplementedException();
    }

}

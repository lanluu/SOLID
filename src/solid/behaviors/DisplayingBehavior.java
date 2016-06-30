package solid.behaviors;

import solid.gameObjects.GameObject;

/**
 * Shows game-object.
 */
public class DisplayingBehavior extends Behavior {

    public void display(GameObject gameObject) {
        System.out.println(String.format("%s was displayed.", gameObject.getName()));
    }

}

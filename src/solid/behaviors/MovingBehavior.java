package solid.behaviors;

import solid.gameObjects.GameObject;

import java.awt.*;

/**
 * Changes game-object's position.
 */
public class MovingBehavior extends Behavior {

    public void move(GameObject gameObject, int delta){
        Point currentCoord = gameObject.getCoord();
        Point newCoord = new Point(currentCoord.x + delta, currentCoord.y + delta);
        gameObject.setCoord(newCoord);

        System.out.println(String.format("%s went from %s to %s", gameObject.getName(), currentCoord, newCoord));
    }

}

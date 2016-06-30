package solid.gameObjects;

import java.awt.*;

/**
 * Provides base implementation for a general game object.
 */
public abstract class GameObject {

    private Point coord = new Point(1, 1);

    public abstract void select();

    public Point getCoord(){
        return coord;
    }

    public void setCoord(Point coord){
        this.coord = coord;
    }

    public String getName() {
        return this.getClass().getSimpleName().toUpperCase();
    }

    protected void say(String message) {
        System.out.println(message);
    }

}

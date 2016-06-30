package solid.gameObjects;

import solid.behaviors.DisplayingBehavior;
import solid.behaviors.Movable;
import solid.behaviors.MovingBehavior;
import solid.behaviors.Visible;

/**
 * Represents soldier/person object.
 */
public class Soldier extends GameObject implements Visible, Movable {

    @Override
    public void select() {
        say(getName() + ": yes Sir! I am ready.");
    }

    @Override
    public void display() {
        new DisplayingBehavior().display(this);
    }

    @Override
    public void move() {
        new MovingBehavior().move(this, 10);
    }

}

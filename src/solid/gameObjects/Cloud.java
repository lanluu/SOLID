package solid.gameObjects;

import solid.behaviors.DisplayingBehavior;
import solid.behaviors.Movable;
import solid.behaviors.MovingBehavior;
import solid.behaviors.Visible;

/**
 * Represents cloud object.
 */
public class Cloud extends GameObject implements Visible, Movable {

    @Override
    public void select() {
        say(getName() + ": I'm hanging.");
    }

    @Override
    public void display() {
        new DisplayingBehavior().display(this);
    }

    @Override
    public void move() {
        new MovingBehavior().move(this, 1);
    }
}

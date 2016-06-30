package solid.gameObjects;

import solid.behaviors.DisplayingBehavior;
import solid.behaviors.Visible;

/**
 * Represents building object.
 */
public class Building extends GameObject implements Visible {

    @Override
    public void select() {
        say(getName() + ": I'm staying.");
    }

    @Override
    public void display() {
        new DisplayingBehavior().display(this);
    }
}

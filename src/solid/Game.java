package solid;

import solid.behaviors.Movable;
import solid.behaviors.Visible;
import solid.gameObjects.Building;
import solid.gameObjects.Cloud;
import solid.gameObjects.GameObject;
import solid.gameObjects.Soldier;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Controls the game's flow.
 */
public class Game {

    private ArrayList<GameObject> gameObjects;

    public Game() {
        this.gameObjects = new ArrayList<>();
    }

    public Game(GameObject[] gameObjects) {
        this.gameObjects = new ArrayList<>(Arrays.asList(gameObjects));
    }

    public GameObject[] getGameObjects(){
        return gameObjects.toArray(new GameObject[gameObjects.size()]);
    }

    public void start(){
        showGameState("Game was started.");

        if (gameObjects.size() > 0) {
            for (GameObject gameObject : gameObjects) {
                activateGameObject(gameObject);
            }
        }
    }

    public void stop() {
        gameObjects.clear();
        showGameState("Game was stopped.");
    }

    public Soldier addSoldier(){
        Soldier soldier = new Soldier();
        addGameObject(soldier);
        return soldier;
    }

    public Building addBuilding(){
        Building building = new Building();
        addGameObject(building);
        return building;
    }

    public Cloud addCloud(){
        Cloud cloud = new Cloud();
        addGameObject(cloud);
        return cloud;
    }
    
    private void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    private void activateGameObject(GameObject gameObject) {
        gameObject.select();

        if (gameObject instanceof Visible) {
            ((Visible)gameObject).display();
        }

        if (gameObject instanceof Movable) {
            ((Movable)gameObject).move();
        }
    }

    private void showGameState(String message) {
        System.out.println(message);
    }
}

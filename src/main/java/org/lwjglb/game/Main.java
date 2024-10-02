package org.lwjglb.game;

import org.lwjglb.engine.*;
import org.lwjglb.engine.graph.Render;
import org.lwjglb.engine.scene.Scene;

public class Main implements IAppLogic {

    public static void main(String[] args) {
        Main main = new Main();
        Engine gameEng = new Engine("Game", new Window.WindowOptions(), main);
        gameEng.start();
    }

    @Override
    public void cleanup() {
        // Nothing to be done yet
    }

    @Override
    public void init(Window window, Scene scene, Render render) {
        // Nothing to be done yet
    }

    @Override
    public void input(Window window, Scene scene) {
        // Nothing to be done yet
    }

    @Override
    public void update(Window window, Scene scene) {
        // Nothing to be done yet
    }
}

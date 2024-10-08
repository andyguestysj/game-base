package org.lwjglb.engine;

import org.lwjglb.engine.graph.*;
import org.lwjglb.engine.scene.Scene;

public class Engine {

    private final IAppLogic appLogic;
    private final Window window;
    private Render render;
    private boolean running;
    private Scene scene;

    public Engine(String windowTitle, Window.WindowOptions opts, IAppLogic appLogic) {
        window = new Window(windowTitle, opts, () -> {
            resize();
            return null;
        });
        this.appLogic = appLogic;
        render = new Render();
        scene = new Scene(window.getWidth(), window.getHeight());
        appLogic.init(window, scene, render);
        running = true;
    }

    private void cleanup() {
        appLogic.cleanup();
        render.cleanup();
        scene.cleanup();
        window.cleanup();
    }

    private void resize() {
        scene.resize(window.getWidth(), window.getHeight());
    }

    private void run() {
        while (running && !window.windowShouldClose()) {
            window.pollEvents();

            appLogic.input(window, scene);

            appLogic.update(window, scene);

            render.render(window, scene);
            window.update();
            }
        

        this.cleanup();
    }

    public void start() {
        running = true;
        run();
    }

    public void stop() {
        running = false;
    }

}

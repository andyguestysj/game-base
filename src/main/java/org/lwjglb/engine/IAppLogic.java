package org.lwjglb.engine;

import org.lwjglb.engine.graph.*;
import org.lwjglb.engine.scene.Scene;

public interface IAppLogic {

    void cleanup();

    void init(Window window, Scene scene, Render render);

    void input(Window window, Scene scene);

    void update(Window window, Scene scene);
}
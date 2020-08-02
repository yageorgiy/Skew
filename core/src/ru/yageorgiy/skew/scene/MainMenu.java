package ru.yageorgiy.skew.scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import javafx.stage.Stage;
import ru.yageorgiy.skew.SkewGame;

public class MainMenu implements Screen {

    final SkewGame game;
    private SpriteBatch batch;
//    private Texture img;

    public MainMenu(SkewGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
//        img = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(img, 0, 0);
//        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        batch.dispose();
//		img.dispose();
    }

    @Override
    public void dispose() {

    }
}

package ru.yageorgiy.skew.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.yageorgiy.skew.SkewGame;

import java.awt.*;

public class DesktopLauncher {
	public static void main (String[] arg) {
//		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Skew";
//		config.width = (int) dimension.getWidth();
//		config.height = (int) dimension.getHeight();

		new LwjglApplication(new SkewGame(), config);
	}
}

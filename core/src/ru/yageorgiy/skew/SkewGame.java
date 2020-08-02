package ru.yageorgiy.skew;

import com.badlogic.gdx.Game;
import ru.yageorgiy.skew.scene.MainMenu;

public class SkewGame extends Game {

	@Override
	public void create(){
		setScreen(new MainMenu(this));
	}

}

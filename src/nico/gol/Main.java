package nico.gol;

import nico.gol.mainloop.MainLoop;
import nico.gol.window.Window;

public class Main {

	public static void main(String[] args) {
		Window.create();

		new MainLoop().start();
	}
}

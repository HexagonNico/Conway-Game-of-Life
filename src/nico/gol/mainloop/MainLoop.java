package nico.gol.mainloop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import nico.gol.Reference;
import nico.gol.window.Window;
import nico.gol.world.World;

public class MainLoop implements ActionListener {

	private Timer timer;
	
	private World world;
	
	public MainLoop() {
		this.timer = new Timer(Reference.TIMER_DELAY, this);
		this.world = new World();
	}
	
	public void start() {
		this.timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Window.updateBoard(world);
		this.world.update();
	}

}

package nico.gol.world;

import java.awt.Color;

public enum Cell {
	
	DEAD(Color.GRAY),
	ALIVE(Color.BLUE);
	
	private Color color;
	
	Cell(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
}

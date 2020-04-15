package models;

import models.squares.Square;

public class Piece {
	private String color;
	private Square location;
	
	public Square getLocation() {
		return location;
	}

	public void setLocation(Square location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Piece(String color, Square location) {
		this.color = color;
		this.location = location;
	}
	
}

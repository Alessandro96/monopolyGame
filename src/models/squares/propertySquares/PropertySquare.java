package models.squares.propertySquares;

import models.squares.Square;

public abstract class PropertySquare extends Square{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public PropertySquare(String name, int price) {
		super(name);
		this.price = price;
	}
	
}

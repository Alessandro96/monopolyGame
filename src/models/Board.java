package models;

import java.util.*;
import models.squares.Square;

public class Board {

	private Map<String, Square> squares;
	
	public Map<String, Square> getSquares() {
		return squares;
	}

	public void setSquares(Map<String, Square> squares) {
		this.squares = squares;
	}

	public void addSquare(Square square) {
		this.squares.put(square.getName(), square);
	}
	
	public Board(Map<String, Square> squares) {
		this.squares = new HashMap<>(squares);
	}
	
	public Board() {
		this.squares = new HashMap<>();
	}
}

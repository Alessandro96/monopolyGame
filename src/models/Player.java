package models;

import java.util.*;

public class Player {
	private String name;
	private Piece piece;
	private List<Die> dice;
	private Board board;
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Die> getDice(){
		return dice;
	}

	public void setDice(List<Die> dice) {
		this.dice = dice;
	}

	public void addDie(Die die) {
		this.dice.add(die);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Player(String name, List<Die> dice, Board board, Piece piece) {
		this.name = name;
		this.dice = new LinkedList<>(dice);
		this.board = board;
		this.piece = piece;
	}	
	
	public void takeTurn() {
		
	}
}

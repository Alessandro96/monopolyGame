package models;

import java.util.*;

public class MonopolyGame {

	private int roundCount;
	private List<Die> dice;
	private Board board;
	private List<Player> players;
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Die> getDice() {
		return dice;
	}

	public void setDice(List<Die> dice) {
		this.dice = dice;
	}

	public void addDie(Die die) {
		this.dice.add(die);
	}
	
	public int getRoundCount() {
		return roundCount;
	}
	
	public void setRoundCount(int roundCount) {
		this.roundCount = roundCount;
	}
	
	public MonopolyGame(int roundCount, List<Die> dice, Board board, List<Player> players) {
		this.roundCount = roundCount;
		this.dice = new LinkedList<>(dice);
		this.board = board;
		this.players = new LinkedList<>(players);
	}
	
	public void playGame() {
		
	}
	
	private void playRound() {
		
	}
}

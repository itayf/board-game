package com.itay.game;

public class Game {
	private int numPlayers=4;
	private int turn=1;
	public int getTurn() {
		return turn;
	}
	public int getTurn(boolean increment) {
		int res = turn;
		turn= (turn%numPlayers)+1;
		return res;
	}
	public void incTurn() {
		this.turn= (turn%numPlayers)+1;
	}

	private static Game game = null;

	public int getNumPlayers() {
		return this.numPlayers;
	}
	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	private Game() {
		
	}

	public static Game getInstance() {
		if (game==null){
			synchronized (Game.class) {
				game = new Game();
			} 
		}
		return game;
	}

}

package edu.citytech.connect4.service;

public class Connect4Service {

	public static int getValidCellMoves(String[] moves, int nextMove) {

		int validPosition = 0;
		int i = nextMove;
		boolean isFound = false;
		for (; i < moves.length; i += 7) {
			isFound = !moves[i].equals("?");
			if (isFound) {
				break;
			}
		}
		validPosition = i - 7;
		if(validPosition < 0) {
			validPosition = -1; 
		}

		return validPosition;
	}

	public static int[] getWinner(String[] moves) {
		int[] winningCombo = new int[] {};

		WinningCombo[] wcs = WinningDAO.findAll();

		for (WinningCombo wc : wcs) {
			if (moves[wc.p1].equals(moves[wc.p2]) 
			 && moves[wc.p2].equals(moves[wc.p3])
			 && moves[wc.p3].equals(moves[wc.p4]) 
		    && !moves[wc.p1].equals("?")) {
				winningCombo = new int[] { wc.p1, wc.p2, wc.p3, wc.p4 };
			}
		}
		return winningCombo;
	}
}

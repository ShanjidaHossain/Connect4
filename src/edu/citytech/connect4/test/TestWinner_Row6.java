package edu.citytech.connect4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.connect4.service.Connect4Service;

class TestWinner_Row6 {

	@Test
	@DisplayName("2_Winning Combo of X is 7, 8, 9, 10")
	void test01() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 7 && validPosition[1] == 8
					 && validPosition[2] == 9 && validPosition[3] == 10;

		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("2B_Winning Combo of O is 7, 8, 9, 10")
	void test01B() {
		String[] moves = {"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 0 && validPosition[1] == 1
					 && validPosition[2] == 2 && validPosition[3] == 3;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
		
	@Test
	@DisplayName("2_Winning Combo of X is 8, 9, 10, 11")
	void test02() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 8 && validPosition[1] == 9
					 && validPosition[2] == 10 && validPosition[3] == 11;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("2_Winning Combo of O is 8, 9, 10, 11")
	void test02B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 8 && validPosition[1] == 9
					 && validPosition[2] == 10 && validPosition[3] == 11;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("3_Winning Combo of X is 9, 10, 11, 12")
	void test03() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 9 && validPosition[1] == 10
					 && validPosition[2] == 11 && validPosition[3] == 12;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("3_Winning Combo of 0 is 9, 10, 11, 12")
	void test03B() {
		String[] moves = {"?","?","?","?","?","?","?"
						 ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 9 && validPosition[1] == 10
				 && validPosition[2] == 11 && validPosition[3] == 12;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("4_Winning Combo  of X is 10, 11, 12, 13")
	void test04() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 10 && validPosition[1] == 11
					 && validPosition[2] == 12 && validPosition[3] == 13;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("4_Winning Combo  of O is 10, 11, 12, 13")
	void test04B() {
		String[] moves = {"?","?","?","?","?","?","?"
						 ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 10 && validPosition[1] == 11
					 && validPosition[2] == 12 && validPosition[3] == 13;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
}

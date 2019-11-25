package edu.citytech.connect4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.connect4.service.Connect4Service;

class TestWinner_Row4 {

	@Test
	@DisplayName("2_Winning Combo of X is 21,22,23,24")
	void test01() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"				     
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 21 && validPosition[1] == 22
					 && validPosition[2] == 23 && validPosition[3] == 24;

		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("2B_Winning Combo of O is 21,22,23,24")
	void test01B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 21 && validPosition[1] == 22
				 && validPosition[2] == 23 && validPosition[3] == 24;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
		
	@Test
	@DisplayName("2_Winning Combo of X is 22,23,24,25")
	void test02() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"			        
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 22 && validPosition[1] == 23
					 && validPosition[2] == 24 && validPosition[3] == 25;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("2_Winning Combo of O is 22,23,24,25")
	void test02B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"				     
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 22 && validPosition[1] == 23
					 && validPosition[2] == 24 && validPosition[3] == 25;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("3_Winning Combo of X is 23,24,25,26")
	void test03() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"			         
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 23 && validPosition[1] == 24
					 && validPosition[2] == 25 && validPosition[3] == 26;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("3_Winning Combo of 0 is 23,24,25,26")
	void test03B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
						 ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 23 && validPosition[1] == 24
				 && validPosition[2] == 25 && validPosition[3] == 26;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("4_Winning Combo  of X is 24,25,26,27")
	void test04() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 24 && validPosition[1] == 25
					 && validPosition[2] == 26 && validPosition[3] == 27;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("4_Winning Combo  of O is 24,25,26,27")
	void test04B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 24 && validPosition[1] == 25
				 && validPosition[2] == 26 && validPosition[3] == 27;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
}

package edu.citytech.connect4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.connect4.service.Connect4Service;

class TestWinner_Row3 {

	@Test
	@DisplayName("2_Winning Combo of X is 14, 15, 16, 17")
	void test01() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"				     
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 14 && validPosition[1] == 15
					 && validPosition[2] == 16 && validPosition[3] == 17;

		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("2B_Winning Combo of O is 14, 15, 16, 17")
	void test01B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 14 && validPosition[1] == 15
				 	 && validPosition[2] == 16 && validPosition[3] == 17;
		
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
		
	@Test
	@DisplayName("2_Winning Combo of X is 15, 16, 17, 18")
	void test02() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 15 && validPosition[1] == 14
					 && validPosition[2] == 17 && validPosition[3] == 18;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("2_Winning Combo of O is 15, 16, 17, 18")
	void test02B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 15 && validPosition[1] == 16
					 && validPosition[2] == 17 && validPosition[3] == 18;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("3_Winning Combo of O is 16, 17, 18, 19")
	void test03() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 16 && validPosition[1] == 17
					 && validPosition[2] == 18 && validPosition[3] == 19;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("3_Winning Combo of 0 is  16, 17, 18, 19")
	void test03B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
						 ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 16 && validPosition[1] == 17
				 && validPosition[2] == 18 && validPosition[3] == 19;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}

	@Test
	@DisplayName("4_Winning Combo  of X is 17, 18, 19, 20")
	void test04() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 17 && validPosition[1] == 18
					 && validPosition[2] == 19 && validPosition[3] == 20;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
	
	@Test
	@DisplayName("4_Winning Combo  of O is 17, 18, 19, 20")
	void test04B() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
						 ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int[] validPosition = Connect4Service.getWinner(moves);
		boolean cond1 = validPosition.length == 4;
		boolean cond2 = validPosition[0] == 17 && validPosition[1] == 18
					 && validPosition[2] == 19 && validPosition[3] == 20;
	
		assertTrue(cond1 && cond2 ,"validPosition: " + validPosition);
	
	}
}

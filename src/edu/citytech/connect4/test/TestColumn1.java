package edu.citytech.connect4.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.citytech.connect4.service.Connect4Service;

class TestColumn1 {

	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 35, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 28, "validPosition: " + validPosition);

	}
	
	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 21, "validPosition: " + validPosition);

	}

	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 14, "validPosition: " + validPosition);

	}

	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 7, "validPosition: " + validPosition);

	}
	
	@Test
	void test6() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 0, "validPosition: " + validPosition);

	}
	
	@Test
	void test7() {
		String[] moves = {"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == -1, "validPosition: " + validPosition);

	}

}

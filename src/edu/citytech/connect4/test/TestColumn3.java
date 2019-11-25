package edu.citytech.connect4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.citytech.connect4.service.Connect4Service;

class TestColumn3 {

	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == 38, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == 31, "validPosition: " + validPosition);

	}
	
	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == 24, "validPosition: " + validPosition);

	}

	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"};
				
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == 17, "validPosition: " + validPosition);

	}

	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == 10, "validPosition: " + validPosition);

	}
	
	@Test
	void test6() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == 3, "validPosition: " + validPosition);

	}
	
	@Test
	void test7() {
		String[] moves = {"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"
				         ,"?","?","?","X","?","?","?"
				         ,"?","?","?","O","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 3);
		assertTrue(validPosition == -1, "validPosition: " + validPosition);

	}

}

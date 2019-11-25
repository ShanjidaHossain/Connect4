package edu.citytech.connect4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.citytech.connect4.service.Connect4Service;

class TestColumn6 {


	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 5);
		assertTrue(validPosition == 41, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","O"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 6);
		assertTrue(validPosition == 34, "validPosition: " + validPosition);

	}
	
	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 6);
		assertTrue(validPosition == 27, "validPosition: " + validPosition);

	}

	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"};
				
		int validPosition = Connect4Service.getValidCellMoves(moves, 6);
		assertTrue(validPosition == 20, "validPosition: " + validPosition);

	}

	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 6);
		assertTrue(validPosition == 13, "validPosition: " + validPosition);

	}
	
	@Test
	void test6() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 6);
		assertTrue(validPosition == 6, "validPosition: " + validPosition);

	}
	
	@Test
	void test7() {
		String[] moves = {"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"
				         ,"?","?","?","?","?","?","X"
				         ,"?","?","?","?","?","?","O"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 6);
		assertTrue(validPosition == -1, "validPosition: " + validPosition);

	}



}

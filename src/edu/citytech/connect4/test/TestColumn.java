package edu.citytech.connect4.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.citytech.connect4.service.Connect4Service;

class TestColumn {

@Test
void test1() {
	String[] moves = {"X","X","X","X","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"};
	
	int validPosition = Connect4Service.getValidCellMoves(moves, 0);
	assertTrue(validPosition == 7, "validPosition: " + validPosition);

}

@Test
void test2() {
	String[] moves = {"?","X","X","X","X","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"};
	
	int validPosition = Connect4Service.getValidCellMoves(moves, 0);
	assertTrue(validPosition == 7, "validPosition: " + validPosition);
}

@Test
void test3() {
	String[] moves = {"?","?","X","X","X","X","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"};
	
	int validPosition = Connect4Service.getValidCellMoves(moves, 0);
	assertTrue(validPosition == 7, "validPosition: " + validPosition);
}

@Test
void test4() {
	String[] moves = {"?","?","?","X","X","X","X"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"
			         ,"?","?","?","?","?","?","?"};
	
	int validPosition = Connect4Service.getValidCellMoves(moves, 0);
	assertTrue(validPosition == 7, "validPosition: " + validPosition);
}


}
package edu.citytech.connect4.service;

import com.jbbwebsolutions.connect4.Connect4GradeCalculator;

public class Testc4 {

	public static void main(String[] args) {
		Object o = Connect4GradeCalculator.check(Connect4Service::getWinner, "/Data/hossain.shanjida");
		System.out.println(o);
	}

}

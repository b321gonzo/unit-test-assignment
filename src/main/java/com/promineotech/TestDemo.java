package com.promineotech;

import java.util.Random;

public class TestDemo {

	//takes two positive integers and adds them
	public int addPositive(int a, int b) {
		if (a>0 && b>0) {
			return a+b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	//takes two negative integers and multiplies them
	public int multiplyNegative(int a, int b) {
		if (a<0 && b<0) {
			return a*b;
		} else {
			throw new IllegalArgumentException("Both parameters must be negative!");
		}
	}
	
	//takes a random integer between 1 and 10 and squares it
	int randomNumberSquared() {
		int num = getRandomInt();
		return num*num;
	}
	
	//acquires the random integer between 1 and 10, needed for the previous method
	int getRandomInt() {
	    Random random = new Random();
	    return random.nextInt(10) + 1;
	}
}

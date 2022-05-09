package com.javaex.ex03;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		Runnable digit = new DigitImpl();
		Thread thread = new Thread(digit);
		*/
		
		Thread thread = new Thread(new DigitImpl());
		thread.start();
		
		
	
		
	}
}

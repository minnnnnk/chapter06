package com.javaex.ex02;

public class DigitThread extends Thread {

	

	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	@Override
	public void run() {
		
		for(char bch = 'A'; bch<='Z'; bch++) {
			System.out.println(bch);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}

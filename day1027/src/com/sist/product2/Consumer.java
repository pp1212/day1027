package com.sist.product2;

//소비자를 위한 클래스를 만듬
public class Consumer extends Thread {
	
	//제품을 위한 클래스를 맴버변수로 선언
	//이 제품 객체는 생산자가 갖고 있는 product와 동일한 객체 => 서로 product를 공유자원으로 하고 있음
	private Product product; 
	
	//소비자 객체 생성시에 제품객체를 매개변수로 전달받아 맴버변수에 대입
	public Consumer(Product product) {
		this.product = product;
	}
	
	//쓰레드가 해야할 일을 run을 오버라이딩하여 써 줌
	public void run() {
		
		//반복실행하여 10개의 제품을 사용하도록 함
		for(int i=1;i<=10;i++) {
			product.getNumber();	//제품을 소비하기 위한 getNumber메소드 호출
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
	}
	
	
	
}

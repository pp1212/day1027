package com.sist.product;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//제품 객체를 생성함
		Product product = new Product();
		
		//생산자 쓰레드 객체를 생성함
		Producer producer = new Producer(product);	//위의 product를 둘 다 공유
		
		//소비자 쓰레드 객체를 생성함
		Consumer consumer = new Consumer(product);	//위의 product를 둘 다 공유
		
		//생산자와 소비자를 가동함
		producer.start();
		consumer.start();
	}

}

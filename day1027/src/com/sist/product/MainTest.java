package com.sist.product;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ǰ ��ü�� ������
		Product product = new Product();
		
		//������ ������ ��ü�� ������
		Producer producer = new Producer(product);	//���� product�� �� �� ����
		
		//�Һ��� ������ ��ü�� ������
		Consumer consumer = new Consumer(product);	//���� product�� �� �� ����
		
		//�����ڿ� �Һ��ڸ� ������
		producer.start();
		consumer.start();
	}

}

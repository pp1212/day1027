package com.sist.product;

//�Һ��ڸ� ���� Ŭ������ ����
public class Consumer extends Thread {
	
	//��ǰ�� ���� Ŭ������ �ɹ������� ����
	//�� ��ǰ ��ü�� �����ڰ� ���� �ִ� product�� ������ ��ü => ���� product�� �����ڿ����� �ϰ� ����
	private Product product; 
	
	//�Һ��� ��ü �����ÿ� ��ǰ��ü�� �Ű������� ���޹޾� �ɹ������� ����
	public Consumer(Product product) {
		this.product = product;
	}
	
	//�����尡 �ؾ��� ���� run�� �������̵��Ͽ� �� ��
	public void run() {
		
		//�ݺ������Ͽ� 10���� ��ǰ�� ����ϵ��� ��
		for(int i=1;i<=10;i++) {
			product.getNumber();	//��ǰ�� �Һ��ϱ� ���� getNumber�޼ҵ� ȣ��
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
	}
	
	
	
}
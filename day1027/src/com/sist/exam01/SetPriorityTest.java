package com.sist.exam01;

public class SetPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person kim = new Person("������");
		Person hong = new Person("ȫ�浿");
		Person lee = new Person("�̼���");
		//lee.setPriority(10);		���� ��
		
		lee.setPriority(Thread.MAX_PRIORITY);
		//�ְ�켱������ �����Ͽ��ٰ� �ݵ�� ���� ���� ���� ������ ���� ��������� �ʾƿ�
		//������ ���� ���� �����޶�� "���޼�"�� �����ϴ� �� ���̴�
		//������: 1, �ִ밪: 10 
		
		kim.start();
		hong.start();
		lee.start();
		
		//kim,hong,lee�����尡 ��� ���������� ��� ��Ŵ
		try {
			kim.join();
			hong.join();
			lee.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("kim�� �켱����:"+kim.getPriority());		//5
		System.out.println("hong�� �켱����:"+hong.getPriority());		//5
		System.out.println("lee�� �켱����:"+lee.getPriority());		//10
	}

}

package com.sist.game02;

import javax.swing.JFrame;

//GUI(Graphic User Interface) ���α׷��ֿ���
//â�� ����� ���ؼ��� JFrame�� ��� ����
public class MyFrame extends JFrame {

	//�����ڿ���
	public MyFrame() {
		setTitle("My Game");	//â�� ���� ����
		add(new MyPanel());		//��,�̻���,���ּ��� �����ϰ� �ִ� �г��� �����Ͽ� �����ӿ� ����
		setSize(500,500);		//�������� ũ�⸦ ����
		setVisible(true);		//�������� ȭ�鿡 ���̵��� ����
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();		//�������� ����
	}

}
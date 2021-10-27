package com.sist.game02;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Graphics;

//��,�̻���,���ּ��� ���ÿ�(�Ѳ�����) ���� �� �ִ� �г�Ŭ������ ����
//�г��� Ű���尡 �������� �̺�Ʈ�� ó���ϱ� ���Ͽ� KetListener�� ����
//�����̽�-�̻��� �߻�, ����Ű-���ּ� ��ġ ������
public class MyPanel extends JPanel implements KeyListener{
	//MyPanel�� Enermy,SpaceShip,Missile�� has a���� -> ��ü���� ��������� ����
	
	//��,�̻���,���ּ��� �гο� �ɹ������� ����
	//Enermy enermy;
	
	
	//�������� ���� ����� ���Ͽ�  ArrayList�� ����
	ArrayList<Enermy> enermyList;
	
	
	SpaceShip spaceship;
	Missile missile;
	
	//�����ڿ��� ��,�г��� �����ʰ� ���ÿ� �����Ͽ�
	public MyPanel() {
		super();
		this.addKeyListener(this);		//�г��� Ű�����̺�Ʈ�� ���
		this.requestFocus();			//�г��� Ű���� ��û�� ����	A
		setFocusable(true);				//�г��� ��Ŀ���� ����		B
		//�г��� ȭ�鱸����� �߿� �������� Ű����κ��� �Է��� �޾� ���̴� �뵵�� �ƴϱ� ������
		//Ű����κ��� �Է��� �޾Ƶ��̰� �Ϸ��� �гο� �ϴ��� ��Ŀ���� �����ؾ� ��(������ �Ǿ��־�� �Է� �����ϱ� ����)
		
		
		//�������� ���� ��� ���� ArrayList ��ü�� ����
		enermyList = new ArrayList<Enermy>();
		
		//���� 5�� ����(���� ����Ʈ�� ����)
		enermyList.add(new Enermy("enermy.png"));
		enermyList.add(new Enermy("enermy.png"));
		enermyList.add(new Enermy("enermy.png"));
		enermyList.add(new Enermy("enermy.png"));
		enermyList.add(new Enermy("enermy.png"));
		
		
		
		//enermy = new Enermy("enermy.png");			//�̹������ϸ��� ���� �� ��ü�� ����
		spaceship = new SpaceShip("spaceship.png");	//�̹������ϸ��� ���� ���ּ� ��ü�� ����
		missile = new Missile("missile.png");		//�̹������ϸ��� ���� �̻��� ��ü�� ����
		
		//�г��� ��������� ��,�̻���,���ּ��� ���� ����������(���ÿ�,�����ϰ�) �����̵��� �ϱ� ���Ͽ�
		//��Ƽ������� ����
		//��,�̻���,���ּ��� ���ÿ�(�����ϰ�) �����̰� �ϴ� ����� �ٸ� �������� �� ���� ����
		//�̰� �гο����� �ʿ�
		//�̷��� Ŭ������ Ŭ�����ȿ� ���� �� ����
		//=>inner class
		class MyThread extends Thread{		//ThreadŬ������ ��ӹ޾� ��Ƽ������ ����
			public void run() {				//run�� �������̵��Ͽ� ���ÿ� �����ų ��ɾ�(��)�� ����
				while(true) {				//��� �ݺ��Ͽ� ��,�̻���,���ּ��� �����̵��� �ϱ� ���Ͽ� while(true) �̿�
					
					missile.update();
					
					//����Ʈ�� ��� ���� ����ŭ �ݺ��Ͽ� ���� ��ġ ����
					for(Enermy enermy:enermyList) {
						enermy.update();
						enermy.crush(missile);
					}
					
					repaint();			
					
					try {
						Thread.sleep(50);
					}catch(InterruptedException e) {
					}
				}
			}
		}
		
		//��,�̻���,���ּ��� ���� ���������� �����̵��� ����
		//��Ƽ������ ��ü MyThread�� ����
		//Thread�� MyThread�� is a ���迩�� ���� ����
		Thread t = new MyThread();
		
		//������ ����
		t.start();
	}
	
	
	
	//��,�̻���,���ּ��� ����� ��ġ�� �׷����� �ٽ� �׷���
	//�гο� �׷����� ǥ���ϱ� ���ؼ��� paint�� �������̵� ����
	//�� �� �Ű������� ���޹��� Graphics�� �׷����� ǥ���ϱ� ���� �پ��� �޼ҵ���� ����
	public void paint(Graphics g) {		
		super.paint(g);
		
		//�������� ���� ����ִ� ����Ʈ�� ����ŭ �ݺ��Ͽ� ���� �ٽ� �׷���
		for(Enermy enermy:enermyList) {
			enermy.draw(g);	
		}		
		spaceship.draw(g);		
		missile.draw(g);
	}
	
	
	
	//�гο��� Ű���尡 ��������
	public void keyPressed(KeyEvent event) {	//KeyEvent event�� ������ Ű���� ���� ���� ����
		spaceship.keyPressed(event);		//������ Ű�����̺�Ʈ�� ������ ���ּ����� ����
		
		//������ Ű�����̺�Ʈ�� ������ ���ּ��� ��ġ�� �̻��Ͽ��� ����
		missile.keyPressed(event, spaceship.x, spaceship.y);
	}
	
	//������ ��
	public void keyReleased(KeyEvent arg0) {
	}
	
	//������ ���°� �� ��
	public void keyTyped(KeyEvent arg0) {
	}
}

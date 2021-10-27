package com.sist.game02;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Enermy extends GraphicObject {
	
	//���� x������ �����̴� ������ ���� ����
	//��ó������ ������ ������ �������� �����̰� �ϱ� ���Ͽ� ���� ����
	//int dx = -10;
	//int dy = 10;
	
	//���� �̵���θ� ������ ����
	int dx;
	int dy;
	
	
	
	//�����ÿ� ������ ǥ���� �׷��������̸��� �Ű������� ���޹޾� �θ�Ŭ������ �����ڿ��� ����
	public Enermy(String name) {
		super(name);
		
		//��ó���� ���α׷��� �����Ͽ��� �� ���� ��ġ�� ������ ��ܿ� ��ġ��Ű�� ���Ͽ�
		//x=500, y=0���� ����
		//x = 500;
		//y = 0;
		
		Random r = new Random();
		//��ó���� ���� ��ġ�� ������ ����
		x = r.nextInt(500);
		y = r.nextInt(300);
		
		
		//���� �̵���ΰ��� �����ÿ� ������ ����
		//�̵��ϴ� �ּҰ�: 10
		//�̵��ϴ� �ִ밪: 100
		//� ������ ���� 90���� ���� �������� 10�� ���ϸ� ��
		
		
		
		dx = r.nextInt() % 30;		//����,��� �� ����
		dy = r.nextInt() % 30;
		
		if(dx >= 0) {
			dx += 10;
		}else {
			dx -= 10;
		}
		
		if(dy >= 0) {
			dy += 10;
		}else {
			dy -= 10;
		}
		
		System.out.println("dx:"+dx);
		System.out.println("dy:"+dy);
	}
	
	
	public void update() {
		
		//x��ǥ�� dx��ŭ �����Ŵ
		x += dx;
		y += dy;
		
		//x������ ���� ���������� ��ȣ�� �ٲ���
		if(x < 0 || x > 500) {
			dx = dx * -1;
		}
		
		//y������ ���� ���������� ��ȣ�� �ٲ���
		if(y < 0 || y >= 300) {
			dy = dy * -1;
		}
		
		
		/*
		//���� ���ʳ��� �����ϸ� ���������� �̵���Ű�� ���Ͽ� dx�� ����� ����
		if(x < 0) {
			dx = +10;
			
		}
		
		//���� �����ʳ��� �����ϸ� �ٽ� �������� �̵���Ű�� ���Ͽ� dx�� ������ ����
		if(x > 500) {
			dx = -10;
			
		}	
		
		if(y > 300) {
			dy = -10;
		}
		
		if(y < 0) {
			dy = +10;
		}*/
	}
	
	//��(����)�� �̻��Ͽ� �¾Ҵ��� �Ǻ��ϴ� �޼ҵ� ����
	//�� �޼ҵ尡 ���� �Ϸ��� �Ű������� ������ �ʿ��Ѱ�?
	//�̻����� ��ġ(��ǥ)
	public void crush(Missile missile) {
		
		//���� �̻��Ͽ� �¾Ҵ��� �Ǻ�(�� �׸� ������ ũ�� ����ؼ�-> +80)
		if(missile.x >= x && missile.x <= x+80   &&   missile.y >= y && missile.y<= y+80) {
			//System.out.println("���� �¾Ҿ��!");
			
			//�Ҹ����� ��ü ����
			File file = new File("EXPLODE.WAV");
			try {
				//����� ������ �о���� ���� �غ�
				Clip clip = AudioSystem.getClip();

				//����������� �о��
				clip.open(AudioSystem.getAudioInputStream(file));
				
				//����� ���� ���
				clip.start();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			y = -1000;
		}
	}
}

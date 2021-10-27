package com.sist.game;
import java.awt.event.KeyEvent;

//�츮�� (���ּ�)�� ���� Ŭ����
public class SpaceShip extends GraphicObject {
	
	//�����ÿ� �̹������ϸ��� �Ű������� ���޹޾� �θ��� �����ڿ��� ����
	public SpaceShip(String name) {
		super(name);
	
		//��ó�� ���ּ��� ��ġ x,y�� ����
		//�θ𿡰� ��ӹ޾Ƽ� x,y���
		x = 150;
		y = 350;
	}
	
	//���ּ��� ������ ����Ű�� ���� ���ּ��� ��ġ�� �̵���Ŵ
	//�Ű������� ���޹��� KeyEvent event�� ���ؼ� �Ű�� ���������� �� �� ����
	public void keyPressed(KeyEvent event) {	
		
		//���� ����Ű�� ������
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			//x��ǥ�� �������� �̵���Ű�� ���Ͽ� 10�� ����
			x -= 10;
		}
		
		//������ ����Ű�� ������
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			//x��ǥ�� ���������� �̵���Ű�� ���Ͽ� 10�� ����
			x += 10;
		}
		
		//���� ����Ű�� ������
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			//y��ǥ�� �������� �̵���Ű�� ���Ͽ� 10�� ����
			y -= 10;
		}
		
		//�Ʒ��� ����Ű�� ������
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			//y��ǥ�� �Ʒ������� �̵���Ű�� ���Ͽ� 10�� ����
			y += 10;
		}
		
	}


}

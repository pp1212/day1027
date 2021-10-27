package com.sist.game02;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

//��,���ּ�,�̻��� Ŭ�������� ���������� ������ �� �Ӽ��� ������ �̾� "�Ϲ�ȭ"
public class GraphicObject {
	
	
	BufferedImage img = null;	//ȭ�鿡 �׸��� ǥ���ϱ� ���� ��ü
	int x =0, y=0;				//�׸��� ��µ� ��ġ
	
	//�����ÿ� �׷����̹��� ������ �Ű������� ���޹޾ƿ�
	public GraphicObject(String name) {
		
		//�Ű������� ���޹��� ���ϸ����� BufferedImage��ü ����
		try {
			img = ImageIO.read(new File(name));
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
	
	
	//�׷����̹����� ��ġ�� �����ϱ� ���� �޼ҵ��̸� �ڽ�Ŭ�������� �ڽſ��� �µ��� ������ �� ���Դϴ�.
	public void update() {}
	
	//����� ��ġ�� �̹����� �ٽ� �׸��� ���� �޼ҵ�
	public void draw(Graphics g) {
		g.drawImage(img,x,y,null);	//x,y��ǥ�� �̹����� �׷� ��
	}
	
	//��,�̻���,���ּ� ������ ��ü���� keyPressed�� �ڽſ��� �µ��� �������̵� ��
	public void keyPressed(KeyEvent event) {}
	
}

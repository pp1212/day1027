package com.sist.game02;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

//적,우주선,미사일 클래스들이 공통적으로 가져야 할 속성과 동작을 뽑아 "일반화"
public class GraphicObject {
	
	
	BufferedImage img = null;	//화면에 그림을 표현하기 위한 객체
	int x =0, y=0;				//그림이 출력될 위치
	
	//생성시에 그래픽이미지 파일을 매개변수로 전달받아요
	public GraphicObject(String name) {
		
		//매개변수로 전달받은 파일명으로 BufferedImage객체 생성
		try {
			img = ImageIO.read(new File(name));
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	
	//그래픽이미지의 위치를 갱신하기 위한 메소드이며 자식클래스들이 자신에게 맞도록 재정의 할 것입니다.
	public void update() {}
	
	//변경된 위치에 이미지를 다시 그리기 위한 메소드
	public void draw(Graphics g) {
		g.drawImage(img,x,y,null);	//x,y좌표에 이미지를 그려 줌
	}
	
	//적,미사일,우주선 세개의 객체들이 keyPressed를 자신에게 맞도록 오버라이딩 함
	public void keyPressed(KeyEvent event) {}
	
}

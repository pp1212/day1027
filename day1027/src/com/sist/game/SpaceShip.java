package com.sist.game;
import java.awt.event.KeyEvent;

//우리편 (우주선)을 위한 클래스
public class SpaceShip extends GraphicObject {
	
	//생성시에 이미지파일명을 매개변수로 전달받아 부모의 생성자에게 전달
	public SpaceShip(String name) {
		super(name);
	
		//맨처음 우주선의 위치 x,y를 설정
		//부모에게 상속받아서 x,y사용
		x = 150;
		y = 350;
	}
	
	//우주선에 눌러진 방향키에 따라 우주선의 위치를 이동시킴
	//매개변수로 전달받은 KeyEvent event를 통해서 어떤키가 눌러졌는지 알 수 있음
	public void keyPressed(KeyEvent event) {	
		
		//왼쪽 방향키가 눌리면
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			//x좌표를 왼쪽으로 이동시키기 위하여 10을 감소
			x -= 10;
		}
		
		//오른쪽 방향키가 눌리면
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			//x좌표를 오른쪽으로 이동시키기 위하여 10을 증가
			x += 10;
		}
		
		//위쪽 방향키가 눌리면
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			//y좌표를 위쪽으로 이동시키기 위하여 10을 감소
			y -= 10;
		}
		
		//아래쪽 방향키가 눌리면
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			//y좌표를 아래쪽으로 이동시키기 위하여 10을 증가
			y += 10;
		}
		
	}


}

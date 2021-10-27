package com.sist.ars;

//"성금자"를 위한 클래스를 쓰레드를 상속받아 구현함
public class Donor extends Thread {

	private String name;		//성금자의 이름을 위한 맴버변수
	private Account tvArs;		//성금자들이 "모금액"을 공유하기 위하여 맴버변수로 선언함
	
	//"성금자"객체 생성시에 성금자의 이름과 공유할 "모금액"객체를 매개변수로 전달받아 맴버변수에 설정
	public Donor(String name,Account tvArs) {
		this.name = name;
		this.tvArs = tvArs;
	}
	
	
	//쓰레드가 해야 할 일을 run을 오버라이딩하여 써 줌 
	public void run() {
		for(int i=1; ;i++) {		//계속 반복하여 
			
			//입금하기 전에 "모금액"이 100000원이 넘었으면 반복문을 탈출하도록 함
			if(tvArs.getBalance() >= 100000) {
				break;
			}
			
			tvArs.deposit(1000);	//"모금액"객체에 1000원씩 입금함
			System.out.println(name + "이(가) "+i+"번째 입금하였습니다.");	//몇번째 입금하였는지 출력
			try {
				Thread.sleep(200);	//0.2초 대기하도록 함
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

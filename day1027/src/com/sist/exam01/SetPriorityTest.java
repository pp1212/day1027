package com.sist.exam01;

public class SetPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person kim = new Person("김유신");
		Person hong = new Person("홍길동");
		Person lee = new Person("이순신");
		//lee.setPriority(10);		같은 뜻
		
		lee.setPriority(Thread.MAX_PRIORITY);
		//최고우선순위를 설정하였다고 반드시 일이 가장 먼저 끝나는 것이 보장되지는 않아요
		//가급적 일을 빨리 끝내달라고 "응급성"을 설정하는 것 뿐이다
		//최저값: 1, 최대값: 10 
		
		kim.start();
		hong.start();
		lee.start();
		
		//kim,hong,lee쓰레드가 모두 끝날때까지 대기 시킴
		try {
			kim.join();
			hong.join();
			lee.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("kim의 우선순위:"+kim.getPriority());		//5
		System.out.println("hong의 우선순위:"+hong.getPriority());		//5
		System.out.println("lee의 우선순위:"+lee.getPriority());		//10
	}

}

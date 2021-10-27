package com.sist.inputoutput;

import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//아까 생성한 c:/myData/hello.txt파일의 내용을 읽어 들여
		//화면에 출력해 본다
		//팀별로 프로그램을 완성해본다
		//바이트단위의 입출력도 실험해 본다.
		
		try {
			FileReader fr = new FileReader("c:/myData/hello.txt");
			int data;
			while(true) {
				data = fr.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
	}

}

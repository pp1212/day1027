package com.sist.inputoutput;

import java.io.FileInputStream;

public class ReadByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("enermy.png");
			int total = 0;
			int data = fis.read();
			while(data != -1) {
				total++;
				data = fis.read();
			}
			fis.close();
			System.out.println(total);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}

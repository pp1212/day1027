package com.sist.inputoutput;

import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ʊ� ������ c:/myData/hello.txt������ ������ �о� �鿩
		//ȭ�鿡 ����� ����
		//������ ���α׷��� �ϼ��غ���
		//����Ʈ������ ����µ� ������ ����.
		
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
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
	}

}

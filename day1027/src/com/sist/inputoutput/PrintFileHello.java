package com.sist.inputoutput;

import java.io.FileWriter;

public class PrintFileHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� �̸��� ���̸� ���Ϸ� ���
		
		//���ڴ����� ����� ���� Writer�� �ļ� �߿�
		//���Ϸ� ����� ���� FileWriter�� ����
		//io�� �ڹٰ� ����ó�� �����༭ ���� �ؾ� ��
		try {
			FileWriter fw = new FileWriter("c:/myData/hello.txt");
			fw.write("���� �̸��� ȫ�浿�̰�\n");
			fw.write("���̴� 20�� �Դϴ�.");
			
			//������ ����� ������ ������ �ݾ��־�� ��
			//�ݾ� ���� ������ ���� ���� ������ ���� ���� �� ������
			//�� ������ ���࿡ �ٸ� �������� ��� �Ѵٸ� ���⼭ �ݾ����� ������ �ٸ� �������� �� �� ���� ��Ȳ�� ��
			fw.close();
			System.out.println("������ �����Ͽ����ϴ�.");
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}

}

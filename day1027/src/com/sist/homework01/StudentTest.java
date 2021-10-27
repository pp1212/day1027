package com.sist.homework01;

import java.io.FileReader;
import java.util.StringTokenizer;

public class StudentTest {

	public static void main(String[] args) {
		
		String name;
		int kor,eng,math;
		double tot=0,avg=0;
		
		
		int data = 0;
		String line = "";
		try {
			FileReader fr = new FileReader("c:/myData/student.txt");
			while((data = fr.read()) != -1) {
				//System.out.print((char)data);
				line += (char)data;
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		
		String []str = line.split(",");
		for(int i=0;i<str.length;i++) {
			//System.out.println(str[i]);
		}
		name = str[0].trim();
		kor = Integer.parseInt(str[1].trim());
		eng = Integer.parseInt(str[2].trim());
		math = Integer.parseInt(str[3].trim());
		
		tot = kor + eng + math;
		avg = tot / 3;
		
		System.out.println("** 성적 **");
		System.out.printf("%s의 국어:%d점 영어:%d점 수학:%d점\n",name,kor,eng,math);
		System.out.printf("총점:%.1f점 평균:%.1f점",tot,avg);
		
	}
}

package test001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex020 {
	public static void main (String [] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int stuNum = 0;
		int hap = 0;
		
		System.out.println("테스트 케이스의 수>");
		num =sc.nextInt();
		int [] scores = new int [num];
		
		for(int i =0; i<scores.length; i++ ) {
			System.out.println("학생수 입력>");
			stuNum = sc.nextInt();
			System.out.println("점수입력");
			for(int j = 0; j<stuNum; j++) {
				
				hap+=sc.nextInt();
				scores[i] = hap/stuNum;
			}
			hap = 0;
		}
		
		for(int i =0; i<scores.length; i++ ) {
			System.out.println("평균은: "+scores[i]);
		}
		
	}
}

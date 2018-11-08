package test001;

import java.util.Scanner;

public class ex022 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int stuNum =0;
		int [] students = null;
		
		
		try {
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 :
				System.out.println("학생수 입력>");
				stuNum = sc.nextInt();
				students = new int [stuNum];
				break;
			case 2 : 
				if (students != null ) {
				for(int i =0; i<students.length;i++) {
					System.out.print((i+1)+"번 째 학생 점수 :");
					students[i] = sc.nextInt();
				}
				}else {
					System.out.println("둥록된 학생수가 없습니다 ");
				}
				break;
			case 3 :
				if (students != null ) {
				for(int i =0; i<students.length;i++) {
					System.out.println((i+1)+"번 째 학생 점수 :"+students[i]);
				}
				}else {
					System.out.println("둥록된 학생수가 없습니다 ");
				}
				break;
			case 4 :
				if (students != null ) {
				int hap =0;
				for(int i =0; i<students.length;i++) { 
					hap += students[i];
				}
				System.out.println("점수 합계 : " + hap);
				System.out.println("학생 평균 점수 :" + (hap/students.length));
				}else {
					System.out.println("둥록된 학생수가 없습니다 ");
				}
				break;
			case 5 :
				System.out.println("종료");
				run = false;
				break;
			default :
				System.out.println("잘보고 입력할래?");
				break;
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("아니 뭐하는거야 생각좀해");
	}
	}
}

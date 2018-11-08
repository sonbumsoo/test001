package test001;

import java.util.Scanner;

public class ex014 {
	public static void main(String [] agrs ) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int bal = 0;
		int sel = 0;
		
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1 :
			System.out.print("예금액>");
			int dip = sc.nextInt();
			bal +=dip;
			break;
			
			case 2:
			System.out.println("잔고" + bal);
			System.out.print("출금액>");
			int min = sc.nextInt();
			
			if(min<bal) {
				bal-=min;
			}else {
				System.out.println("잔고가 부족합니다");
				break;
			}
			break;
			case 3 :
				System.out.println("잔고" + bal);
				break;
			case 4 :
				run = false;
				break;
			default :
				System.out.println("잘못선택하셧습니다 다시 선택하세요");
				break;
			
			}
			
			
			
			
		}
		
	}
}

package test001;

import java.util.Scanner;

public class ex021 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] q = new String [5];
		q[0] = "chair";
		q[1] = "desk";
		q[2] = "water";
		q[3] = "moniter";
		q[4] = "mouse";
		
		String [] q1 = new String [5];
		q1[0] = "의자";
		q1[1] = "책상";
		q1[2] = "물";
		q1[3] = "모니터";
		q1[4] = "마우스";
		
		
		int sum = 0;
		int j = 0;
		
		for (int i = 0; i<q.length; i++) {
			System.out.println("문제"+(i+1)+". "+q[i]+"의 뜻은 무엇인가요?");
			String ding = sc.next();
			if(ding.equals(q1[i])) {
				System.out.println("정답입니다");
				sum +=1;
			}else {
				System.out.println("틀렸습니다 정답은:"+q1[i]+"입니다");
			}
		}
		
		System.out.println("맟춘 갯수:"+sum);
		System.out.println("정답률:"+(sum*q.length));
 
		
		
		
	}

}

package test001;

import java.util.Random;
import java.util.Scanner;

public class ex011 {
	public static void main (String [] agrs) {
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		int count = 1;
		int rannum = ran.nextInt(100);
		// 랜덤 객체를 만들고 범위를 0 부터 100까지 생성
		
		System.out.println("숫자를 입력 하세요");
		while(true) {
		
			int in = sc.nextInt();
			// 정답이 아닐때까지 입력을 받기 위해서 선언
			
			if(rannum < in ) {
				System.out.println("큰숫자 입니다 작은숫자를 입력하세요");
				count++;
				// 큰숫자를 입력 하면 메시지 출력 후 count를 하나씩 추가
			}
			
			if(rannum > in ) {
				System.out.println("작은숫자 입니다 큰숫자를 입력하세요");
				count++;
				// 작은숫자를 입력 하면 메시지 출력 후 count를 하나씩 추가
			}
			
			if(rannum ==  in ) {
				System.out.println("정답입니다 답은:"+rannum+"입니다");
				System.out.println("횟수는"+count);
				break;
				//정답을 맟추면 정답인 랜덤의 수와 시도 횟수를 출력
			}
		}
		
		
		
	}
	
}

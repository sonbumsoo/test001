package test001;

import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 입력 받은 정수를 담을 변수
		int cont = 0; // 평균값을 구하기 위해 갯수를 
		boolean run = true;
		double avg = 0.0;
		
		
		
		System.out.println("정수를 입력하고 마지막에 0을 입력 하세요");
		
			while(run) {
				int i = sc.nextInt();
				sum += i;
				cont++;  
				if(i ==0) {
				cont--;	
					break;
				}
				
				
			}
			avg = sum/cont;
		System.out.println("수의 개수는" + (cont));
		System.out.println("평균은" + avg);

	}

}

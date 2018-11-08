package test001;

import java.util.Scanner;

public class ex007 {
	public static void main(String [] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">>>>");
		int input = sc.nextInt();
		
		if(input%2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	
		
		
	}
}

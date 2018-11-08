package test001;

import java.util.Scanner;

public class ex002 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		String[] candys = new String[5];

		for (int i = 0; i < candys.length; i++) {
			candys[i] = sc.next();
			
			if (candys[i].equals(">o<")) {
				sum += 1;
			}
		}
		System.out.println("사탕의 갯수는"+sum+"개 이다");
		
	}
}

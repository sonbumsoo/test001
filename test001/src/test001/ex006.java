package test001;

import java.util.Scanner;

public class ex006 {
	public static void main(String [] agrs) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("시작값");
		int x = sc.nextInt();
		System.out.println("끝값");
		int y = sc.nextInt();
		int sum = 0;
		
			for(int j=x; j<=y; j++) {
				sum +=j; 
				if(j<y) {
					System.out.print(j+"+");
				}else {
					System.out.println(j+"="+sum);
				}
			}
		
	}
}

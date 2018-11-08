package test001;

import java.util.Scanner;

public class ex001 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int index =0;
		int [] result = new int [4];
		
		for(int i=0; i<=3; i++) {
			int a = sc.nextInt();
			result[i] = a;
			result[i] = a;
		}
		
		for(int i =0; i<result.length; i++) {
			if (result[i]==1) {
				index +=1;
			}
		}
		
		switch(index) {
		case 1 : 
			System.out.println("A");
			break;
		case 2 : 
			System.out.println("b");
			break;
		case 3 : 
			System.out.println("c");
			break;
		case 4 : 
			System.out.println("d");
			break;
		}
		
		int value =44032;
		char cvalue = (char)value;
		
	}

}

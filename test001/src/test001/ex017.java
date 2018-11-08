package test001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex017 {
	public static void main(String [] agrs) {
	Scanner sc = new Scanner(System.in);

	int [] arr = new int [5];
	int temp = 0;
	
	for(int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	
	for(int i = 0; i<arr.length; i++) {
		for(int j =0; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	for(int i = 0; i <arr.length; i++) {
		System.out.print(arr[i]+" ");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int min = arr[0];
	for(int i = 0; i<arr.length; i++) {
		if (min>arr[i]) {
			min = arr[i];
		}
	}
	System.out.println("가장작은수 :" + min);*/
	
		
	/*List<Integer> intList = new ArrayList();
	
	for(int i = 0; i<5; i++) {
		intList.add(sc.nextInt());
		if(max<intList.get(i)) {
			max = intList.get(i);
		}
	}
	System.out.println("가장큰수는 :" + max);
	*/
	
	
	
	
	}
}

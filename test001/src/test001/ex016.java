package test001;

import java.util.Scanner;

public class ex016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 숫자를 입력 하세요: ");
			int input = sc.nextInt();
			arr[i] = input;
			sum += arr[i];
		}
		System.out.println("합계==>" + sum);

	}
}

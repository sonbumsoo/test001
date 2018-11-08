package test001;

import java.util.Scanner;

public class ex013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학년 입력 ");
		int lenk = sc.nextInt();

		System.out.println("점수 입력 ");
		int score = sc.nextInt();

		if (lenk < 4 && score >= 60) {
			System.out.println("합격");

		} else if (lenk == 4 && score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}

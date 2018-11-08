package test001;

import java.util.Scanner;

public class ex019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[4][2];
		int score = 0;
		int cont = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println(i + 1 + "학년");
			for (int j = 0; j < 2; j++) {

				scores[i][j] = sc.nextInt();
				cont++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {

				score += scores[i][j];
			}
		}

		double avg = score / cont;
		System.out.println("평균" + avg);
	}
}

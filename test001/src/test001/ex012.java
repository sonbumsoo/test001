package test001;

import java.util.Random;
import java.util.Scanner;

public class ex012 {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);

		int[][] fr = new int[5][5];
		int[][] temp = new int[2][2];
		int x = 0;
		int y = 0;
		int x1 = 0;
		int y1 = 0;

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				fr[i][j] = rn.nextInt(4);
				System.out.print(fr[i][j]);
			}
			System.out.println();
		}

		while (true) {
			System.out.println("옮길 카드 를 선택 하세요");
			x = sc.nextInt();
			y = sc.nextInt();

			temp[1][1] = fr[x][y];

			System.out.println("옮길 위치를 선택 하세요");
			x1 = sc.nextInt();
			y1 = sc.nextInt();

			temp[0][0] = fr[x1][y1];
			fr[x1][y1] = fr[x][y];
			fr[x1][y1] = temp[1][1];
			fr[x][y] = temp[0][0];

			for (int i = 0; i <= 4; i++) {
				for (int j = 0; j <= 4; j++) {
					System.out.print(fr[i][j]);
				}
				System.out.println();
			}
		}
	}

}

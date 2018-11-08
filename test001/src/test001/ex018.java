package test001;

import java.util.Scanner;

public class ex018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] fr;
		String x = sc.next();
		String y = sc.next();
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);

		fr = new int[x1 + x1 + 1][y1 + y1 + 1];

		/*
		 * System.out.println(x1 +x1 +1); System.out.println(y1 +y1 +1);
		 */

		for (int i = 0; i < (x1 + x1 + 1); i++) {
			for (int j = 0; j < (x1 + x1 + 1); j++) {
				fr[i][j] = 8;
				if(fr[x1][y1] ==8) {
					fr[x1][y1] =0;
				}
			}
		}

		for (int i = 0; i < (x1 + x1 + 1); i++) {
			for (int w = 0; w < (x1 + x1 + 1); w++) {
				System.out.print(fr[i][w] + " ");
			}
			System.out.println();
		}

	}

}

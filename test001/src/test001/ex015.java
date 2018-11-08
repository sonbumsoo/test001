package test001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ex015 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList();

		int cont = 0;
		int sum = sc.nextInt();

		for (int x = 0; x <= sum; x++) {
			for (int y = 0; y <= sum; y++) {
				if ((3 * x) + (5 * y) == sum) {
					int h = x + y;
					list.add(h);

				}
			}
		}

		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println(min);
	}
}

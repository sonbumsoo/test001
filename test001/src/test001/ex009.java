package test001;

import java.util.Scanner;

public class ex009 {
	public static void main(String [] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월");
		int i = sc.nextInt();
		
		System.out.println("일");
		int x = sc.nextInt();

		
		String [][] date = {
						{"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE","WED"},
						{"THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED"},
						{"WED","FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"},
						{"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON"},
						{"TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU"},
						{"FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"},
						{"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON","TUE"},
						{"WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU","FRI"},
						{"SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"},
						{"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED"},
						{"THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI"},
						{"SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON", "TUE", "WED", "THU", "FRI", "SAT","SUN","MON"},
						};
		
		
		String [][] date1 = new String [12][];
		
		date1[1][1] = "MON";
		date1[1][2] = "TUE";
	}
}

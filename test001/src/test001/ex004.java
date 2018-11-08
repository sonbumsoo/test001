package test001;

public class ex004 {
	public static void main (String [] args) {
	
		
		for(int i =1; i<=9; i++) {
			for(int x= 2; x<=5; x++) {
				System.out.print(x+"x"+i+"="+(i*x)+"\t");
			}System.out.println();
		}System.out.println();
	
		for(int i =1; i<=9; i++) {
			for(int x= 6; x<=9; x++) {
				System.out.print(x+"x"+i+"="+(i*x)+"\t");
			}System.out.println();
		}
		
		
		for(int i = 1; i<=5; i++) {
			for(int s=2; s<i+1; s++) {
				System.out.print("0");
			}System.out.println("0");
		}		
		
		for(int i = 0; i<5; i++) {
			for(int s=0; s<5-i; s++) {
				System.out.print("0");
			}System.out.println("0");
		}		
		
		
		
		
		
	}

}

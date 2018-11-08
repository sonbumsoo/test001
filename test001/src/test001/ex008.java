package test001;

public class ex008 {
	public static void main(String[] agrs) {

	
		int sum = 0;
		int i = 0;

		while (true) {
			i++;
			if ((i % 2) == 1) {
				sum += i;
				if(sum<100) {
				//System.out.print(i+"+");
				}
			}
			
			if ((i % 2) == 0) {
				sum -= i;
				//System.out.print("("+"-"+i+")");
			}
			
			if(sum == 100 ) {
				//System.out.println("+"+i+"="+sum);
				System.out.println(i);
				break;
			}
			
		}
	}
}

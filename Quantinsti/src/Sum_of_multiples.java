
public class Sum_of_multiples {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		
		int sum=0;
		
		for (int i=1;i<1000;i++) {
			
			if(i % a == 0   || i % b == 0) {
				
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of multipe of 3 and 5 is " + sum);
	}

}

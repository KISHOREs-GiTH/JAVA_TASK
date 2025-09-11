package mc;

public class Sum_Eve_Odd {

	public static void main(String[] args) {
		int SumEve = 0;
		int SumOdd = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				SumEve+=i;
			}
			else {
				SumOdd+=i;
			}
		}
		System.out.println("Sum of Odd is :"+SumOdd);
		System.out.println("Sum of Even is: "+SumEve);

	}

}

package mc;

public class Pattern_Odd_Even {

	public static void main(String[] args) {
		int row = 5;
		int even = 2;
		int odd = 1;
//		
//		for(int i =1; i<=row; i++) {
//			for(int j=1; j<=i; j++) {
//				if(i % 2 ==0) {
//					System.out.print(even+" ");
//					even+=2;
//				}
//				else {
//					System.out.print(odd+" ");
//					odd+=2;
//				}
//			}
//			System.out.println();
//		}
		
		//even then odd
		for(int i =1; i<=row; i++) {
			for(int j =1; j<=i; j++) {
				if(i % 2 ==0 ) {
					System.out.print(odd+" ");
					odd+=2;
				}
				else {
					System.out.print(even+" ");
					even+=2;
				}
			}
			System.out.println();
		}

	}

}

package comPatern;

public class PatternCenterStar {
	public static void main(String[] args) {
		int row = 7;
		for(int i =1; i<=row; i++) {
			
			for(int s =row-i; s>0;s--) {
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//reverse
		for(int i = row; i>0; i--) {
			for(int s = 1; s<=row-i;s++) {
				System.out.print(" ");
			}
			for(int j =1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

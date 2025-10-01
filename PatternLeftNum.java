package comPatern;

public class PatternLeftNum{
	public static void main(String[] args) {
		int row = 7;
		for(int i =1; i<=row; i++) {
			
			for(int sp =1; sp<=row-i; sp++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
//		//same as reverse
		for(int i =row; i>0; i--) {
			
			for(int s = 1; s<=row-i;s++) {
				System.out.print(" ");
			}
			for(int j =1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

package mc;

public class Pattern_1stRow {

	public static void main(String[] args) {
		int row = 5;
		for(int i = 1; i<=row; i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second pattern ");
		
		//same rev
		for(int i = row; i>=1; i--) {
			for(int j =1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

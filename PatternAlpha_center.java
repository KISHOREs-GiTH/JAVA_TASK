package comPatern;

public class PatternAlpha_center {
	public static void main(String[] args) {
		int row = 7;
		for(int i = 1; i<=row; i++) {
			char ch = 'A';
			for(int sp = row-i; sp>0; sp--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		//reverse
		System.out.println();
		for(int i = row; i>0; i--) {
			char ch ='A';
			for(int s = 1; s<=row-i;s++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}

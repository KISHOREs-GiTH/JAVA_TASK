package comPatern;

public class PatternAlpha_right {
	public static void main(String[] args) {
		int row = 7; 
		
		for(int i = 1; i<=row; i++) {
			char ch = 'A';
			for(int j =1; j<=i;j++) {
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
		}
		
		//reverse
		System.out.println();
		for(int i = row; i>0; i--) {
			char ch = 'a';
			for(int j =1; j<=i;j++) {
				System.out.print(ch+ " " );
				ch++;
			}
			System.out.println();
		}
	}

}

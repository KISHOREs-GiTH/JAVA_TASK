package comPatern;

public class PatternRightNum {

	public static void main(String[] args) {
		int row = 7;
		for(int i =1; i<=row; i++) {
			for(int j =1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		//same rev
		for(int i = row; i>0;i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

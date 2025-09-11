package mc;

import java.util.Scanner;

public class Pos_neg_ze {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num: ");
	    int a = s.nextInt();
	    if(a>0) {
	    	System.out.println("It's a positive number..");
	    }
	    else if(a<0) {
	    	System.out.println("It is a negative num");
	    }
	    else {
	    	System.out.println("It is zero");
	    }
	    

	}

}

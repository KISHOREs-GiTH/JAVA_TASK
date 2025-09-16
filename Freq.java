package mc;

import java.util.Scanner;

public class Freq {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String freq = s.nextLine();
		System.out.println("Enter a char to check: ");
		char c = s.next().charAt(0);
		int count = 0;
		for(int i=0; i<freq.length();i++) {
			
			if(freq.charAt(i) == c) {
				count ++;
			}
		}
		System.out.println("Freq of "+c +" is "+count);
		
	
	}

}

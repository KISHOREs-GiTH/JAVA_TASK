package mc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num 1:");
		int num1 = s.nextInt();
		System.out.println("Enter a operator('+, -, *, /, %')");
		char c = s.next().charAt(0);
		System.out.println("Enter a num 2: ");
		int num2 = s.nextInt();
		int res = 0;
		switch(c) {
		case '+' : 
			res+= num1 + num2;
			break;
		case '-':
			res+= num2-num1; break;
		case '*': 
			res+= num1*num2; break;
		case '/':
			res+= num1/num2; break;
		case '%': 
			res+= num1%num2; break;
	    default:
	    	System.out.println("Invalid operator...");
		}
		System.out.println("Result is : "+ res);

	}

}

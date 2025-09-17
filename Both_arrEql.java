package mc;

import java.util.Arrays;
import java.util.Scanner;

public class Both_arrEql {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first array size: ");
		int size1 = s.nextInt();
		//converting into array size
		int arr1[] = new int[size1];
		System.out.println("Enter the element one by one: ");
		for(int i = 0; i<size1; i++) {
			arr1[i] = s.nextInt();
		}
		
		//second arr
		System.out.println("Enter the second array size:");
		int size2 = s.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter the values: ");
		for(int j = 0; j<size2; j++) {
			arr2[j] = s.nextInt();
		}
		for(int i = 0; i<size1;i++) {
		System.out.println("The values in the first arr are:"+arr1[i]);
		}
		System.out.println();
		for(int j = 0; j<size2; j++) {
			System.out.println("The values in the second arr are: "+arr2[j]);
		}
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Both are equal...");
		}
		else
			System.out.println("Not equal......");
		
	}

}

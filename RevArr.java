package mc;

import java.util.Scanner;

public class RevArr {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values: ");
		for(int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Array before Reversing: ");
		for(int i = 0; i<size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("After Reversing: ");
		for(int j = size-1; j>=0;j--) {
			System.out.println(arr[j]);
		}
		
	}

}

package my_pack;

import java.util.Scanner;

public class Even_Odd_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = s.nextInt();

        int[] num = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = s.nextInt();
        }

        int[] arrEven = new int[size];
        int[] arrOdd  = new int[size];
        int evenCount = 0;
        int oddCount  = 0;

        for (int k = 0; k < size; k++) {
            if (num[k] % 2 == 0) {
                arrEven[evenCount] = num[k];
                evenCount++;
            } else {
                arrOdd[oddCount] = num[k];
                oddCount++;
            }
        }

        System.out.println("Even numbers (" + evenCount + "):");
        for (int j = 0; j < evenCount; j++) {
            System.out.print(arrEven[j] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers (" + oddCount + "):");
        for (int j = 0; j < oddCount; j++) {
            System.out.print(arrOdd[j] + " ");
        }
        System.out.println();
        s.close();
    }
}

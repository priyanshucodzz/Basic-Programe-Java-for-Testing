import java.util.*;

public class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int evencount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evencount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

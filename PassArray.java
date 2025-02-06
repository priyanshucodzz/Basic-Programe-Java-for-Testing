import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements from method:");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=" + (arr[i] + 1));
        }
    }
}

import java.util.Scanner;

public class FloydExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Floyd triangle: ");
        int n = sc.nextInt();
        int num = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num % 2);
                num++;
            }
            System.out.println();
        }
    }
}


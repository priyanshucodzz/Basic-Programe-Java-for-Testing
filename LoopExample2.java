import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of terms: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("sum of first " + n + " numbers=" + sum);
    }
}


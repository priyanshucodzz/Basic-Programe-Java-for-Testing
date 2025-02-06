import java.util.Scanner;

class FloydExample1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of Floyd triangle: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        
    }
}


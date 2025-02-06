import java.util.Scanner;

class FibonacciExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1, count = 2;
        
        System.out.println("Fibonacci Series:");
        System.out.println(first);
        if (n > 1) {
            System.out.println(second);
        }
        
        do {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
            count++;
        } while (count < n);
        
        scanner.close();
    }
}

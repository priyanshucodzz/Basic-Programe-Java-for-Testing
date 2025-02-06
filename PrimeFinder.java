import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        boolean isPrime = true;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime && num > 1) {
            System.out.println("The given no is prime");
        } else {
            System.out.println("The given no is not a prime");
        }
    }
}


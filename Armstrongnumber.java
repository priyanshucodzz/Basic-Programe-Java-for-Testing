import java.util.*;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");

        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

}

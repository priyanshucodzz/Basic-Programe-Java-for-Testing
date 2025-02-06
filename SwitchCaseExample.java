import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a letter R, G, B:");
        char choice = sc.next().toUpperCase().charAt(0);

        switch (choice) {
            case 'R':
                System.out.println("Your favorite color is Red");
                break;
            case 'G':
                System.out.println("Your favorite color is Green");
                break;
            case 'B':
                System.out.println("Your favorite color is Blue");
                break;
            default:
                System.out.println("Invalid choice! Please enter R, G, or B.");
        }

        sc.close();
    }
}

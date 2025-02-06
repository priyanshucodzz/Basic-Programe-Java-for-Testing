import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + num + "=" + (i * num));
        }
    }
}

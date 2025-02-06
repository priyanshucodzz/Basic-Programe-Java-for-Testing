import java.util.Scanner;

public class CallByObject {
    int a, b;

    void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        CallByObject obj = new CallByObject();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        obj.a = scanner.nextInt();
        System.out.println("Enter the second number");
        obj.b = scanner.nextInt();
        obj.swap();
        System.out.println("After swapping a = " + obj.a + " b = " + obj.b);
    }
}

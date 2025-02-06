import java.util.*;

public class CallbyValue {
    static void swap(int x, int y) {
        System.out.println("From method before swapping x= " + x + " y= " + y);
        x = x + 1;
        y = y + 1;
        System.out.println("From method after swapping x= " + x + " y= " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before calling method: x = " + a + " y = " + b);
        swap(a, b);
        System.out.println("After calling method: x = " + a + " y = " + b);

    }
}
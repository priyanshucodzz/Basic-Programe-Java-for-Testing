import java.util.*;


public class AscendingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the number to perform function:");
        System.out.println("1 --> Ascending\n2 --> Descending");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            Arrays.sort(numbers);
            System.out.println("Ascending order is:");
        } else if (choice == 2) {
            Arrays.sort(numbers);
            for (int i = 0; i < size / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[size - 1 - i];
                numbers[size - 1 - i] = temp;
            }
            System.out.println("Descending order is:");
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }
        
        for (int num : numbers) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}

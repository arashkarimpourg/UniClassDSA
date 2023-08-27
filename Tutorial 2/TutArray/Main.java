import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            System.out.print("Enter number: ");
            int num = input.nextInt();
            for (int j = 0; j < count; j++) {
                if (num == numbers[j]) {
                    System.out.println(num + " has already been entered");
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                numbers[count++] = num;
                int[] uniqueNumbers = new int[count];
                for (int k = 0; k < count; k++) {
                    uniqueNumbers[k] = numbers[k];
                }
                for (int k = 0; k < count; k++) {
                    System.out.print(uniqueNumbers[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

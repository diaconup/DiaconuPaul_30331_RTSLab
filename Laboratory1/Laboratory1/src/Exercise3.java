import java.util.Arrays;
import java.util.Random;

public class Exercise3 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();

        System.out.println("The Generated Random Numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }


        Arrays.sort(numbers);

        System.out.println("\nThe Sorted Numbers Are:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

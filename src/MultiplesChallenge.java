import java.util.Scanner;

public class MultiplesChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (2 < N ≤ 20): ");
        int N = scanner.nextInt();

        // Validate input constraints
        if (N <= 2 || N > 20) {
            System.out.println("Invalid input. Please enter an integer between 2 and 20.");
            return;
        }

        // Calculate and print the first 10 multiples
        for (int i = 1; i < 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}

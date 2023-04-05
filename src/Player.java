import java.util.Scanner;

public class Player {
        public static int getInput() {
                int input = 0;
                while (input < 1 || input > 3) {
                        System.out.println("Please enter a number between 1 and 3");
                        Scanner scanner = new Scanner(System.in);
                        input = scanner.nextInt();
                        if (input < 1 || input > 3)
                                System.out.println("Invalid input");
                }
                return input;
        }
}

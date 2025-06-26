import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to add.");
        System.out.println("Type 'N' or 'n' to exit.");

        while (true) {
            System.out.print("Enter an integer number: ");
            if (input.hasNextInt()) {
                int number = input.nextInt();
                sum += number;
            } else {
                String userInput = input.next();

                if (userInput.equalsIgnoreCase("n")) {
                    break;
                } else {

                }
            }
            System.out.println("The sum of the numbers is: " + sum);
            System.out.println("Invalid input.");
                }

    }
}

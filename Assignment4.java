import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password :");
        String pass = input.nextLine();

        int checks = 0;

        if (pass.length() >= 8) checks++;
        else System.out.println("Must be at least 8 Characters long. ");
        int hasUpper = 0, hasLower = 0, hasDigit = 0, hasSpecialChar = 0;
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isUpperCase(c)) hasUpper = 1;
            if (Character.isLowerCase(c)) hasLower = 1;
            if (Character.isDigit(c)) hasDigit = 1;
            if (!Character.isLetterOrDigit(c)) hasSpecialChar = 1;
        }
        if (hasUpper == 0) System.out.println("Must contain at least one UpperCase letter. ");
        else checks++;
        if (hasLower == 0) System.out.println("Must contain at least one LowerCase letter. ");
        else checks++;
        if (hasDigit == 0) System.out.println("Must contain at least one Digit. ");
        else checks++;
        if (hasSpecialChar == 0) System.out.println("Must contain at least one Special Character. ");
        else checks++;

        if (checks == 5) {
            System.out.println("strong password !!!");
        }

    }
}

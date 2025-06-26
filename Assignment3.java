import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();

                boolean ispalindrome = true;
                int start = 0;
                int end = str.length() - 1;

                while (start < end) {
                    if (str.charAt(start) != str.charAt(end)) {
                        ispalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }
                if (ispalindrome) {
                   System.out.println("the string is a palindome.");
                } else {
                    System.out.println("the string is not a palindrome.");
                }

    }
}

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner as we no longer need it
        scanner.close();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        // Convert the number to a string for easy comparison
        String original = Integer.toString(num);

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if the original and reversed strings are the same
        return original.equals(reversed);
    }
}

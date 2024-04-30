package work;
import java.util.Scanner;

public class PasswordStrength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        int steps = solve(password);
        System.out.println("Minimum number of steps required: " + steps);

        scanner.close();
    }

    public static int solve(String str) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasRepeating = false;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (i >= 2 && str.charAt(i - 2) == ch && str.charAt(i - 1) == ch) {
                hasRepeating = true;
            }
        }

        int steps = 0;
        if (!hasLower) {
            steps++;
        }
        if (!hasUpper) {
            steps++;
        }
        if (!hasDigit) {
            steps++;
        }

        if (length < 6) {
            steps += 6 - length;
        } else if (length > 20) {
            steps += length - 20;
        }

        if (hasRepeating) {
            steps++;
        }

        return steps;
    }
}

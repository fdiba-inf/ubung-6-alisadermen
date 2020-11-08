package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
        int numbers = 0;
        boolean result = true;
        System.out.println("Enter your password:");
        String password = input.nextLine();
        if (password.length() < 8) {
            result = false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                result = false;
            }
            if (Character.isDigit(password.charAt(i))) {
                numbers++;
            }
        }
        if (numbers < 2) {
            result = false;
        }
        if (result) {
            System.out.println("Password valid!");
            break;
        } else {
            System.out.println("Password invalid!");
        }
    }
}
}

package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = input.nextInt();
        assert num > 0: "Number should be greater than 0!";
        String number = num.toString();
        String reversedNumber = "";
        for (int i = number.length()-1; i >= 0; i--) {
            reversedNumber += number.charAt(i);
        }
        boolean result = true;
        for (int i = 0; i < number.length(); i++) {
            if (!(number.charAt(i) == reversedNumber.charAt(i))) {
                result = false;
                break;
            }
        }
        System.out.println("Palindrome: " + result);
    }
}

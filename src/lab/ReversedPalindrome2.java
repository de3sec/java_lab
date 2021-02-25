package lab;

public class ReversedPalindrome2 {
    public static void main(String[] args) {
        String input = "ulu";
        String reversedString = reverseString(input);

        if (input.equals(reversedString))
        {
            System.out.println(input + " is a palindrome");
        }
        else
        {
            System.out.println(input + " is not a palindrome");
        }
    }

    private static String reverseString(String check) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(check);

        return stringBuilder.reverse().toString();
    }
}

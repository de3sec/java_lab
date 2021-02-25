package lab;

public class ReversedPalindrome {
    public static void main(String[] args) {
        String input = "civic";
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

        StringBuffer buffer = new StringBuffer();
        buffer.append(check);

        return buffer.reverse().toString();
    }

}

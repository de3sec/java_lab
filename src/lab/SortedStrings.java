package lab;

import java.util.Arrays;

public class SortedStrings {
    public static void main(String args[])
    {

        String[] smartphones = {"Pixel5","Pixel4","Pixel 3","Iphone 11","Iphone 12"};
        Arrays.sort(smartphones);
        System.out.println("The top flagship phones in the market are\n"+Arrays.toString(smartphones));
    }
}

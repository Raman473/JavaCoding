package JavaCoding;

import java.util.Scanner;

public class OddorEven {
    public static String isOddorEven(int n)
    {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
    public static void main(String[] args)
    {
        int value;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        value = s.nextInt();
        System.out.println(value + " is " + isOddorEven(value));
    }
    //we can use ternary operators when the code is small if the code logic is increase then the readability of the code decreases with ternary operators
}

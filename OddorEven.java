package JavaCoding;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args)
    {
        int value;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        value = s.nextInt();
        System.out.println(value + " is " + (value % 2 == 0 ? "Even" : "Odd"));
    }
}

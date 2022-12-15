package JavaCoding;

import java.util.Scanner;

public class ReverseString {
    public static int length(String originalString)
    {
        int len;
        originalString = originalString+'\0';
        for(len=0;originalString.charAt(len) != '\0'; len++);
        //System.out.println(len);
        return len-1;
    }
    public static int length(char[] originalString)
    {
        int len=0;
        for(char c : originalString){
            len++;
        }
        //System.out.println(len);
        return len-1;
    }
    public static String reverseStringMethod(String originalString)
    {
        String reversedString="";
        int len = length(originalString);
        int i=len;
        while(i>=0)
        {
            reversedString+=originalString.charAt(i);
            i--;
        }
        return reversedString;
    }
    public static String reverseStringMethod(char[] originalString)
    {
        int len = length(originalString);
        int left=0;
        int right=len;
        while(left < right)
        {
            char c=originalString[left];
            originalString[left]=originalString[right];
            originalString[right]=c;
            left++;
            right--;
        }
        return String.valueOf(originalString);
    }
    public static String reverseStringMethod(StringBuilder originalString)
    {
        return originalString.reverse().toString();
    }
    public static void main(String args[])
    {
        String originalString = new String();
        int choice;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String to Reverse");
        originalString= s.nextLine();
        System.out.println("Enter choice to print Reversed String");
        System.out.println("1 - With using charAt()\n2 - Without using charAt()\n3 - With using builtin function");
        choice=s.nextInt();
        switch (choice){
            case 1 :
                System.out.println("With using charAt()\n"+reverseStringMethod(originalString));
                break;
            case 2 :
                System.out.println("Without using charAt()\n"+reverseStringMethod(originalString.toCharArray()));
                break;
            case 3 :
                System.out.println("With using builtin function\n"+reverseStringMethod(new StringBuilder(originalString)));
                break;
            default:
                System.out.println("Enter Valid Option");
        }
    }
}

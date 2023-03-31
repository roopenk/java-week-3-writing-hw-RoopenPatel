import java.util.Scanner;

/** A Java program to check whether the input value is a number or an alphabet or a symbol
 */

public class Program_12_FindInputValue {
    public static void main(String[] args) {
        // scanner declaration to accept the input from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Character : ");
        char ch = scan.next().charAt(0);
        // object creation
        Program_12_FindInputValue obj = new Program_12_FindInputValue();
        obj.checkInputValueIsAlphabetNumberOrSymbol(ch);
        // closing the scanner object
        scan.close();
    }
    // Checking the whether the inputted character is an alphabet or a digit or a symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
      if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
          System.out.println(ch + " Is An Alphabet");
      else if(ch >= '0' && ch <= '9')
          System.out.println(ch + " Is A Digit");
      else
          System.out.println(ch + " Is A Symbol");
    }
}

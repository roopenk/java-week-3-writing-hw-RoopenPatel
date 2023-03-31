import java.util.Scanner;

/** A java program to input any number and find out if it's odd or even
 *
 */

public class Program_6_OddEven {
    public static void main(String[] args) {
        // declaring the scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter Any Number : ");
        int number = scan.nextInt();
        Program_6_OddEven oddEven = new Program_6_OddEven(); // object creation
        System.out.println(number + " Is " + oddEven.isItEvenOrOddNumber(number) + " Number");
        // closing the scanner object
        scan.close();
    }
    // checking the number for being it odd or even
    public String isItEvenOrOddNumber(int number){
        if (number % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}

// A java program to check whether the entered year is a leap year or not

import java.util.Scanner;

public class Program_2_LeapYear {
    public static void main(String[] args) {
        // scanner declaration to accept inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter The Year : ");
        int year = scan.nextInt();
        Program_2_LeapYear leapYear = new Program_2_LeapYear();
        leapYear.isItLeapYear(year);
        scan.close();
    }
    public void isItLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The Year " + year + " Is A Leap Year");
            return;
        }
        System.out.println("The Year " + year + " Is Not A Leap Year");
    }
}

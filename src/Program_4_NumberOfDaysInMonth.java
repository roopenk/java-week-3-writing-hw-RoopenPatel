/**
 * Number of days in a month
 * write a method isLeapYear with a parameter of type int named year
 * the parameter needs to be greater than or equal to 1 and less than ot equal to 9999
 * if the parameter is not in the range then return false
 * otherwise, if it;s within the range then calculate if the year is a leap year and return if it is,
 * otherwise return false
 * a year is a lepa year if it's divisible by 4 but not by 100, or it's divisible by 400
 * example of output:
 * isLeapYear(-1600); should return false since the parameter is not within the range(1-9999)
 * isLeapYear(1600); should return true since 1600 is a leap year
 * isLeapYear(20147); should return false since 2017 is not a leap year
 * isLeapYear(2000); should return true since 2000 is a leap year
 * wrote another method getDaysInMonth with two parameters month and year, both of int type
 * if parameter month is < 1 or > 12 then return -1
 * if parameter year is <1  or > 9999 then return -1
 * this method needs to return the number of days in the month, be careful about leap years as they have 29 days in
 * the month of february
 * you should check the leap year by using the method isLeapYear described above
 * example:
 * getDaysInMonth(1, 2020); should return 31 since january has 31 days
 * getDaysInMonth(2, 2020); should return 29 since february has 29 days and 2020 is a leap year
 * getDaysInMonth(2, 2018); should return 28since february has 28 days and 2018 is not a leap year
 * getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid
 * getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of  1 to 9999
 * Hint: use switch statement
 * Note: Methods isLeapYear and getDaysInMonth need to public static
 */

public class Program_4_NumberOfDaysInMonth {
    public static void main(String[] args) {
        // Leap year 4 outputs
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println("------------------------------------------------");
        // 5 outputs to get days in a month
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    // checking for a leap year
    public static boolean isLeapYear(int years) {
        boolean b;
        if (years <= 1 || years >= 9999) {
            b = false;
        } else {
            b = years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
        }
        return b;
    }

    // calculating the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }
}

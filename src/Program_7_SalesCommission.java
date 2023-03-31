import java.util.Scanner;

/**
 * A Java program to input seller id, sales, seller's name, sales amount and basic salary
 * then find this sales
 * commission
 * sales amount >= 50,000 then 35%
 * sales amount >= 30,000 then 20%
 * sales amount >= 20,000 then 10%
 * sales amount >= 10,000 then 5%
 * sales amount >= 5,000 then 2%
 */

public class Program_7_SalesCommission {
    public static void main(String[] args) {
        // Scanner declaration to accept the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Seller Name : ");
        String name = scan.nextLine();
        System.out.println("Please Enter ID ; ");
        int sellerId = scan.nextInt();
        System.out.println("Please Enter Sales Amount : ");
        int salesAmount = scan.nextInt();
        System.out.println("Please Enter The Basic Salary : ");
        int basicSalary = scan.nextInt();

        // creating the object to call the mothods
        Program_7_SalesCommission obj = new Program_7_SalesCommission();
        int grossSalary = basicSalary + obj.calculateCommission(salesAmount);
        System.out.println("Seller Name        : " + name);
        System.out.println("Seller ID          : " + sellerId);
        System.out.println("Sales Amount       : " + salesAmount);
        System.out.println("Basic Salary       : " + basicSalary);
        System.out.println("Gross Salary       : " + grossSalary);
        // closing the scanner object
        scan.close();
    }

    // calculating sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission : " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission : " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission : " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission : " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission : " + commission);
        }
        return commission;
    }
}

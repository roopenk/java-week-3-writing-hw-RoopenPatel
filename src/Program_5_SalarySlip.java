import java.util.Scanner;

/**
 * A java program to print the payslip by accepting the employee id, name, basic salary and then
 * print HRA, TA, DA, PF and gross salary
 * HRA = 10% of basic salary
 * DA = 8% of basic salary
 * TA =  9% of basic salary
 * PF = 20% less from basic salary
 * Gross salary = basic salary + HRA + TA + DA - PF
 * print the payslip in the following format:
 * ------------------------------------
 * |           Salary Slip            |
 * |----------------------------------|
 * |  Employee ID   :  2564           |
 * |  Employee Name :  Jay            |
 * |----------------------------------|
 * |  Basic Salary  :  25000.0        |
 * |  HRA 10%       :  2500           |
 * |  DA 8%         :  2250           |
 * |  TA 9%         :  2000           |
 * |  PF -20%       :  5000           |
 * |----------------------------------|
 * |  Gross Salary  :  26750.0        |
 * |==================================|
 */

public class Program_5_SalarySlip {
    public static void main(String[] args) {
        // scanner declaration to accept the inputs from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Employee Name : ");
        String name = scan.nextLine();
        System.out.println("PLease Enter Employee ID : ");
        int employeeId = scan.nextInt();
        System.out.println("Please Enter The Basic Salary : ");
        double basicSalary = scan.nextDouble();

        // calculating HRA, DA, TA And PF
        double hRA = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = calculatePF(basicSalary);

        // calculating the gross salary
        double grossSalary = basicSalary + hRA + da + ta - pf;

        System.out.println("--------------------------------------");
        System.out.println("|           Salary Slip              |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Employee ID      : " + employeeId + "       |");
        System.out.println("|   Employee Name    : " + name + "          |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Basic Salary     : " + basicSalary + "      |");
        System.out.println("|   HRA 10%          : " + hRA + "         |");
        System.out.println("|   TA 8%            : " + ta + "         |");
        System.out.println("|   DA 9%            : " + da + "         |");
        System.out.println("|   PF - 20%         : " + pf + "          |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Gross Salary     : " + grossSalary + "      |");
        System.out.println("|------------------------------------|");
        // closing the scanner object
        scan.close();
    }

    // calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    // calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    // calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    // calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}

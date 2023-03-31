/**
 * A Java program to print the number between 1 and 100 which are divided by 3 and 5 separately
 */

public class Program_11_DivideByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("The Numbers Divisible By 3 Are : ");
        for (int i = 1; i <= 100; i++) {
            dividedByThree(i);
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("The Numbers Divisible By 5 Are : ");
        for (int j = 1; j <= 100; j++) {
            dividedByFive(j);
        }
    }

    // Divided by 3 method
    public static void dividedByThree(int number) {
        if (number % 3 == 0)
            System.out.print(number + ",");
    }

    // Divided by 5 method
    public static void dividedByFive(int number) {
        if (number % 5 == 0)
            System.out.print(number + ",");
    }

}

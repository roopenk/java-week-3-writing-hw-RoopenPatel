import java.util.Scanner;

/**
 * input any alphabet from 'A' to 'F' and print their city names accordingly
 * any other alphabet should be invalid entry using switch statement
 */

public class Program_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        // scanner declaration to accept the input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Alphabet Between A And F : ");
        String city = scan.next().toUpperCase();
        // creating an object to call the instance method
        Program_9_PrintCityNameWithSwitch cityName = new Program_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        // closing the scanner object
        scan.close();
    }

    // printing the city names
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The Alphabet Entered Is Not Between A And F");
        }
    }
}

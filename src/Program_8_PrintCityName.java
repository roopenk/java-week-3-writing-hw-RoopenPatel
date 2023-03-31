import java.util.Scanner;

/** input any alphabet between A to F and print their city names accordingly (use if else)
 * any other alphabet should be an invalid entry
 */
public class Program_8_PrintCityName {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Alphabet Between A And F : ");
        char city = scan.next().charAt(0);
        // object creation
        Program_8_PrintCityName cityName = new Program_8_PrintCityName();
        cityName.printCityName(city);
        // closing the scanner object
        scan.close();
    }
    // printing the city name
    public void printCityName(char city){
        if (city =='A' || city == 'a')
            System.out.println("Aberdeen");
        else if (city == 'B' || city =='b')
            System.out.println("Belfast");
        else if (city == 'C' || city == 'c')
            System.out.println("Cambridge");
        else if (city == 'D' || city == 'd')
            System.out.println("Derby");
        else if (city == 'E' || city == 'e')
            System.out.println("Edinburgh");
        else if  (city == 'F' || city == 'f')
            System.out.println("Feltham");
        else
            System.out.println("The Alphabet Entered Is Not Between A And F");
    }
}

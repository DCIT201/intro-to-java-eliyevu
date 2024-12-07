import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        //Create a scanner object to read user's input
        Scanner scanner = new Scanner(System.in);
        //Prompt user to select an option
        System.out.println("Temperature Converter\nPlease select an option");
        System.out.println("1> Convert Celsius to Fahrenheit \n2> Convert Fahrenheit to Celsius");
        int option = scanner.nextInt();//User's input for preferred option
        //Check the user's choice and perform the corresponding conversion
        if (option == 1) {
            //Conversion from Celsius to Fahrenheit
            System.out.println("Enter temperature in Celsius");
            double temperatureInCelsius = scanner.nextDouble();
            double temperatureInFahrenheit =  (temperatureInCelsius * 9 / 5 + 32);
            System.out.println(temperatureInCelsius + "˚C is equal to " + temperatureInFahrenheit + "˚F.");

        } else if (option == 2) {
            //Conversion from Fahrenheit to Celsius
            System.out.println("Enter temperature in Fahrenheit");
            double temperatureInFahrenheit = scanner.nextDouble();
            double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5/9;
            System.out.println(temperatureInFahrenheit + "˚F is equal to " + temperatureInCelsius + "˚C.");
        } else{
            //Invalid option
            System.out.println("Invalid option. Please select a valid option.");
        }
        scanner.close(); //Close scanner object
    }


}

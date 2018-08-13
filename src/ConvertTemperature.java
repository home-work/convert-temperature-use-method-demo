import java.util.Scanner;

public class ConvertTemperature{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menu
        System.out.println("\tCONVERT TEMPERATURE APPLICATION DEMO");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");

        while (true) {
            System.out.println("Enter your selection:");
            int selectionUser = scanner.nextInt();
            switch (selectionUser) {
                case 1:
                    System.out.println("\tFahrenheit to Celsius");
                    System.out.println("Enter Fahrenheit:");
                    break;
                case 2:
                    System.out.println("Celsius to Fahrenheit");
                    System.out.println("Enter Celsius:");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Value Error");
            }
        }
    }
}

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu();

        double fahrenheit = 0.0;
        double celsius = 0.0;

        while (true) {
            String answer = "";
            System.out.println("Enter your selection:");
            int selectionUser = scanner.nextInt();
            switch (selectionUser) {
                case 1:
                    fahrenheitToCelsius(fahrenheit, celsius);
                    System.out.println("Do you want to continue?(y/n)");
                    answer = scanner.next();
                    if ("y".equals(answer)) {
                        continue;
                    } else {
                        System.exit(0);
                    }
                    break;
                case 2:
                    celsiusToFahrenheit(fahrenheit, celsius);
                    System.out.println("Do you want to continue?(y/n)");
                    answer = scanner.next();
                    if ("y".equals(answer)) {
                        continue;
                    } else {
                        System.exit(0);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Value Error");
            }
        }
    }

    private static void fahrenheitToCelsius(double f, double c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tFahrenheit to Celsius");
        System.out.println("Enter Fahrenheit:");
        f = scanner.nextFloat();
        c = (5.0 / 9) * (f - 32);
        System.out.println("Celsius = " + c + " C");
    }

    private static void celsiusToFahrenheit(double f, double c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tCelsius to Fahrenheit");
        System.out.println("Enter Celsius:");
        c = scanner.nextFloat();
        f = c / 5.0 * 9 + 32;
        System.out.println("Fahrenheit = " + f + " F");
    }

    private static void displayMenu() {
        //Menu
        System.out.println("\tCONVERT TEMPERATURE APPLICATION DEMO");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
    }
}

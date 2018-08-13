import java.util.Scanner;

public class ConvertTemperature{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menu
        System.out.println("\tCONVERT TEMPERATURE APPLICATION DEMO");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");

        double fahrenheit = 0.0;
        double celsius = 0.0;
        String answer = "";

        while (true) {
            System.out.println("Enter your selection:");
            int selectionUser = scanner.nextInt();
            switch (selectionUser) {
                case 1:
                    System.out.println("\tFahrenheit to Celsius");
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = scanner.nextFloat();
                    celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println("Celsius = " + celsius + " C");
                    System.out.println("Do you want to continue?(y/n)");
                    answer = scanner.next();
                    if ("y".equals(answer)) {
                        continue;
                    } else {
                        System.exit(0);
                    }
                    break;
                case 2:
                    System.out.println("\tCelsius to Fahrenheit");
                    System.out.println("Enter Celsius:");
                    celsius = scanner.nextFloat();
                    fahrenheit = celsius / 5.0 * 9 + 32;
                    System.out.println("Fahrenheit = " + fahrenheit + " F");
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
}

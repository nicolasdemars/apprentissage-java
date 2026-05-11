import java.util.Scanner;

public class projet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PROJET 1 ===");
        System.out.print("Entrez votre nom : ");
        String name = scanner.nextLine();
        System.out.print("Entrez les kilomètres : ");
        double km = scanner.nextDouble();
        double miles = km * 0.621371;
        System.out.print("Entrez les degrés Celsius : ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("Votre nom est : " + name + "\nLe nombre de miles est : " + miles
                + "\nLa température en kelvin est : " + kelvin);
    }
}
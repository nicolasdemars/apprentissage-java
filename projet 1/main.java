import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("=== PROJET 1 ===");
        // System.out.print("Entrez votre nom :");
        // String name1 = scanner.nextLine();
        // System.out.print("Entrez les kilomètres : ");
        // double km = scanner.nextDouble();
        // double miles = km * 0.621371;
        // System.out.print("Entrez les degrés Celsius : ");
        // double celsius = scanner.nextDouble();
        // double kelvin = celsius + 273.15;
        // System.out.println("Votre nom est : " + name + "\nLe nombre de miles est : "
        // + miles
        // + "\nLa température en kelvin est : " + kelvin);
        // System.out.println("\n=== PROJET 2 ===");
        // System.out.print("Entrez votre nom: ");
        // String name2 = scanner.nextLine();
        // System.out.println("\nSaisissez 4 notes: ");
        // System.out.print("Note 1: ");
        // double note1 = scanner.nextDouble();
        // System.out.print("Note 2: ");
        // double note2 = scanner.nextDouble();
        // System.out.print("Note 3: ");
        // double note3 = scanner.nextDouble();
        // System.out.print("Note 4: ");
        // double note4 = scanner.nextDouble();
        // double moyenne = (note1 + note2 + note3 + note4) / 4.0;
        // String competence;
        // if (moyenne < 4) {
        // competence = "Resit";
        // } else if (moyenne >= 4 && moyenne < 8) {
        // competence = "Need Work";
        // } else if (moyenne >= 8 && moyenne < 12) {
        // competence = "Basic";
        // } else if (moyenne >= 12 && moyenne < 15) {
        // competence = "Solid";
        // } else {
        // competence = "Outstanding";
        // }
        // String rattrapage = (moyenne < 10) ? " vous irez au rattrapage" : "vous
        // n'irez pas au rattrapage";

        // System.out.print("Bonjour " + name2 + " , actuellement votre moyenne est de "
        // + moyenne
        // + " vous avez donc une compétence: " + competence + "," + rattrapage);
        System.out.print("=== Projet 3 ===");
        int aleatoire = (int) (Math.random() * 100) + 1; // Car Math.random() prends en compte des nombre flottant entre
                                                         // 0 et 0.99 donc pour avoir un nombre entre 1 et 100 on
                                                         // additionne 1
        System.out.print("On va jouer au juste prix !");
        System.out.print("\nDevine mon numéro: ");
        int compteur = 0;
        while (true) {
            int user = scanner.nextInt();
            compteur += 1;
            if (aleatoire != user) {
                int comparaison = aleatoire - user;
                if (comparaison < 0) {
                    System.out.print("Plus bas ! Essaye encore une fois: ");
                } else {
                    System.out.print("Plus haut ! Essaye encore une fois: ");
                }
            } else {
                break;
            }
        }
        System.out.print("Bien joué, tu as trouvé le numéro après " + compteur + " fois");
        scanner.close();
    }
}
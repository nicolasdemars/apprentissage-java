import java.util.Scanner;

public class projet3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n=== Projet 3 ===");
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
    }
}
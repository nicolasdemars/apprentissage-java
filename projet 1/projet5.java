import java.util.Scanner;

public class projet5 {
    static int addition() {
        System.out.println("Combien de nombre souhaitez vous additionnez ? ");
        Scanner scanner = new Scanner(System.in);
        int quantite = scanner.nextInt();
        int[] nombres = new int[quantite];

        for (int i = 0; i < quantite; i++) {
            System.out.print("Note de l'étudiant " + (i + 1) + " : ");
            nombres[i] = scanner.nextInt();
        }
        int somme = 0;
        for (int i = 0; i < quantite; i++) {
            somme += nombres[i];
        }
        return somme;
    }

    public static void main(String[] args) {
        System.out.println("\n=== Projet 5 ===");
        System.out.println(
                "Bienvenue dans le menu de la calculatrice, tu peux retrouvez différentes fonctionnalités: \n -A : pour additionner plusieurs nombres\n -F : Pour calculer le factorielle d'un nombre\n -P : Pour vérifier si un nombre est premier\n -M : Pour afficher la table de mutliplication\n -Pu : Pour mettre à la puissance\n Merci de sélectionner une de ces fonctionnalités: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String choix = scanner.nextLine();
            switch (choix) {
                case "A":
                    // a
                    break;
                case "F":
                    // mmm
                    break;
                case "P":
                    // mmm
                    break;
                case "M":
                    // mmm
                    break;
                case "Pu":
                    // mmm
                    break;
            }
        }
    }
}
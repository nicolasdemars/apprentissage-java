import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class projet5 {
    static int addition() {
        System.out.println("Combien de nombre souhaitez vous additionnez ? ");
        Scanner scanner = new Scanner(System.in);
        int quantite = scanner.nextInt();
        int[] nombres = new int[quantite];

        for (int i = 0; i < quantite; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            nombres[i] = scanner.nextInt();
        }
        int somme = 0;
        for (int i = 0; i < quantite; i++) {
            somme += nombres[i];
        }
        return somme;
    }

    static int factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nombre ? ");
        int n = scanner.nextInt();
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }

    static boolean premier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est votre nombre: ");
        int n = scanner.nextInt();
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("\n=== Projet 5 ===");
        while (true) {
            System.out.println(
                    "Bienvenue dans le menu de la calculatrice, tu peux retrouver différentes fonctionnalités:");
            System.out.println("- A : pour additionner plusieurs nombres");
            System.out.println("- F : pour calculer la factorielle d'un nombre");
            System.out.println("- P : pour vérifier si un nombre est premier");
            System.out.println("- M : pour afficher la table de multiplication");
            System.out.println("- Pu : pour mettre à la puissance");
            System.out.println("- Q : pour quitter");
            System.out.print("Merci de sélectionner une fonctionnalité : ");
            Scanner scanner = new Scanner(System.in);
            String choix = scanner.nextLine();
            switch (choix) {
                case "A":
                    int resultat1 = addition();
                    System.out.println("La somme est : " + resultat1);
                    break;
                case "F":
                    int resultat2 = factorielle();
                    System.out.println("Le factorielle est de : " + resultat2);
                    break;
                case "P":
                    boolean resultat3 = premier();
                    if (resultat3 == true) {
                        System.out.println("Le nombre est premier");
                    } else {
                        System.out.println("le nombre n'est pas premier");
                    }
                    break;
                case "M":
                    // mmm
                    break;
                case "Pu":
                    // mmm
                    break;
                case "Q":
                    System.out.println("Fin du programme.");
                    return;
            }
        }
    }
}
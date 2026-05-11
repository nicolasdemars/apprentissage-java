import java.util.Scanner;

public class projet4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Projet 4 ===");
        System.out.print("Combien y'a t'il d'étudiants ? ");
        int etudiants = scanner.nextInt();

        int[] notes = new int[etudiants];

        for (int i = 0; i < etudiants; i++) {
            System.out.print("Note de l'étudiant " + (i + 1) + " : ");
            notes[i] = scanner.nextInt();
        }

        int somme = 0;
        int min = notes[0];
        int max = notes[0];

        for (int i = 0; i < etudiants; i++) {
            somme += notes[i];

            if (notes[i] < min) {
                min = notes[i];
            }

            if (notes[i] > max) {
                max = notes[i];
            }
        }
        double moyenne = (double) somme / etudiants;

        System.out.println("\nLa moyenne est : " + moyenne);
        System.out.println("La note minimum est : " + min);
        System.out.println("La note maximum est : " + max);
    }
}

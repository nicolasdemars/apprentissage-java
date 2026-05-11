import java.util.Scanner;

public class projet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== PROJET 2 ===");
        System.out.print("Entrez votre nom: ");
        String name2 = scanner.nextLine();
        System.out.println("\nSaisissez 4 notes: ");
        System.out.print("Note 1: ");
        double note1 = scanner.nextDouble();
        System.out.print("Note 2: ");
        double note2 = scanner.nextDouble();
        System.out.print("Note 3: ");
        double note3 = scanner.nextDouble();
        System.out.print("Note 4: ");
        double note4 = scanner.nextDouble();
        double moyenne = (note1 + note2 + note3 + note4) / 4.0;
        String competence;
        if (moyenne < 4) {
            competence = "Resit";
        } else if (moyenne >= 4 && moyenne < 8) {
            competence = "Need Work";
        } else if (moyenne >= 8 && moyenne < 12) {
            competence = "Basic";
        } else if (moyenne >= 12 && moyenne < 15) {
            competence = "Solid";
        } else {
            competence = "Outstanding";
        }
        String rattrapage = (moyenne < 10) ? " vous irez au rattrapage" : "vous n'irez pas au rattrapage";
        System.out.print("Bonjour " + name2 + " , actuellement votre moyenne est de " + moyenne
                + " vous avez donc une compétence: " + competence + ", " + rattrapage);
    }
}
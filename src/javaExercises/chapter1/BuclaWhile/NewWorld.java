import java.util.Scanner;

public class NewWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Ne World!");
        System.out.println("Choose your character:");
        System.out.println("1. Argonian");
        System.out.println("2. Breton");
        System.out.println("3. Dark Elf");
        System.out.println("4. High Elf");
        System.out.println("5. Imperial");
        System.out.println("6. Orc");
        System.out.println("7. The unlucky one");

        System.out.print("Enter the number of your chosen character: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String characterName = "";

        switch (choice) {
            case 1:
                characterName = "Argonian";
                break;
            case 2:
                characterName = "Breton";
                break;
            case 3:
                characterName = "Dark Elf";
                break;
            case 4:
                characterName = "High Elf";
                break;
            case 5:
                characterName = "Imperial";
                break;
            case 6:
                characterName = "Orc";
                break;
            case 7:
                characterName = "The unlucky one";
                break;
            default:
                System.out.println("Invalid choice. You are The unlucky one.");
                break;
        }

        System.out.println("You've chosen " + characterName + " as your character.");

        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();

        System.out.println("Welcome, " + playerName + "! Enjoy your adventure in Ne World.");

        // Close the scanner
        scanner.close();
    }
}
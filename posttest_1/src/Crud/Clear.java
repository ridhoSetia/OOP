package Crud;

public class Clear {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n");
        System.out.println("\n");
    }
}

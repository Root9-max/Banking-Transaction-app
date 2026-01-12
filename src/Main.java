import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Create account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Create username: ");
        String username = scanner.nextLine();

        System.out.print("Create password: ");
        String password = scanner.nextLine();

        Account account = new Account(name, username, password);

        System.out.println("\n--- Login ---");

        System.out.print("Username: ");
        String inputUser = scanner.nextLine();

        System.out.print("Password: ");
        String inputPass = scanner.nextLine();

        if (!account.authenticate(inputUser, inputPass)) {
            System.out.println("Authentication failed.");
            return;
        }

        System.out.println("Login successful.");

    }
}

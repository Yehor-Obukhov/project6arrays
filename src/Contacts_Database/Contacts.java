package Contacts_Database;
import java.util.Scanner;
public class Contacts {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] contacts = new String[100];
        int count = 0;

        while (true) {
            System.out.println(" CONTACTS MENU ");
            System.out.println("1. Add contacts");
            System.out.println("2. Show contacts");
            System.out.println("3. Search in contacts");
            System.out.println("4. Edit contact");
            System.out.println("5. Delete contact");
            System.out.println("6. Delete All");
            System.out.println("7. Add sample contacts");
            System.out.println("0. Exit");
            System.out.print("Choose action: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter new contacts (press Enter or 'x' on empty line to stop):");
                    while (count < contacts.length) {
                        String line = scanner.nextLine();
                        if (line.isEmpty() || line.equalsIgnoreCase("x")) {
                            break;
                        }
                        contacts[count++] = line;
                    }
                    break;

                case "2":
                    System.out.println(" List of Contacts ");
                    if (count == 0) {
                        System.out.println("No contacts stored yet.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + contacts[i]);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Enter search phrase: ");
                    String phrase = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (contacts[i] != null && contacts[i].contains(phrase)) {
                            System.out.println((i + 1) + ". " + contacts[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No contacts matching '" + phrase + "' were found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter contact number to edit (1 to " + count + "): ");
                    try {
                        int userNum = Integer.parseInt(scanner.nextLine());
                        int editIdx = userNum - 1;

                        if (editIdx >= 0 && editIdx < count) {
                            System.out.println("Current value: " + contacts[editIdx]);
                            System.out.print("Enter new value: ");
                            contacts[editIdx] = scanner.nextLine();
                            System.out.println("Contact updated.");
                        } else {
                            System.out.println("Invalid contact number! Please enter a number between 1 and " + count + ".");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter the list number (e.g. 1, 2), not text or phone number!");
                    }
                    break;

                case "5":
                    System.out.print("Enter contact number to delete (1 to " + count + "): ");
                    try {
                        int userNum = Integer.parseInt(scanner.nextLine());
                        int delIdx = userNum - 1;
                        if (delIdx >= 0 && delIdx < count) {
                            contacts[delIdx] = "DELETED";
                            System.out.println("Contact marked as DELETED.");
                        } else {
                            System.out.println("Invalid contact number! Please enter a number between 1 and " + count + ".");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter the list number like: (1, 2, 3...)");
                    }
                    break;

                case "6":
                    for (int i = 0; i < count; i++) {
                        contacts[i] = "";
                    }
                    count = 0;
                    System.out.println("All contacts deleted.");
                    break;

                case "7":
                    if (count + 3 <= contacts.length) {
                        contacts[count++] = "John Jonson, +380675553455";
                        contacts[count++] = "Elaine Griffin, +380634567890";
                        contacts[count++] = "Bob Ruden, +380509833346";
                        System.out.println("Sample contacts added (3 contacts added).");
                    } else {
                        System.out.println("Array is full, cannot add sample contacts.");
                    }
                    break;

                case "0":
                    System.out.println("Exiting contacts app...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
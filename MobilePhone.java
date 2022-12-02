import java.util.ArrayList;
import java.util.Scanner;
public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactClass contactsList = new ContactClass();
    public static void main(String[] args) {
        instructions();
        menu();
    }
    public static void menu() {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    instructions();
                case 1:
                    quit = true;
                    break;
                case 2:
                    contactsList.printContactClass();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
                    break;
                default:
                    break;
            }
        }
    }
    public static void addContact() {
        System.out.println("Enter the name of the new contact");
        String newContact = scanner.nextLine();
        contactsList.addNewContact(newContact);
    }
    public static void updateContact() {
        System.out.println("Enter the name of the contact that you want to replace");
        String replacedName = scanner.nextLine();
        System.out.println("Enter the updated name");
        String newName = scanner.nextLine();
        contactsList.updateContact(replacedName, newName);
    }

    public static void removeContact() {
        System.out.println("Which contact do you wish to remove?");
        String removedContact = scanner.nextLine();
        contactsList.removeContact(removedContact);
    }
    public static void searchContact() {
        System.out.println("Which contact are you looking for?");
        String contactName = scanner.nextLine();
        int index = contactsList.findContact(contactName);
        if (index >= 0) {
            System.out.println(contactsList.findContact(contactName) + 1 + ") " + contactName);
        } else {
            System.out.println("No such contact found.");
        }
    }
    public static void instructions() {
        System.out.println("1)Quit\n2)List of contacts\n3)Add new contact\n4}Update existing contact\n5}Remove contact\n6)Search/Find contact");
    }
}




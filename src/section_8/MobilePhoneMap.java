package section_8;

import java.util.Scanner;

public class MobilePhoneMap {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhoneList mobilePhoneList = new MobilePhoneList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhoneList.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Unsupported command entered.\nPlease enter '0' to see the list of supported commands.");

            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contact names.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addContact() {
        System.out.println("Please enter Contact Name.");
        String name = scanner.nextLine();
        System.out.println("Please enter Contact Number.");
        int number = scanner.nextInt();
        mobilePhoneList.addContact(name, number);
    }

    private static void modifyContact() {
        System.out.println("Enter current Contact Name");
        String currentName = scanner.nextLine();
//        System.out.println("Enter old Contact Number");
//        int oldNumber = scanner.nextInt();
        System.out.println("Enter Contact Number");
        int newNumber = scanner.nextInt();
        mobilePhoneList.modifyContactNumber(currentName, newNumber);
    }

    private static void removeContact() {
        System.out.println("Enter Contact Name to remove :");
        String contact = scanner.nextLine();
        mobilePhoneList.removeContact(contact);
    }

    private static void searchContact() {
        System.out.println("Enter Contact to search for :");
        String contact = scanner.nextLine();
        if (mobilePhoneList.inPhoneBook(contact)) {
            System.out.println("Found " + contact);
        } else {
            System.out.println(contact + " was not found in list.");
        }
    }
}

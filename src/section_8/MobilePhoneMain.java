package section_8;

import java.util.Scanner;

public class MobilePhoneMain {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("825 252 2432");

    public static void main(String[] args) {


        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter Action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down... ");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void startPhone() {
        System.out.println("Starting the phone...");
    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact has been added : name " + name + ", phone " + number);
        } else  {
            System.out.println("Cannot add, " + name + " name is already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter current contact name");
        String currentName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(currentName);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        }
        else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing conact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact was not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println(existingContactRecord.getName() + " has been removed.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing conact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact was not found.");
            return;
        }
        System.out.println("Name " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress: ");
        System.out.println("0 - to shut down\n" +
                            "1 - to print contacts\n" +
                            "2 - to add new contact\n" +
                            "3 - to update an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if a contact exists\n" +
                            "6 - to print a list of avaliable actions\n");
        System.out.println("Choose your action: ");
    }
}

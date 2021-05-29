package section_8;

import java.util.Scanner;

public class GroceryMain {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

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
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
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
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please add grocery item.");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter current item name :");
        String currentItem = scanner.nextLine();
        System.out.println("Enter new item name :");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name to remove :");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for :");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

}

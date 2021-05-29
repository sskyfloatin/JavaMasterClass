package section_8;

import java.util.HashMap;
import java.util.Map;

public class MobilePhoneList {

    public HashMap<String, Integer> phoneList = new HashMap<>();

    public void addContact(String contact, int number) {
        phoneList.put(contact, number);
        System.out.println("Contact " + contact + " has been successfully added to list.");
    }

    public void printContactList() {
        System.out.println("You have " + phoneList.size() + " contacts in Phone book.");
        for (Map.Entry<String, Integer> pair : phoneList.entrySet()) {
            String name = pair.getKey();
            int number = pair.getValue();
            System.out.println(name + " - " + number + ".");
        }
    }

    public void removeContact(String contact) {
        boolean exist = findItem(contact);
        if (exist) {
            phoneList.remove(contact);
            System.out.println("Contact " + contact + " has been successfully removed from the list.");
        } else {
            System.out.println("Contact " + contact + " was not found in list.");
        }
    }

    public void modifyContactNumber(String oldName, int newNumber) {
        boolean exist = findItem(oldName);
        if (exist) {
            phoneList.replace(oldName, newNumber);
            System.out.println("Contact " + oldName + " has been modified.");
        } else {
            System.out.println("Contact " + oldName + " was not found in list.");
        }
    }

    private boolean findItem(String contact) {
        return phoneList.containsKey(contact);
    }

    public boolean inPhoneBook(String contact) {
        if (findItem(contact)) {
            return true;
        }
        return false;
    }
}

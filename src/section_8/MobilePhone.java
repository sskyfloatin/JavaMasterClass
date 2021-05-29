package section_8;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;

    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contactName.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public Contact queryContact(String contact) {
        int position = findContact(contact);
        if(position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            return false;
        }
        myContacts.remove(position);
        return true;
    }

    public void printContacts() {
        System.out.println("Contact list:");
        for (int i = 0; i< myContacts.size(); i++) {
            System.out.println(i+1 + ". " + myContacts.get(i).getName() +
                    " -> " + myContacts.get(i).getPhoneNumber()) ;
        }
    }
}

package phoneContact;

import javax.swing.*;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private static ArrayList<Contact> phoneBook;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        phoneBook = new ArrayList<>();
    }

    private int findContact(String name){
        for (int i = 0; i < phoneBook.size(); i++) {
            Contact contact = phoneBook.get(i);
            if (contact.getName().equals(name)){
                return i;}
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return phoneBook.indexOf(contact);
    }

    public void removeContact(Contact contact) {
        if(findContact(contact) >= 0) {
            phoneBook.remove(findContact(contact));
        }
    }

    public void addContact(Contact contact) {
        if (findContact(contact) > 0) {
            JOptionPane.showMessageDialog(null, "Contact already exists.");
            return;
        }
        phoneBook.add(contact);
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0) {
            JOptionPane.showMessageDialog(null, oldContact.getName() + " not found.");
            return;
        }
        else if (findContact(newContact.getName()) > - 1) {
            JOptionPane.showMessageDialog(null, newContact.getName() + " already exists.\n Update unsuccessful.");
        }
        phoneBook.set(findContact(oldContact),newContact);
        JOptionPane.showMessageDialog(null, oldContact.getName() + " has been successfully replaced by " + newContact.getName());
    }

    public Contact queryContact(String name) {
        if (findContact(name) >= 0) {
            return phoneBook.get(findContact(name));
        }
        return null;
    }

    public void showContacts() {
        for (int i = 0; i < phoneBook.size(); i++) {
            Contact contact = phoneBook.get(i);
            JOptionPane.showMessageDialog(null, "Contact name: " + contact.getName() + "   |   "+ "Phone number: " + contact.getPhoneNumber());
        }
    }
}

package phoneContact;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class PhoneBook {
    private static final MobilePhone mobilePhone = new MobilePhone("08050211753");

    public static void main(String[] args) {
        phone();
    }

    private static void phone() {
        customizedJOptionPane(new ColorUIResource(255, 255, 255));
        customizedJOptionPane(new ColorUIResource(255, 255, 255));
        customizedJOptionPane(new ColorUIResource(255, 255, 255));
        UIManager.put("OptionPane.minimumSize",new Dimension((int) 2.98, (int) 5.94));
        lockScreen();
        callLog();
        int userChoice = 0;
        while (true) {
            userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                        """
                            ☎☎☎☎☎☎☎☎☎☎☎☎☎☎☎☎☎
                            <  Lists
                               iCloud
                            👥 1. Show Contacts
                            ➕ 2. Add Contact
                            ❌ 3. Remove Contact
                            🆕 4. Update Contact
                            🔎 5. Check Contact
                            🔚 6. Exit Phonebook
                            ☎☎☎☎☎☎☎☎☎☎☎☎☎☎☎☎☎
                                                        
                            REPLY (1-6):
                            """
            ));
            UIManager.put("OptionPane.minimumSize", new Dimension(200, 200));
            switch (userChoice) {
                case 1 -> showContacts();
                case 2 -> addContact();
                case 3 -> removeContact();
                case 4 -> updateContact();
                case 5 -> checkContact();
                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Bye.");
                    System.exit(1);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid choice. Try again.");
                    phone();
                }
            }
        }
    }

    private static void callLog() {
        JOptionPane.showMessageDialog(null, "You have 12 missed calls");
        JOptionPane.showMessageDialog(null, """
                    📞 Snapchat Audio (2)        Today 🛈
                    📞 WhatsApp Audio            Today 🛈
                    📞 mobile                    yesterday 🛈
                    📞 mobile (6)                yesterday 🛈
                    📞 mobile                    yesterday 🛈
                    📞 Snapchat Audio            yesterday 🛈
                    """);
    }

    private static void checkContact() {
        String name = JOptionPane.showInputDialog("Enter contact name:");
        if (mobilePhone.queryContact(name) == null ){
            JOptionPane.showMessageDialog(null, "Contact not found.");
        }
        Contact contact = mobilePhone.queryContact(name);
        JOptionPane.showMessageDialog(null, "Contact name: " + contact.getName() + " | Phone number: " + contact.getPhoneNumber());
    }

    private static void updateContact() {
        String name = JOptionPane.showInputDialog("Enter name to update contact:");
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact == null) {
            JOptionPane.showMessageDialog(null, "Contact not found.");
        }
        String newName = JOptionPane.showInputDialog("Enter new contact name:");
        String newPhoneNumber = JOptionPane.showInputDialog("Enter new phone number:");
        Contact newContacts = Contact.createContact(newName, newPhoneNumber);
        mobilePhone.updateContact(oldContact, newContacts);
    }

    private static void removeContact() {
        try {
            String name = JOptionPane.showInputDialog("Enter contact name:");
            if (mobilePhone.queryContact(name) == null) {
                JOptionPane.showMessageDialog(null, "Contact not found.");
            }
            Contact contact = mobilePhone.queryContact(name);
            mobilePhone.removeContact(contact);
            JOptionPane.showMessageDialog(null, contact.getName() + " has been successfully removed.");
        }
        catch (NullPointerException error) {
            JOptionPane.showMessageDialog(null, "It's advisable to enter a name on your contact list");
        }
    }

    private static void addContact() {
        String name = JOptionPane.showInputDialog("Enter contact name:");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone number:");
        if(mobilePhone.queryContact(name) != null) {
            JOptionPane.showMessageDialog(null, "Contact already exists.");
        }
        Contact newContact = Contact.createContact(name, phoneNumber);
        mobilePhone.addContact(newContact);
        JOptionPane.showMessageDialog(null, newContact.getName() + " successfully added to your contact list.");
    }

    private static void showContacts() {
        mobilePhone.showContacts();
    }

    public static void customizedJOptionPane(ColorUIResource colorUIResource) {
        UIManager.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.other background", new ColorUIResource(255, 255, 255));
    }

    public static void lockScreen() {
        String password = "0908";
        while (true) {
            String enteredPassword = JOptionPane.showInputDialog("Enter passcode:");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {
                throw new RuntimeException(error);
            }
            if (enteredPassword.equals(password)) {
                JOptionPane.showMessageDialog(null, "Password accepted.");
                JOptionPane.showMessageDialog(null, "Unlocked \uD83D\uDD13");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "iPhone Unavailable. Try again in one minute.");
            }
        }
    }
}

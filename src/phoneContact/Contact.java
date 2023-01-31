package phoneContact;


public class Contact {
    private final String contactName;
    private final String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String contactName, String phoneNumber){
        return new Contact(contactName, phoneNumber);
    }
}

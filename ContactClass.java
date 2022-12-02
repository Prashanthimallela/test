public class ContactClass {
    double Number;

    public ContactClass() {

    }

    @Override
    public String toString() {
        return "ContactClass{" +
                "Number=" + Number +
                ", Name='" + Name + '\'' +
                '}';
    }

    public ContactClass(String number, String name) {
        Number = Double.parseDouble(number);
        Name = name;
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String Name;

    public int findContact(String contactName) {
        return 0;
    }

    public void removeContact(String removedContact) {
    }

    public void updateContact(String replacedName, String newName) {
    }

    public void addNewContact(String newContact) {
    }

    public void printContactClass() {
    }
}
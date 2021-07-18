import java.util.ArrayList;

public class Person {

    String name;
    String surname;
    String telNumber;
    ArrayList<Person> contact;

    public Person(String name, String surname, String telNumber) {
        this.name = name;
        this.surname = surname;
        this.telNumber = telNumber;
        this.contact = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void addPerson(Person p) {
        if (!this.contact.contains(p)) {
            this.contact.add(p);
        } else {
            System.out.println("You are already add this, " + p.getName() + "/" + p.getTelNumber() + ", person.");
        }
    }

}

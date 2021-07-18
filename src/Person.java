import java.util.ArrayList;

public class Person {

    private final int id;
    private String name;
    private String surname;
    private String telNumber;
    protected ArrayList<Person> contact;

    public Person(int id, String name, String surname, String telNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.telNumber = telNumber;
        this.contact = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void addPerson(Person p) {
        this.contact.add(p);
    }

    public void deletePerson(int id) {
        boolean gate = true;
        for (Person p: this.contact) {
            if (p.getId() == id) {
                this.contact.remove(p);
                gate = false;
                break;
            }
        }
        if (gate) System.out.println("There is no such user as id " + id);
    }

    public void listContact() {
        for (Person p: this.contact)
            System.out.println(p);
    }

    public void callSomeone(int id) {
        for (Person p: this.contact) {
            if (p.getId() == id) {
                System.out.println(p + " is calling...");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "id: " + this.getId() + " -> " + this.getName() + "-" + this.getSurname() + "-" + this.getTelNumber();
    }

}

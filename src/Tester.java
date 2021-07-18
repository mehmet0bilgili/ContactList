import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Mehmet", "Bilgili", "123456");
        Person active;
        System.out.println(p1);
        int id = 2;

        Scanner general = new Scanner(System.in);

        active = p1;
        boolean run = true;
        while (run) {
            System.out.println("LIST-ADD-DELETE-UPDATE-CALL-QUIT. Enter one of these commands.");
            switch (general.nextLine()) {
                case "LIST" -> active.listContact();
                case "ADD" -> {
                    System.out.print("Enter name: ");
                    String name = general.nextLine();
                    System.out.print("Enter surname: ");
                    String surname = general.nextLine();
                    System.out.print("Enter telephone number: ");
                    String tel = general.nextLine();
                    active.addPerson(new Person(id, name, surname, tel));
                    id++;
                }
                case "DELETE" -> {
                    active.listContact();
                    System.out.print("Which user you want to delete? Enter id: ");
                    active.deletePerson(general.nextInt());
                    general.nextLine();
                }
                case "UPDATE" -> {
                    active.listContact();
                    System.out.println("Which user you want to update? Enter id: ");
                    for (Person p : active.contact) {
                        if (p.getId() == general.nextInt()) {
                            general.nextLine();
                            System.out.println("Enter new name: ");
                            p.setName(general.nextLine());
                            System.out.println("Enter new surname");
                            p.setSurname(general.nextLine());
                            System.out.println("Enter new telephone number: ");
                            p.setTelNumber(general.nextLine());
                            break;
                        }
                    }
                }
                case "CALL" -> {
                    active.listContact();
                    System.out.print("Which person you want to call? Enter id: ");
                    active.callSomeone(general.nextInt());
                    general.nextLine();
                }
                case "QUIT" -> {
                    System.out.println("Adios " + active);
                    run = false;
                }
                default -> System.out.println("Enter commands correctly.");
            }
        }

    }
}

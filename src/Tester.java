import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Person main = new Person(1,"Mehmet", "Bilgili", "123456");
        int id = 2;

        Scanner general = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("LIST-ADD-DELETE-UPDATE-CALL-QUIT. Enter one of these commands.");
            switch (general.nextLine()) {
                case "LIST" -> main.listContact();
                case "ADD" -> {
                    System.out.print("Enter name: ");
                    String name = general.nextLine();
                    System.out.print("Enter surname: ");
                    String surname = general.nextLine();
                    System.out.print("Enter telephone number: ");
                    String tel = general.nextLine();
                    main.addPerson(new Person(id, name, surname, tel));
                    id++;
                }
                case "DELETE" -> {
                    main.listContact();
                    System.out.print("Which user you want to delete? Enter id: ");
                    main.deletePerson(general.nextInt());
                    general.nextLine();
                }
                case "UPDATE" -> {
                    main.listContact();
                    System.out.println("Which user you want to update? Enter id: ");
                    for (Person p : main.contact) {
                        if (p.getId() == general.nextInt()) {
                            general.nextLine();
                            System.out.print("Enter new name: ");
                            p.setName(general.nextLine());
                            System.out.print("Enter new surname: ");
                            p.setSurname(general.nextLine());
                            System.out.print("Enter new telephone number: ");
                            p.setTelNumber(general.nextLine());
                            break;
                        }
                    }
                }
                case "CALL" -> {
                    main.listContact();
                    System.out.print("Which person you want to call? Enter id: ");
                    main.callSomeone(general.nextInt());
                    general.nextLine();
                }
                case "QUIT" -> {
                    System.out.println("Adios " + main);
                    run = false;
                }
                default -> System.out.println("Enter commands correctly.");
            }
        }

    }
}

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Mehmet", "Bilgili", "05536768542");
        Person active;
        System.out.println(p1);
        int id = 2;

        Scanner general = new Scanner(System.in);

        active = p1;
        boolean run = true;
        while (run) {
            System.out.println("ADD-DELETE-UPDATE-CALL-QUIT");
            String command = general.nextLine();
            switch (command) {
                case "ADD":
                    System.out.print("Enter name: ");
                    String name = general.nextLine();
                    System.out.println("\nEnter surname: ");
                    String surname = general.nextLine();
                    System.out.println("\nEnter telephone number: ");
                    String tel = general.nextLine();
                    active.addPerson(new Person(id, name, surname, tel));
                    id++;
                    break;
                case "DELETE":
                    active.listContact();
                    System.out.println("Which user you want to delete. Enter id: ");
                    int delId = general.nextInt();
                    active.deletePerson(delId);
                    break;
                case "UPDATE":

                    break;
                case "QUIT":
                    run = false;
                    break;
            }
        }

    }
}

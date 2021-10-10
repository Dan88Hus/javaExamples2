import java.util.Scanner;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");


    public static void main(String[] args) {
        // query contact names in phonebook
        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("enter actions 0-6");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phone = scanner.nextLine();
                    Contact newContact = Contact.createContact(name,phone);


                    if(mobilePhone.addNewContact(newContact)){
                        System.out.println("New Contact added");
                    } else{
                        System.out.println("cannot name already on phone");
                    }
                    break;
                case 3:
                    System.out.println("Enter existing name: ");
                    String existingName = scanner.nextLine();
//                    not completed
                    mobilePhone.updateContact();
                    break;
                case 4:
                    mobilePhone.removeContact();
                    break;
                case 5:
                   mobilePhone.queryContact();
                case 6:
                    printActions();
                    break;

            }
        }

    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown\n1-print contacts\n2-add contact\n3-update contact\n4-remove\n5-query if an existing contact exist\n6-print a list available actions");

    }


}

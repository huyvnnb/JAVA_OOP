import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OfficerManagement om = new OfficerManagement();
        boolean quit = false;
        while (!quit) {
            System.out.println("--------------------------------");
            System.out.println("OFFICER MANAGEMENT");
            System.out.println("1. Add new officer.");
            System.out.println("2. Find officer name.");
            System.out.println("3. Print list of officer.");
            System.out.println("4. Exit program.");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("a. Staff.");
                    System.out.println("b. Engineer.");
                    System.out.println("c. Worker.");
                    System.out.print("Enter your choice: ");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a":
                            System.out.println("STAFF INFORMATION");
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter gender (male/female/other): ");
                            String gender = sc.nextLine();
                            System.out.print("Enter your address: ");
                            String address = sc.nextLine();
                            System.out.print("Enter your task: ");
                            String task = sc.nextLine();

                            Officer staff = new Staff(name, age, gender, address, task);
                            om.addOfficer(staff);
                            break;

                        case "b":
                            System.out.println("ENGINEER INFORMATION");
                            System.out.print("Enter name: ");
                            name = sc.nextLine();
                            System.out.print("Enter age: ");
                            age = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter gender (male/female/other): ");
                            gender = sc.nextLine();
                            System.out.print("Enter your address: ");
                            address = sc.nextLine();
                            System.out.print("Enter your major: ");
                            String major = sc.nextLine();

                            Officer engineer = new Enginneer(name, age, gender, address, major);
                            om.addOfficer(engineer);
                            break;

                        case "c":
                            System.out.println("WORKER INFORMATION");
                            System.out.print("Enter name: ");
                            name = sc.nextLine();
                            System.out.print("Enter age: ");
                            age = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter gender (male/female/other): ");
                            gender = sc.nextLine();
                            System.out.print("Enter your address: ");
                            address = sc.nextLine();
                            System.out.print("Enter your level: ");
                            int level = sc.nextInt();

                            Officer worker = new Worker(name, age, gender, address, level);
                            om.addOfficer(worker);
                            break;

                        default:
                            System.out.println("INVALID!");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("Find officer");
                    String name = sc.nextLine();

                    om.findOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;

                case "3":
                    System.out.println("Print all officer");
                    om.showOfficerInfo();
                    break;

                case "4":
                    System.out.println("Exit program");
                    quit = true;
                    break;

                default:
                    System.out.println("INVALID!");
                    break;
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Officer officer;
        OfficerManagement om = new OfficerManagement();
        boolean quit = false;
        while(!quit){
            System.out.println("OFFICER MANAGEMENT");
            System.out.println("1. Add new officer.");
            System.out.println("2. Find officer name.");
            System.out.println("3. Print list of officer.");
            System.out.println("4. Exit program.");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add new Officer:"); sc.nextLine();
                    System.out.println("Enter name: "); String name = sc.nextLine();
                    System.out.println("Enter age: "); int age = sc.nextInt(); sc.nextLine();
                    System.out.println("Enter gender (male/female/other): "); String gender = sc.nextLine();
                    System.out.println("Enter your address: "); String address = sc.nextLine();
                    officer = new Officer(name, age, gender, address);
                    om.addOfficer(officer);
                    break;

                case 2:
                    System.out.println("Find officer");
                    String finder = sc.nextLine();

                    officer = om.findName(finder);
                    om.printInfo(officer);
                    break;

                case 3:
                    System.out.println("Print all officer");
                    om.printAllInfo();
                    break;

                case 4:
                    System.out.println("Exit program");
                    quit = true;
                    break;
            }
        }
    }
}
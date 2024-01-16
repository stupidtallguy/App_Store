import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static DataBase Database;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("<<<Welcome to App Store>>>\n What Role Do You Have ?!\n1)Admin\t2)User\t3)Developer\t4)Exit");
            int UserOption = input.nextInt();
            switch (UserOption) {
                case 1:
                    System.out.println("Please enter Name and Pass:");
                    String name = input.next();
                    String pass = input.next();
                    if (name.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
                        Admin admin = Admin.getInstance();
                        System.out.println("Welcome Admin!");
                        adminMenu(Database);
                    }
                    else{
                        System.out.println("Invalid credentials for Admin!");
                    }
                    break;
                case 2:
                    System.out.println("1) Login\t2) Sign Up");
                    int userChoice = input.nextInt();

                    if (userChoice == 1) {
                        System.out.println("Please enter AppUser Username and Password:");
                        String username = input.next();
                        String password = input.next();
                        // User Login logic

                    } else if (userChoice == 2) {
                        // User signUp Logic
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

                case 3:
                    System.out.println("1) Login\t2) Sign Up");
                    int developerChoice = input.nextInt();

                    if (developerChoice == 1) {
                        // Login as Developer
                        System.out.println("Please enter Developer Username and Password:");
                        String devUsername = input.next();
                        String devPassword = input.next();
                        // Implement login logic for Developer
                        // Example: Validate credentials against stored data
                        // If valid, create a Developer instance and perform developer-specific tasks
                        // Otherwise, display an error message
                    } else if (developerChoice == 2) {
                        // Sign Up as Developer
                        // Implement sign-up logic for Developer
                        // Example: Get developer details, create a Developer instance, and perform developer-specific tasks
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the App Store. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
    private static void adminMenu(DataBase Database) {
        Scanner input = new Scanner(System.in);
        System.out.println("Admin Menu:");
        System.out.println("1) Add User\t2) Add Developer\t3) Add App\t4) Manage Requests\t5) Exit");

        int adminOption = input.nextInt();

        switch (adminOption) {
            case 1:
                System.out.println("Enter User details:");
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Age: ");
                int age = input.nextInt();
                System.out.print("Email: ");
                String email = input.next();
                AppUser newUser = new AppUser(name, age, email);
                Database.addUser(newUser);
                System.out.println("User added successfully: " + newUser);
                break;
            case 2:
                System.out.println("Enter Developer details:");
                System.out.print("Name: ");
                String name1 = input.next();
                System.out.print("Age: ");
                int age1 = input.nextInt();
                System.out.print("Email: ");
                String email1 = input.next();
                Developer newDeveloper = new Developer(name1, age1, email1);
                Database.addDeveloper(newDeveloper);
                System.out.println("Developer added successfully: " + newDeveloper);
                break;
            case 3:
                System.out.println("Enter App details:");
                System.out.print("App Name: ");
                String appName = input.next();
                System.out.print("Price: ");
                double price = input.nextDouble();
                System.out.print("Description: ");
                String description = input.next();
                System.out.println("Select a Developer for the App:");
                ArrayList<Developer> developers = Database.getDevelopers();
                for (int i = 0; i < developers.size(); i++) {
                    System.out.println((i + 1) + ") " + developers.get(i).getName());
                }

                int selectedDeveloperIndex = input.nextInt();
                if (selectedDeveloperIndex >= 1 && selectedDeveloperIndex <= developers.size()) {
                    Developer selectedDeveloper = developers.get(selectedDeveloperIndex - 1);

                    App newApp = new App(appName, Category.OTHER, selectedDeveloper, price, description);
                    Database.addApp(newApp);
                    System.out.println("App added successfully: " + newApp);
                } else {
                    System.out.println("Invalid selection. App not added.");
                }
                break;

            case 4:


            case 5:
                System.out.println("Exiting Admin Menu.");
                break;

            default:
                System.out.println("Invalid option. Please choose again.");
                adminMenu(Database);
                break;
        }
    }
}
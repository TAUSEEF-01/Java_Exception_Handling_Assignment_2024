import java.util.*;

public class Roll_24 {
    public static int id_cnt;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, All_info> person = new HashMap<>();
        id_cnt = 1;

        Boolean running = true;
        while (running == true) {
            running = mainLoop(sc, running, person);
        }
    }

    public static boolean mainLoop(Scanner sc, boolean running, Map<Integer, All_info> person) {
        System.out.println("Enter choice: ");
        System.out.println("1. Input information");
        System.out.println("2. Show information");
        System.out.println("3. Type any number and hit enter to EXIT!");
        System.out.println();
        System.out.print("Your choice: ");
        int n;

        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid choice! " + e);
            return false;
        }

        clearScreen();

        int id;

        switch (n) {
            case 1:
                input_info(sc, person);
                clearScreen();
                break;

            case 2:
                System.out.print("Enter person id: ");
                id = sc.nextInt();
                show_info(sc, person, id);
                clearScreen();
                break;

            // case 3:
            // running = false;
            // break;

            default:
                running = false;
                break;
        }
        System.out.println();

        clearScreen();
        return running;
    }

    public static void input_info(Scanner sc, Map<Integer, All_info> person) {
        while (true) {
            System.out.println("1. Create persons.");
            System.out.println("2. Update information of a person.");
            System.out.println("3. Return.");

            System.out.println();
            System.out.print("Your choice: ");
            int n = sc.nextInt();

            clearScreen();
            int id;

            switch (n) {
                case 1:
                    System.out.println();
                    clearScreen();

                    createPersonDatabase(sc, person);
                    break;

                case 2:
                    System.out.print("Input person id: ");
                    id = sc.nextInt();
                    System.out.println();

                    if (person.get(id) == null) {
                        System.out.println("This person is not created.");
                        System.out.println();
                        continue;
                    }
                    clearScreen();

                    updatePersonInfo(sc, person, id);
                    break;

                case 3:
                    System.out.println();
                    clearScreen();
                    return;

                default:
                    break;
            }
        }

    }

    public static void createPersonDatabase(Scanner sc, Map<Integer, All_info> person) {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            All_info s = new All_info();

            person.put(id_cnt, s);
            id_cnt++;
        }

        System.out.println("Person created!");
        System.out.println();
        clearScreen();
    }

    public static void updatePersonInfo(Scanner sc, Map<Integer, All_info> person, int id) {

        while (true) {
            System.out.println("1. Update all information.");
            System.out.println("2. Return.");

            System.out.println();
            System.out.print("Your choice: ");
            int n = sc.nextInt();

            All_info s = person.get(id);

            switch (n) {
                case 1:
                    clearScreen();
                    s.set_name();
                    s.set_email();
                    s.set_NID_PASS();
                    s.set_birthdate();
                    s.set_address();
                    break;

                case 2:
                    clearScreen();
                    return;

                default:
                    break;
            }
            clearScreen();
        }
    }

    public static void show_info(Scanner sc, Map<Integer, All_info> person, int i) {
        if (person.get(i) == null) {
            System.out.println("This person is not created.");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return;
        }

        All_info s = person.get(i);
        System.out.println("Person id: " + i);
        System.out.println(
                "******************************************************************************************************************");
        System.out.println("Name: " + s.get_name());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("Email: " + s.get_email());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("NID: " + s.get_NID());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("Passport: " + s.get_passport());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("Birth date: " + s.get_birthdate());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("Address: " + s.get_address());
        System.out.println(
                "******************************************************************************************************************");
        System.out.println();

        while (true) {
            System.out.println("Press 0 to return.");
            int press = sc.nextInt();
            if (press == 0) {
                clearScreen();
                return;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

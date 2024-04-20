import java.util.*;

public class Roll_24 {
    public static int id_cnt;

    public static void main(String args[]) {

        clearScreen();

        Scanner sc = new Scanner(System.in);

        Map<Integer, All_info> person = new HashMap<>();
        id_cnt = 1;

        Boolean running = true;
        while (running == true) {
            running = mainLoop(sc, running, person);
        }
    }

    public static boolean mainLoop(Scanner sc, boolean running, Map<Integer, All_info> person) {
        clearScreen();
        System.out.println("Enter choice: ");
        System.out.println("1. Input information");
        System.out.println("2. Show information with exceptions");
        System.out.println("3. Show only exceptions");
        System.out.println("4. Show exceptions for all ID's");
        System.out.println("5. Type any number and hit enter to EXIT!");
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
                show_info_and_exceptions(sc, person, id);
                clearScreen();
                break;

            case 3:
                System.out.print("Enter person id: ");
                id = sc.nextInt();
                show_exceptions(sc, person, id);
                clearScreen();
                break;

            case 4:
                show_All_id_exceptions(sc, person);
                clearScreen();
                break;

            default:
                running = false;
                break;
        }
        System.out.println();

        clearScreen();
        return running;
    }

    public static void input_info(Scanner sc, Map<Integer, All_info> person) {
        clearScreen();
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
        clearScreen();
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
        clearScreen();

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

    public static void show_info_and_exceptions(Scanner sc, Map<Integer, All_info> person, int i) {
        clearScreen();
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
        System.out.println("## Name: " + s.get_name());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Email: " + s.get_email());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## NID: " + s.get_NID());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Passport: " + s.get_passport());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Birth date: " + s.get_birthdate());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Address: " + s.get_address());
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

    public static void show_exceptions(Scanner sc, Map<Integer, All_info> person, int i) {
        clearScreen();
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

        String str = "";

        All_info s = person.get(i);
        System.out.println("Person id: " + i);
        System.out.println(
                "******************************************************************************************************************");
        System.out.println("## Name exceptions: ");
        str = s.get_name();
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Email exceptions: ");
        str = s.get_email();
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## NID exceptions: ");
        str = s.get_NID();
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Passport exceptions: ");
        str = s.get_passport();
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Birth date exceptions: ");
        str = s.get_birthdate();
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
        System.out.println("## Address exceptions: ");
        str = s.get_address();
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

    public static void show_All_id_exceptions(Scanner sc, Map<Integer, All_info> person) {
        clearScreen();
        if (id_cnt == 1) {
            System.out.println("No ID is created.");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return;
        }

        All_info s[] = new All_info[id_cnt + 1];
        for (int j = 1; j < id_cnt; j++) {
            s[j] = person.get(j);
        }

        for (int j = 1; j < id_cnt; j++) {
            System.out.println("ID: " + j);
            System.out.println(
                    "------------------------------------------------------------------------------------------------------------------");
            s[j].get_all_exceptions();
            System.out.println(
                    "******************************************************************************************************************");
            System.out.println();
        }

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

class All_info {
    public String name;
    public String email;
    public String NidPass;
    public String birthdate;
    public String address;

    Name Name;
    Email Email;
    NID_Passport NID_Passport;
    Birthdate Birthdate;
    Address Address;

    public All_info() {
        Name = new Name();
        Email = new Email();
        NID_Passport = new NID_Passport();
        Birthdate = new Birthdate();
        Address = new Address();
    }

    //
    public void set_name() {
        Name.set_name();
    }

    public String get_name() {
        return Name.get_name();
    }

    //
    public void set_email() {
        Email.set_email();
    }

    public String get_email() {
        return Email.get_email();
    }

    //
    public void set_NID_PASS() {
        NID_Passport.set_NID_PASS();
    }

    public String get_NID() {
        return NID_Passport.get_NID();
    }

    public String get_passport() {
        return NID_Passport.get_passport();
    }

    //
    public void set_birthdate() {
        Birthdate.set_birthdate();
    }

    public String get_birthdate() {
        return Birthdate.get_birthdate();
    }

    //
    public void set_address() {
        Address.set_address();
    }

    public String get_address() {
        return Address.get_address();
    }

    public void get_all_exceptions() {
        Name.get_name_exceptions();
        Email.get_email_exceptions();
        NID_Passport.get_NID_exceptions();
        NID_Passport.get_passport_exceptions();
        Birthdate.get_birthdate_exceptions();
        Address.get_address_exceptions();
    }
}

class Name_Exception extends Exception {
    public Name_Exception(String s) {
        super(s);
    }
}

class Name {

    String first_name;
    String middle_name;
    String last_name;

    public void set_name() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("First name: ");
            first_name = sc.nextLine();
            if (first_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            first_name = "";
            System.out.println("FirstNameAbsence " + e);
        } catch (Exception e) {
            first_name = "";
            System.out.println("FirstNameAbsence " + e);
        }

        try {
            System.out.println("Middle name: ");
            middle_name = sc.nextLine();
            if (middle_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            middle_name = "";
            System.out.println("MiddleNameAbsence " + e);
        } catch (Exception e) {
            middle_name = "";
            System.out.println("MiddleNameAbsence " + e);
        }

        try {
            System.out.println("Last name: ");
            last_name = sc.nextLine();
            if (last_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            last_name = "";
            System.out.println("LastNameAbsence " + e);
        } catch (Exception e) {
            last_name = "";
            System.out.println("LastNameAbsence " + e);
        }

        try {
            if (first_name.isEmpty() && last_name.isEmpty()) {
                throw new Name_Exception("Name Exception found!");
            }
        } catch (Name_Exception e) {
            first_name = "";
            middle_name = "";
            last_name = "";
            System.out.println("NoNamePresent " + e);
        } finally {
            System.out.println();
            System.out.println("Name page ends here!");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clearScreen();
    }

    public String get_name() {
        try {
            if (first_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            first_name = "";
            System.out.println("FirstNameAbsence " + e);
        } catch (Exception e) {
            first_name = "";
            System.out.println("FirstNameAbsence " + e);
        }

        try {
            if (last_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            last_name = "";
            System.out.println("LastNameAbsence " + e);
        } catch (Exception e) {
            last_name = "";
            System.out.println("LastNameAbsence " + e);
        }

        try {
            if (first_name.isEmpty() && last_name.isEmpty()) {
                throw new Name_Exception("Name Exception found!");
            }
            return first_name + " " + middle_name + " " + last_name;
        } catch (Name_Exception e) {
            System.out.println("NoNamePresent " + e);
            return "";
        } catch (Exception e) {
            System.out.println("NoNamePresent " + e);
            return "";
        }
    }

    public void get_name_exceptions() {
        try {
            if (first_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            first_name = "";
            System.out.println("FirstNameAbsence " + e);
        } catch (Exception e) {
            first_name = "";
            System.out.println("FirstNameAbsence " + e);
        }

        try {
            if (last_name.isEmpty())
                throw new Name_Exception("Name Exception found!");

        } catch (Name_Exception e) {
            last_name = "";
            System.out.println("LastNameAbsence " + e);
        } catch (Exception e) {
            last_name = "";
            System.out.println("LastNameAbsence " + e);
        }

        try {
            if (first_name.isEmpty() && last_name.isEmpty()) {
                throw new Name_Exception("Name Exception found!");
            }
        } catch (Name_Exception e) {
            System.out.println("NoNamePresent " + e);
        } catch (Exception e) {
            System.out.println("NoNamePresent " + e);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Email_Exception extends Exception {
    public Email_Exception(String s) {
        super(s);
    }
}

class Email {

    String mail;

    public void set_email() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter email: ");
            mail = sc.nextLine();

            if (mail.isEmpty())
                throw new Email_Exception("Email Exception found!");

            try {
                boolean f1 = false;
                int len = mail.length();

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        f1 = true;
                        break;
                    }
                }

                if (!f1) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "@ is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "@ is missing! " + e);
            }

            try {
                boolean f2 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (mail.charAt(i) >= '0' && mail.charAt(i) <= '9') {
                        f2 = true;
                        break;
                    }
                }

                if (!f2) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Digit is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Digit is missing! " + e);
            }

            try {
                boolean f3 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z') {
                        f3 = true;
                        break;
                    }
                }

                if (!f3) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Character is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Character is missing! " + e);
            }

            try {
                boolean f4 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (!((mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z')
                            || (mail.charAt(i) >= '0' && mail.charAt(i) <= '9'))) {
                        f4 = true;
                        break;
                    }
                }

                if (f4) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Invalid character is given! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Invalid character is given! " + e);
            }

            try {
                boolean f5 = false;
                int len = mail.length(), pos = 0;
                String lastPart = "@gmail.com";
                int len2 = lastPart.length();

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                if (len2 != len - pos) {
                    f5 = true;
                } else {
                    for (int i = pos, j = 0; i < len; i++, j++) {
                        if (mail.charAt(i) != lastPart.charAt(j)) {
                            f5 = true;
                            break;
                        }
                    }
                }

                if (f5) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("AbsenceofGmailSuffix " + e);
            } catch (Exception e) {
                System.out.println("AbsenceofGmailSuffix " + e);
            }

        } catch (Email_Exception e) {
            mail = "";
            System.out.println("BlankEmailField " + e);
        } catch (Exception e) {
            mail = "";
            System.out.println("BlankEmailField " + e);
        } finally {
            System.out.println();
            System.out.println("Email page ends here!");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearScreen();

    }

    public String get_email() {

        try {
            if (mail.isEmpty())
                throw new Email_Exception("Email Exception found!");

            try {
                boolean f1 = false;
                int len = mail.length();

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        f1 = true;
                        break;
                    }
                }

                if (!f1) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "@ is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "@ is missing! " + e);
            }

            try {
                boolean f2 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (mail.charAt(i) >= '0' && mail.charAt(i) <= '9') {
                        f2 = true;
                        break;
                    }
                }

                if (!f2) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Digit is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Digit is missing! " + e);
            }

            try {
                boolean f3 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z') {
                        f3 = true;
                        break;
                    }
                }

                if (!f3) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Character is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Character is missing! " + e);
            }

            try {
                boolean f4 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (!((mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z')
                            || (mail.charAt(i) >= '0' && mail.charAt(i) <= '9'))) {
                        f4 = true;
                        break;
                    }
                }

                if (f4) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Invalid character is given! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Invalid character is given! " + e);
            }

            try {
                boolean f5 = false;
                int len = mail.length(), pos = 0;
                String lastPart = "@gmail.com";
                int len2 = lastPart.length();

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                if (len2 != len - pos) {
                    f5 = true;
                } else {
                    for (int i = pos, j = 0; i < len; i++, j++) {
                        if (mail.charAt(i) != lastPart.charAt(j)) {
                            f5 = true;
                            break;
                        }
                    }
                }

                if (f5) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("AbsenceofGmailSuffix " + e);
            } catch (Exception e) {
                System.out.println("AbsenceofGmailSuffix " + e);
            }

            return mail;

        } catch (Email_Exception e) {
            System.out.println("BlankEmailField " + e);
            return "";
        } catch (Exception e) {
            System.out.println("BlankEmailField " + e);
            return "";
        }

    }

    public void get_email_exceptions() {

        try {
            if (mail.isEmpty())
                throw new Email_Exception("Email Exception found!");

            try {
                boolean f1 = false;
                int len = mail.length();

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        f1 = true;
                        break;
                    }
                }

                if (!f1) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "@ is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "@ is missing! " + e);
            }

            try {
                boolean f2 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (mail.charAt(i) >= '0' && mail.charAt(i) <= '9') {
                        f2 = true;
                        break;
                    }
                }

                if (!f2) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Digit is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Digit is missing! " + e);
            }

            try {
                boolean f3 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z') {
                        f3 = true;
                        break;
                    }
                }

                if (!f3) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Character is missing! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Character is missing! " + e);
            }

            try {
                boolean f4 = false;
                int len = mail.length(), pos = 0;

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                for (int i = 0; i < pos; i++) {
                    if (!((mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z')
                            || (mail.charAt(i) >= '0' && mail.charAt(i) <= '9'))) {
                        f4 = true;
                        break;
                    }
                }

                if (f4) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Invalid character is given! " + e);
            } catch (Exception e) {
                System.out.println("NotProperlyFormatedEmailPrefix: " + "Invalid character is given! " + e);
            }

            try {
                boolean f5 = false;
                int len = mail.length(), pos = 0;
                String lastPart = "@gmail.com";
                int len2 = lastPart.length();

                for (int i = 0; i < len; i++) {
                    if (mail.charAt(i) == '@') {
                        pos = i;
                        break;
                    }
                }

                if (len2 != len - pos) {
                    f5 = true;
                } else {
                    for (int i = pos, j = 0; i < len; i++, j++) {
                        if (mail.charAt(i) != lastPart.charAt(j)) {
                            f5 = true;
                            break;
                        }
                    }
                }

                if (f5) {
                    throw new Email_Exception("Email Exception found!");
                }
            } catch (Email_Exception e) {
                System.out.println("AbsenceofGmailSuffix " + e);
            } catch (Exception e) {
                System.out.println("AbsenceofGmailSuffix " + e);
            }

        } catch (Email_Exception e) {
            System.out.println("BlankEmailField " + e);
        } catch (Exception e) {
            System.out.println("BlankEmailField " + e);
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class NID_Passport_Exception extends Exception {
    public NID_Passport_Exception(String s) {
        super(s);
    }
}

class NID_Passport {

    String nid;
    String pass;

    NID_Passport() {
        nid = "";
        pass = "";
    }

    public void set_NID_PASS() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an option: ");
            System.out.println("1. NID");
            System.out.println("2. Passport");
            System.out.println("3. Both");
            System.out.println("4. Press any button and submit to quit!");

            System.out.print("Your option: ");
            int option = sc.nextInt();

            if (option == 1) {
                String s = sc.nextLine();
                System.out.println("Enter NID information: ");
                NID(sc);

            } else if (option == 2) {
                String s = sc.nextLine();
                System.out.println("Enter Passport information: ");
                passport(sc);
            } else if (option == 3) {
                String s = sc.nextLine();
                System.out.println("Enter NID information: ");
                NID(sc);

                System.out.println();
                System.out.println("Enter Passport information: ");
                passport(sc);
            } else {
                throw new NID_Passport_Exception("NID / Passport Exception found!");
            }
        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } catch (Exception e) {
            System.out.println("Invalid option! " + e);
            System.out.println("BlankNIDPassportField " + e);
        } finally {
            System.out.println("NID and Passport page ends here!");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clearScreen();

    }

    public void NID(Scanner sc) {

        try {
            System.out.println("Enter 11 digit NID number: ");
            nid = sc.nextLine();

            if (nid.isEmpty()) {
                throw new NID_Passport_Exception("NID Exception found!");
            }

            int len = nid.length();
            try {
                if (len != 11) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < len; i++) {
                    if (!(nid.charAt(i) >= '0' && nid.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            }

        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } catch (Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } finally {
            System.out.println("NID page ends here!");
        }
    }

    public void passport(Scanner sc) {
        System.out.println("Enter Passport id: ");
        try {
            pass = sc.nextLine();
            int len = pass.length();

            if (pass.isEmpty()) {
                throw new NID_Passport_Exception("Passport Exception found!");
            }

            try {
                if (len != 9) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < 2; i++) {
                    if (!(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 2; i < len; i++) {
                    if (!(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } catch (Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } finally {
            System.out.println("Passport page ends here!");
        }
    }

    public String get_NID() {
        try {
            if (nid.isEmpty()) {
                throw new NID_Passport_Exception("NID Exception found!");
            }

            int len = nid.length();
            try {
                if (len != 11) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < len; i++) {
                    if (!(nid.charAt(i) >= '0' && nid.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            }

            return nid;

        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
            return "";
        } catch (Exception e) {
            System.out.println("BlankNIDPassportField " + e);
            return "";
        }

    }

    public String get_passport() {

        try {

            if (pass.isEmpty()) {
                throw new NID_Passport_Exception("Passport Exception found!");
            }

            int len = pass.length();

            try {
                if (len != 9) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < 2; i++) {
                    if (!(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 2; i < len; i++) {
                    if (!(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }
            return pass;

        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
            return "";
        } catch (Exception e) {
            System.out.println("BlankNIDPassportField " + e);
            return "";
        }
    }

    public void get_NID_exceptions() {
        try {
            if (nid.isEmpty()) {
                throw new NID_Passport_Exception("NID Exception found!");
            }

            int len = nid.length();
            try {
                if (len != 11) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < len; i++) {
                    if (!(nid.charAt(i) >= '0' && nid.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedNIDFormat " + e);
            }

        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } catch (Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        }

    }

    public void get_passport_exceptions() {

        try {

            if (pass.isEmpty()) {
                throw new NID_Passport_Exception("Passport Exception found!");
            }

            int len = pass.length();

            try {
                if (len != 9) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < 2; i++) {
                    if (!(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

            try {
                boolean f = false;
                for (int i = 2; i < len; i++) {
                    if (!(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedPasswordFormat " + e);
            }

        } catch (NID_Passport_Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        } catch (Exception e) {
            System.out.println("BlankNIDPassportField " + e);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Birthdate_Exception extends Exception {
    private Throwable cause;

    public Birthdate_Exception(String s) {
        super(s);
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        this.cause = cause;
        return this;
    }

    @Override
    public synchronized Throwable getCause() {
        return this.cause;
    }
}

class Birthdate {

    String bd;

    public void set_birthdate() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Birth date: (DD Month YYYY):");
            bd = sc.nextLine();

            if (bd.isEmpty()) {
                Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                bd_e.initCause(new Exception("BirthdateBlank "));
                throw bd_e;
            }

            int len = bd.length();
            int p1 = len, p2 = len;

            try {
                boolean f = false;

                for (int i = 0; i < len; i++) {
                    if (bd.charAt(i) == ' ') {
                        p1 = i + 1;
                        break;
                    }
                    if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Date!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Date!");
                }
            }

            try {
                boolean f = false;

                for (int i = p1; i < len; i++) {
                    if (bd.charAt(i) == ' ') {
                        p2 = i + 1;
                        break;
                    }
                    if (!((bd.charAt(i) >= 'A' && bd.charAt(i) <= 'Z')
                            || (bd.charAt(i) >= 'a' && bd.charAt(i) <= 'z'))) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Month!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Month!");
                }
            }

            try {
                boolean f = false;

                for (int i = p2; i < len; i++) {
                    if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f || ((len - p2) != 4)) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Year!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Year!");
                }
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage());
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage());
                }
            }

        } catch (Birthdate_Exception e) {
            bd = "";
            System.out.println("BirthdateBlank " + e);
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }
        } catch (Exception e) {
            bd = "";
            System.out.println("BirthdateBlank " + e);
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }
        } finally {
            System.out.println();
            System.out.println("Birth date page ends here!");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clearScreen();
    }

    public String get_birthdate() {

        try {

            if (bd.isEmpty()) {
                Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                bd_e.initCause(new Exception("BirthdateBlank "));
                throw bd_e;
            }

            int len = bd.length();
            int p1 = len, p2 = len;

            try {
                boolean f = false;

                for (int i = 0; i < len; i++) {
                    if (bd.charAt(i) == ' ') {
                        p1 = i + 1;
                        break;
                    }
                    if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Date!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Date!");
                }
            }

            try {
                boolean f = false;

                for (int i = p1; i < len; i++) {
                    if (bd.charAt(i) == ' ') {
                        p2 = i + 1;
                        break;
                    }
                    if (!((bd.charAt(i) >= 'A' && bd.charAt(i) <= 'Z')
                            || (bd.charAt(i) >= 'a' && bd.charAt(i) <= 'z'))) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Month!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Month!");
                }
            }

            try {
                boolean f = false;

                for (int i = p2; i < len; i++) {
                    if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f || ((len - p2) != 4)) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Year!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Year!");
                }
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage());
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage());
                }
            }

            return bd;

        } catch (Birthdate_Exception e) {
            System.out.println("BirthdateBlank " + e);
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }

            return "";
        } catch (Exception e) {
            System.out.println("BirthdateBlank " + e);
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }

            return "";
        }
    }

    public void get_birthdate_exceptions() {

        try {

            if (bd.isEmpty()) {
                Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                bd_e.initCause(new Exception("BirthdateBlank "));
                throw bd_e;
            }

            int len = bd.length();
            int p1 = len, p2 = len;

            try {
                boolean f = false;

                for (int i = 0; i < len; i++) {
                    if (bd.charAt(i) == ' ') {
                        p1 = i + 1;
                        break;
                    }
                    if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Date!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Date!");
                }
            }

            try {
                boolean f = false;

                for (int i = p1; i < len; i++) {
                    if (bd.charAt(i) == ' ') {
                        p2 = i + 1;
                        break;
                    }
                    if (!((bd.charAt(i) >= 'A' && bd.charAt(i) <= 'Z')
                            || (bd.charAt(i) >= 'a' && bd.charAt(i) <= 'z'))) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Month!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Month!");
                }
            }

            try {
                boolean f = false;

                for (int i = p2; i < len; i++) {
                    if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f || ((len - p2) != 4)) {
                    Birthdate_Exception bd_e = new Birthdate_Exception("Birth date Exception found!");
                    bd_e.initCause(new Exception("WrongBirthdateFormat "));
                    throw bd_e;
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Year!");
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage() + "Invalid Year!");
                }
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage());
                }

            } catch (Exception e) {
                System.out.println("WrongBirthdateFormat " + e);
                Throwable cause = e.getCause();
                if (cause != null) {
                    System.out.println("Cause: " + cause.getMessage());
                }
            }

        } catch (Birthdate_Exception e) {
            System.out.println("BirthdateBlank " + e);
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }
        } catch (Exception e) {
            System.out.println("BirthdateBlank " + e);
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause.getMessage());
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Address_Exception extends Exception {
    public Address_Exception(String s) {
        super(s);
    }
}

class Address {

    String addr;

    public void set_address() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Address: ");
            addr = sc.nextLine();

            if (addr.isEmpty())
                throw new Address_Exception("Address Exception found!");

            int len = addr.length();
            int p1 = len, p2 = len;

            try {
                boolean f = false;

                for (int i = 0; i < len; i++) {
                    if (addr.charAt(i) == ' ') {
                        p1 = i;
                        break;
                    }
                    if (!((addr.charAt(i) >= '0' && addr.charAt(i) <= '9')
                            || (addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z') || (addr.charAt(i) == '/'))) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP1AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP1AddressFormat " + e);
            }

            try {
                boolean f = false;

                for (int i = len - 1; i >= p1; i--) {
                    if (addr.charAt(i) == ' ') {
                        p2 = i;
                        break;
                    }
                    if (!((addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z')
                            || (addr.charAt(i) >= 'a' && addr.charAt(i) <= 'z'))) {
                        f = true;
                        break;
                    }
                }

                if (f || (p2 <= p1)) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP3AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP3AddressFormat " + e);
            }

            try {
                boolean f = false;

                for (int i = p1; i < p2; i++) {
                    if (!((addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z')
                            || (addr.charAt(i) >= 'a' && addr.charAt(i) <= 'z') || addr.charAt(i) == ' ')) {
                        f = true;
                        break;
                    }
                }

                if (f || (p2 <= p1)) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP2AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP2AddressFormat " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Address_Exception("Address  Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedAddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedAddressFormat " + e);
            }

        } catch (Address_Exception e) {
            addr = "";
            System.out.println("AbsenceofAddress " + e);
        } catch (Exception e) {
            addr = "";
            System.out.println("AbsenceofAddress " + e);
        } finally {
            System.out.println();
            System.out.println("Address page ends here!");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clearScreen();
    }

    public String get_address() {

        try {

            if (addr.isEmpty())
                throw new Address_Exception("Address Exception found!");

            int len = addr.length();
            int p1 = len, p2 = len;

            try {
                boolean f = false;

                for (int i = 0; i < len; i++) {
                    if (addr.charAt(i) == ' ') {
                        p1 = i;
                        break;
                    }
                    if (!((addr.charAt(i) >= '0' && addr.charAt(i) <= '9')
                            || (addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z') || (addr.charAt(i) == '/'))) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP1AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP1AddressFormat " + e);
            }

            try {
                boolean f = false;

                for (int i = len - 1; i >= p1; i--) {
                    if (addr.charAt(i) == ' ') {
                        p2 = i;
                        break;
                    }
                    if (!((addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z')
                            || (addr.charAt(i) >= 'a' && addr.charAt(i) <= 'z'))) {
                        f = true;
                        break;
                    }
                }

                if (f || (p2 <= p1)) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP3AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP3AddressFormat " + e);
            }

            try {
                boolean f = false;

                for (int i = p1; i < p2; i++) {
                    if (!((addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z')
                            || (addr.charAt(i) >= 'a' && addr.charAt(i) <= 'z') || addr.charAt(i) == ' ')) {
                        f = true;
                        break;
                    }
                }

                if (f || (p2 <= p1)) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP2AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP2AddressFormat " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Address_Exception("Address  Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedAddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedAddressFormat " + e);
            }

            return addr;

        } catch (Address_Exception e) {
            System.out.println("AbsenceofAddress " + e);
            return "";
        } catch (Exception e) {
            System.out.println("AbsenceofAddress " + e);
            return "";
        }

    }

    public void get_address_exceptions() {

        try {

            if (addr.isEmpty())
                throw new Address_Exception("Address Exception found!");

            int len = addr.length();
            int p1 = len, p2 = len;

            try {
                boolean f = false;

                for (int i = 0; i < len; i++) {
                    if (addr.charAt(i) == ' ') {
                        p1 = i;
                        break;
                    }
                    if (!((addr.charAt(i) >= '0' && addr.charAt(i) <= '9')
                            || (addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z') || (addr.charAt(i) == '/'))) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP1AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP1AddressFormat " + e);
            }

            try {
                boolean f = false;

                for (int i = len - 1; i >= p1; i--) {
                    if (addr.charAt(i) == ' ') {
                        p2 = i;
                        break;
                    }
                    if (!((addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z')
                            || (addr.charAt(i) >= 'a' && addr.charAt(i) <= 'z'))) {
                        f = true;
                        break;
                    }
                }

                if (f || (p2 <= p1)) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP3AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP3AddressFormat " + e);
            }

            try {
                boolean f = false;

                for (int i = p1; i < p2; i++) {
                    if (!((addr.charAt(i) >= 'A' && addr.charAt(i) <= 'Z')
                            || (addr.charAt(i) >= 'a' && addr.charAt(i) <= 'z') || addr.charAt(i) == ' ')) {
                        f = true;
                        break;
                    }
                }

                if (f || (p2 <= p1)) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedP2AddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedP2AddressFormat " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Address_Exception("Address  Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("UnexpectedAddressFormat " + e);
            } catch (Exception e) {
                System.out.println("UnexpectedAddressFormat " + e);
            }

        } catch (Address_Exception e) {
            System.out.println("AbsenceofAddress " + e);
        } catch (Exception e) {
            System.out.println("AbsenceofAddress " + e);
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

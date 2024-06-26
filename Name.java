import java.util.*;

class Name_Exception extends Exception {
    public Name_Exception(String s) {
        super(s);
    }
}

public class Name {

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

// First and last both names are absent!
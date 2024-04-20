import java.util.*;

class NID_Passport_Exception extends Exception {
    public NID_Passport_Exception(String s) {
        super(s);
    }
}

public class NID_Passport {

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

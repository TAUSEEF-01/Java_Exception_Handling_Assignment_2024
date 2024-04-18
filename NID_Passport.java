import java.util.*;

class NID_Passport_Exception extends Exception {
    public NID_Passport_Exception(String s) {
        super(s);
    }
}

public class NID_Passport {

    public void NID_PASS() {
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
                throw new NID_Passport_Exception("Email Exception found!");
            }
        } catch (NID_Passport_Exception e) {
            System.out.println("None of the information is given! " + e);
        } catch (Exception e) {
            System.out.println("Invalid option! " + e);
        } finally {
            System.out.println("NID and Passport page ends here!");
            sc.close();
        }

    }

    public void NID(Scanner sc) {

        String id;

        try {
            System.out.println("Enter 11 digit NID number: ");
            id = sc.nextLine();

            if (id.isEmpty()) {
                throw new NID_Passport_Exception("NID Exception found!");
            }

            int len = id.length();
            try {
                if (len != 11) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("Total number of digits are not 11! " + e);
            } catch (Exception e) {
                System.out.println("Invalid NID number! " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < len; i++) {
                    if (!(id.charAt(i) >= '0' && id.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("NID Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("Invalid NID number! " + e);
            } catch (Exception e) {
                System.out.println("Invalid NID number! " + e);
            }

        } catch (NID_Passport_Exception e) {
            System.out.println("No input is given! " + e);
        } catch (Exception e) {
            System.out.println("No input is given! " + e);
        } finally {
            System.out.println("NID page ends here!");
        }
    }

    public void passport(Scanner sc) {
        System.out.println("Enter Passport id: ");
        try {
            String id = sc.nextLine();
            int len = id.length();

            if (id.isEmpty()) {
                throw new NID_Passport_Exception("Passport Exception found!");
            }

            try {
                if (len != 9) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("Passport length is invalid! " + e);
            } catch (Exception e) {
                System.out.println("Passport length is invalid! " + e);
            }

            try {
                boolean f = false;
                for (int i = 0; i < 2; i++) {
                    if (!(id.charAt(i) >= 'A' && id.charAt(i) <= 'Z')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("Invalid Passport id! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Passport id! " + e);
            }

            try {
                boolean f = false;
                for (int i = 2; i < len; i++) {
                    if (!(id.charAt(i) >= '0' && id.charAt(i) <= '9')) {
                        f = true;
                        break;
                    }
                }

                if (f) {
                    throw new NID_Passport_Exception("Passport Exception found!");
                }
            } catch (NID_Passport_Exception e) {
                System.out.println("Invalid Passport id! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Passport id! " + e);
            }

        } catch (NID_Passport_Exception e) {
            System.out.println("No input is given! " + e);
        } catch (Exception e) {
            System.out.println("No input is given! " + e);
        } finally {
            System.out.println("Passport page ends here!");
        }
    }
}

import java.util.*;

class Birthdate_Exception extends Exception {
    public Birthdate_Exception(String s) {
        super(s);
    }
}

public class Birthdate {

    String bd;

    public void set_birthdate() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Birth date: (Date-Month-Year)");
            bd = sc.nextLine();

            if (bd.isEmpty())
                throw new Birthdate_Exception("Birth date Exception found!");

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
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid Date! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Date! " + e);
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
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid Month! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Month! " + e);
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
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid Year! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Year! " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Birthdate_Exception("Birth date  Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid input! " + e);
            } catch (Exception e) {
                System.out.println("Invalid input! " + e);
            }

        } catch (Birthdate_Exception e) {
            bd = "";
            System.out.println("Birth date is absent! " + e);
        } catch (Exception e) {
            bd = "";
            System.out.println("Birth date is absent! " + e);
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

            if (bd.isEmpty())
                throw new Birthdate_Exception("Birth date Exception found!");

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
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid Date! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Date! " + e);
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
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid Month! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Month! " + e);
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
                    throw new Birthdate_Exception("Birth date Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid Year! " + e);
            } catch (Exception e) {
                System.out.println("Invalid Year! " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Birthdate_Exception("Birth date  Exception found!");
                }
            } catch (Birthdate_Exception e) {
                System.out.println("Invalid input! " + e);
            } catch (Exception e) {
                System.out.println("Invalid input! " + e);
            }
            return bd;

        } catch (Birthdate_Exception e) {
            System.out.println("Birth date is absent! " + e);
            return "";
        } catch (Exception e) {
            System.out.println("Birth date is absent! " + e);
            return "";
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

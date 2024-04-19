import java.util.*;

class Address_Exception extends Exception {
    public Address_Exception(String s) {
        super(s);
    }
}

public class Address {

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
                        p1 = i + 1;
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
                System.out.println("Invalid P1 address! " + e);
            } catch (Exception e) {
                System.out.println("Invalid P1 address! " + e);
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

                if (f) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("Invalid P3 address! " + e);
            } catch (Exception e) {
                System.out.println("Invalid P3 address! " + e);
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
                System.out.println("Invalid P2 address! " + e);
            } catch (Exception e) {
                System.out.println("Invalid P2 address! " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Address_Exception("Address  Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("Invalid input! " + e);
            } catch (Exception e) {
                System.out.println("Invalid input! " + e);
            }

        } catch (Address_Exception e) {
            addr = "";
            System.out.println("Address is absent! " + e);
        } catch (Exception e) {
            addr = "";
            System.out.println("Address is absent! " + e);
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
                        p1 = i + 1;
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
                System.out.println("Invalid P1 address! " + e);
            } catch (Exception e) {
                System.out.println("Invalid P1 address! " + e);
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

                if (f) {
                    throw new Address_Exception("Address Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("Invalid P3 address! " + e);
            } catch (Exception e) {
                System.out.println("Invalid P3 address! " + e);
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
                System.out.println("Invalid P2 address! " + e);
            } catch (Exception e) {
                System.out.println("Invalid P2 address! " + e);
            }

            try {
                if (p1 == len || p2 == len) {
                    throw new Address_Exception("Address  Exception found!");
                }
            } catch (Address_Exception e) {
                System.out.println("Invalid input! " + e);
            } catch (Exception e) {
                System.out.println("Invalid input! " + e);
            }

            return addr;

        } catch (Address_Exception e) {
            System.out.println("Address is absent! " + e);
            return "";
        } catch (Exception e) {
            System.out.println("Address is absent! " + e);
            return "";
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

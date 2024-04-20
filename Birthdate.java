import java.util.*;

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

public class Birthdate {

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













// class Birthdate_Exception extends Exception {
//     public Birthdate_Exception(String s) {
//         super(s);
//     }
// }

// public class Birthdate {

//     String bd;

//     public void set_birthdate() {
//         Scanner sc = new Scanner(System.in);

//         try {
//             System.out.println("Enter Birth date: (Date-Month-Year)");
//             bd = sc.nextLine();

//             if (bd.isEmpty())
//                 throw new Birthdate_Exception("Birth date Exception found!");

//             int len = bd.length();
//             int p1 = len, p2 = len;

//             try {
//                 boolean f = false;

//                 for (int i = 0; i < len; i++) {
//                     if (bd.charAt(i) == ' ') {
//                         p1 = i + 1;
//                         break;
//                     }
//                     if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 boolean f = false;

//                 for (int i = p1; i < len; i++) {
//                     if (bd.charAt(i) == ' ') {
//                         p2 = i + 1;
//                         break;
//                     }
//                     if (!((bd.charAt(i) >= 'A' && bd.charAt(i) <= 'Z')
//                             || (bd.charAt(i) >= 'a' && bd.charAt(i) <= 'z'))) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 boolean f = false;

//                 for (int i = p2; i < len; i++) {
//                     if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f || ((len - p2) != 4)) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 if (p1 == len || p2 == len) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//         } catch (Birthdate_Exception e) {
//             bd = "";
//             System.out.println("BirthdateBlank " + e);
//         } catch (Exception e) {
//             bd = "";
//             System.out.println("BirthdateBlank " + e);
//         } finally {
//             System.out.println();
//             System.out.println("Birth date page ends here!");
//         }

//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         clearScreen();
//     }

//     public String get_birthdate() {

//         try {

//             if (bd.isEmpty())
//                 throw new Birthdate_Exception("Birth date Exception found!");

//             int len = bd.length();
//             int p1 = len, p2 = len;

//             try {
//                 boolean f = false;

//                 for (int i = 0; i < len; i++) {
//                     if (bd.charAt(i) == ' ') {
//                         p1 = i + 1;
//                         break;
//                     }
//                     if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 boolean f = false;

//                 for (int i = p1; i < len; i++) {
//                     if (bd.charAt(i) == ' ') {
//                         p2 = i + 1;
//                         break;
//                     }
//                     if (!((bd.charAt(i) >= 'A' && bd.charAt(i) <= 'Z')
//                             || (bd.charAt(i) >= 'a' && bd.charAt(i) <= 'z'))) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 boolean f = false;

//                 for (int i = p2; i < len; i++) {
//                     if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f || ((len - p2) != 4)) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 if (p1 == len || p2 == len) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }
//             return bd;

//         } catch (Birthdate_Exception e) {
//             System.out.println("BirthdateBlank " + e);
//             return "";
//         } catch (Exception e) {
//             System.out.println("BirthdateBlank " + e);
//             return "";
//         }
//     }

//     public void get_birthdate_exceptions() {

//         try {

//             if (bd.isEmpty())
//                 throw new Birthdate_Exception("Birth date Exception found!");

//             int len = bd.length();
//             int p1 = len, p2 = len;

//             try {
//                 boolean f = false;

//                 for (int i = 0; i < len; i++) {
//                     if (bd.charAt(i) == ' ') {
//                         p1 = i + 1;
//                         break;
//                     }
//                     if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 boolean f = false;

//                 for (int i = p1; i < len; i++) {
//                     if (bd.charAt(i) == ' ') {
//                         p2 = i + 1;
//                         break;
//                     }
//                     if (!((bd.charAt(i) >= 'A' && bd.charAt(i) <= 'Z')
//                             || (bd.charAt(i) >= 'a' && bd.charAt(i) <= 'z'))) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 boolean f = false;

//                 for (int i = p2; i < len; i++) {
//                     if (!(bd.charAt(i) >= '0' && bd.charAt(i) <= '9')) {
//                         f = true;
//                         break;
//                     }
//                 }

//                 if (f || ((len - p2) != 4)) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//             try {
//                 if (p1 == len || p2 == len) {
//                     throw new Birthdate_Exception("Birth date Exception found!");
//                 }
//             } catch (Birthdate_Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             } catch (Exception e) {
//                 System.out.println("WrongBirthdateFormat " + e);
//             }

//         } catch (Birthdate_Exception e) {
//             System.out.println("BirthdateBlank " + e);
//         } catch (Exception e) {
//             System.out.println("BirthdateBlank " + e);
//         }
//     }

//     public static void clearScreen() {
//         System.out.print("\033[H\033[2J");
//         System.out.flush();
//     }
// }

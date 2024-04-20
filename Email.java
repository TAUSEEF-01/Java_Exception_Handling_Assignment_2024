import java.util.*;

class Email_Exception extends Exception {
    public Email_Exception(String s) {
        super(s);
    }
}

public class Email {

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

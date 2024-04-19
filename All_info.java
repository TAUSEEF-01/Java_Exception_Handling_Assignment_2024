public class All_info {
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
}

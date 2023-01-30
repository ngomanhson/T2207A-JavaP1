package Session6;

import java.util.ArrayList;

public class PhoneNumber {
    public String Name;
    public ArrayList<String> Phone = new ArrayList<>();

    public PhoneNumber(String name, ArrayList<String> phone) {
        Name = name;
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<String> getPhone() {
        return Phone;
    }

    public void setPhone(ArrayList<String> phone) {
        Phone = phone;
    }

}

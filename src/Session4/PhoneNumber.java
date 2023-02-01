package Session4;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public void addPhone(String phone){
        if(!phones.contains(phone)){
            phones.add(phone);
        }
    }

    public void updatePhone(String oldPhones, String newPhone){
        if(phones.contains(oldPhones)){
            int i = phones.indexOf(oldPhones);
            phones.add(i,newPhone);
        }
    }
    public void deletePhone(String phone){
        if(phones.contains(phone)){
            phones.remove(phone);
        }
    }
}

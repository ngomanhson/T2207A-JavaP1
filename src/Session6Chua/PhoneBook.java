package Session6Chua;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        //Kiem tra name da co chua?
        for (PhoneNumber p : PhoneList){
            if (p.name == name){
                if (p.phones.contains(phone)){
                    return;
                }
                p.phones.add(phone);
                return;
            }
        }
        //Sau khi di het danh ba ma khong co ten nay
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p : PhoneList){
            if (p.name.equals(name)){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {

    }

    @Override
    public PhoneNumber searchPhone(String name) {
        return null;
    }

    @Override
    void sort() {

    }
}

package Session6;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    ArrayList<String> PhoneList = new ArrayList<>();
    @Override
    void insertPhone(String name, String phone) {
        if (!PhoneList.isEmpty()) {
            PhoneList.add(name+" ,"+phone);
        }else{
            boolean check = false;
            for(String pb : PhoneList){
                if(pb.split(",")[0].equals(name)){
                    check = true;
                    if(!pb.contains(phone)){
                        PhoneList.set(PhoneList.indexOf(pb),pb + " : "+phone);
                    }
                    break;
                }
            }
            if(!check){
                PhoneList.add(name+ ", "+phone);
            }
        }
    }

    @Override
    void removePhone(String name) {
        if(PhoneList.isEmpty()){
            System.out.println("Danh sách trống!");
        }else{
            boolean check = false ;
            for(String pb : PhoneList){
                if(pb.split(",")[0].equals(name)){
                    check = true;
                    PhoneList.remove(pb);
                    System.out.println("Đã xóa người dùng "+name + " kèm sđt khỏi danh sách");
                    break;
                }
            }
            if (!check){
                System.out.println("Không tìm thấy người dùng "+name+" trong danh sách");
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {

    }

    @Override
    PhoneNumber searchPhone(String name) {
        return null;
    }

    @Override
    void sort() {

    }

}

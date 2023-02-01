package Session2;

import java.util.Scanner;

public class HotGirl {
    String name;
    int year_of_birth;
    String address;

public HotGirl(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên Hot Girl: ");
    name = sc.nextLine();
    System.out.println("Nhập năm sinh: ");
    year_of_birth = sc.nextInt();
    System.out.println("Nhập địa chỉ: ");
    address = sc.nextLine();
}
    public void sweeping(){
        System.out.println("Hoàng đang quyét nhà...");
    }
    public void play_game(){
        System.out.println("FO4");
    }
    public void to_wash_dishes(){
        System.out.println("Hoàng đang rửa bát...");
    }
}

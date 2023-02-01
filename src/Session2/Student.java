package Session2;

import java.util.Scanner;

public class Student {
    String name;
    String email;
    int age = 18; // attribute

    //Hàm khởi tạo
    public Student(){
        //Tự động chạy khi tạo đối tượng
        //System.out.println("Xin chào");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập email: ");
        email = sc.nextLine();
    }


    public void eat(){
        System.out.println("Eating...");
    }

    public  void learn(){
        System.out.println("Learning...");
    }
}

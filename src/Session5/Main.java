package Session5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Animal a = new Animal();
//        a.color = "red";
//        a.eat();
//
//        Tiger t = new Tiger();
//        t.color = "orange";
//        t.eat();
//        t.run();
//        t.eatMeat();
//        t.eatMeat("Hello");
//        t.eatMeat("abc", 15);
//
//        Cat c = new Cat();
//        c.run();

//        //HoaDon
        System.out.println("Danh sách khách hàng Việt Nam: ");
        VietNam KH = new VietNam("T2207A", "NGO MANH SON", "09/01/2023", "Kinh Doanh", 2310);
        VietNam K2 = new VietNam("T2208A", "HA HUU HOANG", "10/01/2023", "Kinh Doanh", 0703);
        VietNam K3 = new VietNam("T2209A", "PHUNG VAN VU", "11/01/2023", "Sản Xuất", 1234);
        VietNam K4 = new VietNam("T2210A", "NGUYEN VIET CUONG", "12/01/2023", "Kinh Doanh", 1011);
        VietNam K5 = new VietNam("T2211A", "DO QUANG DUONG", "12/01/2023", "Sản Xuất", 2000);
        KH.hienthi();
        System.out.println("Thành tiền: "+KH.thanhtoan(KH.getSoLuong()));
        K2.hienthi();
        System.out.println("Thành tiền: "+K2.thanhtoan(K2.getSoLuong()));
        K3.hienthi();
        System.out.println("Thành tiền: "+K3.thanhtoan(K3.getSoLuong()));
        K4.hienthi();
        System.out.println("Thành tiền: "+K4.thanhtoan(K4.getSoLuong()));
        K5.hienthi();
        System.out.println("Thành tiền: "+K5.thanhtoan(K5.getSoLuong()));

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Danh sách khách hàng nước ngoài: ");
        NuocNgoai nn = new NuocNgoai("ewrgvfs", "Alexandra", "22/11/2022", "Sản Xuất", 4000);
        NuocNgoai nn2 = new NuocNgoai("rtgggew", "James", "02/12/2022", "Sản Xuất", 2200);
        NuocNgoai nn3 = new NuocNgoai("4tfgegs", "Anderson", "08/01/2023", "Sản Xuất", 3440);
        NuocNgoai nn4 = new NuocNgoai("adaasdg", "Lincoln", "11/01/2023", "Sản Xuất", 2453);
        nn.hienthi();
        System.out.println("Thành tiền: "+nn.thanhtoan(nn.getSoLuong()));
        nn2.hienthi();
        System.out.println("Thành tiền: "+nn2.thanhtoan(nn2.getSoLuong()));
        nn3.hienthi();
        System.out.println("Thành tiền: "+nn3.thanhtoan(nn3.getSoLuong()));
        nn4.hienthi();
        System.out.println("Thành tiền: "+nn4.thanhtoan(nn4.getSoLuong()));
    }
}

package Session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

            //BaiTapVeNha
            Fraction tinh = new Fraction();
            Fraction tinh1 = new Fraction();
            Fraction psTong = new Fraction();
            Fraction psTru = new Fraction();
            Fraction psNhan = new Fraction();
            Fraction psChia = new Fraction();

            tinh.nhap();
            tinh1.nhap();

            System.out.println("Tổng 2 phân số là: ");
            psTong = tinh.cong(tinh1);
            psTong.hienthi();
            System.out.println("Trừ 2 phân số là: ");
            psTru = tinh.tru(tinh1);
            psTru.hienthi();
            System.out.println("Nhân 2 phân số là: ");
            psNhan = tinh.nhan(tinh1);

            psNhan.hienthi();
            System.out.println("Chia 2 phân số là: ");
            psChia = tinh.chia(tinh1);
            psChia.hienthi();
            System.out.println("Phân số vừa nhập là: ");
            tinh.hienthi();
            System.out.println("kết quả rút gọn phân số là: ");
            Fraction kq = tinh.rutgon();
            kq.hienthi();
            System.out.println("Phân số sau khi nghịch đảo là: ");
            tinh.ngichdao();
            tinh.hienthi();
    }
}

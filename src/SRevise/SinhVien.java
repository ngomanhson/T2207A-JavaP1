//Cau 1: Lớp Sinh viên gồm các thông tin: mã, tên, điện thoại, địa chỉ, điểm thi. Các hàm get/set và constructor và các phương thức sau:
//-Nhập thông tin sinh viên
//-In thông tin sinh viên
package SRevise;

import java.util.Scanner;

public class SinhVien {
    public String maSV;
    public String nameSv;
    public String sdt;
    public String diaChi;
    public double diemThi;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNameSv() {
        return nameSv;
    }

    public void setNameSv(String nameSv) {
        this.nameSv = nameSv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public SinhVien(String maSV, String nameSv, String sdt, String diaChi, double diemThi) {
        this.maSV = maSV;
        this.nameSv = nameSv;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.diemThi = diemThi;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã SV: ");
        maSV = sc.nextLine();

        System.out.println("Nhập tên SV: ");
        nameSv = sc.nextLine();

        System.out.println("Nhập số điện thoại: ");
        sdt = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();

        System.out.println("Nhập điểm thi: ");
        diemThi = sc.nextDouble();
    }
    public void hienthi(){
        System.out.println("Mã sinh viên: "+maSV+", Tên sinh viên: "+nameSv+", Số điện thoại: "+sdt+", Địa chỉ: "+diaChi+", Điểm thi: "+diemThi);
    }
}


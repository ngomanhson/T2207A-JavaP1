//Cau 2: Lớp Lớp học gồm các thông tin: tên lớp, phòng học và 1 danh sách sinh viên. Các hàm get/set và constructor, và các phương thức sau:
//-Nhập thông tin lớp
//-Thêm sinh viên vào danh sách lớp
//-Cập nhật thông tin sinh viên của lớp
//-In ra thông tin lớp và danh sách sinh viên
//-Sắp xếp lại danh sách sinh viên theo thứ tự điểm giảm dần
package SRevise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LopHoc {
    String tenLop;
    String lopHoc;
    ArrayList<SinhVien> list = new ArrayList<>();

    public LopHoc(String tenLop, String lopHoc) {
        this.tenLop = tenLop;
        this.lopHoc = lopHoc;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        tenLop = sc.nextLine();

        System.out.println("Nhập lớp học: ");
        lopHoc = sc.nextLine();
    }
    public void update(SinhVien s){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).maSV == s.maSV){
                list.get(i).nameSv = s.nameSv;
                list.get(i).sdt = s.sdt;
                list.get(i).diaChi = s.diaChi;
                list.get(i).diemThi = s.diemThi;
                return;
            }
        }
    }
    public void sort(){
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                return o1.diemThi < o2.diemThi? -1:0;
            }
        });
    }

    public void hienThi(){
        System.out.println("Tên lớp: "+tenLop+", Lớp học: "+lopHoc);
    }
}

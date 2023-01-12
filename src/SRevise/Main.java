package SRevise;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Cau 1:
        SinhVien[] sv = new SinhVien[2];
        for(int i=0; i<sv.length; i++){
            sv[i] = new SinhVien("T2207A", "NGO MANH SON", "231020045678", "PhuTho", 9);
            sv[i].nhapThongTin();
        }
        System.out.println("Danh sách sinh viên được nhập vào: ");
        for(int i=0; i<sv.length; i++){
            sv[i].hienthi();
        }

        System.out.println("----------------------------------------------------------------------------------------------");

        //Cau 2:
        LopHoc[] lh = new LopHoc[2];
        for(int i=0; i<lh.length; i++){
            lh[i] = new LopHoc("T2207A", "B12");
            lh[i].nhapThongTin();
        }

        for(int i=0; i<lh.length; i++){
            lh[i] = new LopHoc("T2207A", "B12");
            lh[i].hienThi();
        }

    }
}

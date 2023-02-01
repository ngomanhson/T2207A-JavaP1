package Session3;

import Session2.Chua_Fraction;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Session3Main {
    public static void main(String[] args) {
////        Car c = new Car("BMW", "X8");
////        System.out.println(c.getBrand());
////
////        int x = 10;
////        int[] arr = new int[5];
////        for (int i = 0; i < arr.length; i++) {
////            arr[i] = i + 3;
////        }
////
////        Car[] cars = new Car[3];
////        for (int i = 0; i < cars.length; i++) {
////            cars[i] = new Car("Honda", "CRY");
////        }
////
//        HocSinh hs = new HocSinh("Ngô Mạnh Sơn", "23/10/2004", "Phú Thọ", "T2207A", 9);
//        System.out.println("Họ tên: "+hs.getName());
//        System.out.println("Ngày sinh: "+hs.getBirthday());
//        System.out.println("Địa chỉ: "+hs.getAddress());
//        System.out.println("Lớp học: "+hs.getZoom());
//        System.out.println("Điểm trung bình: "+hs.getMedium_score());
//        System.out.println("Xếp loại: ");
//        System.out.println(hs.getXepLoai());
////
////        HocSinh hs = new HocSinh("Ngô Mạnh Sơn", "23/10/2004", "Phú Thọ", "T2207A", 9);
////        hs.nhapThongTin();
//
//
////        hs.hienThi();
////        System.out.println("Xếp loại: ");
////        hs.getXepLoai();
//
//        HocSinh[] nHS = new HocSinh[10];
//        for(int i=0; i<nHS.length; i++){
//            nHS[i] = new HocSinh("Son", "23/10/2004", "Phu Tho", "T2207A", 9);
//            nHS[i].nhapThongTin();
//        }
//
//        for(int i=0; i<nHS.length; i++){
//            nHS[i].hienThi();
//            System.out.println("Xếp loại: ");
//            nHS[i].getXepLoai();
//        }
//
//        HocSinh max = nHS[0];
//        HocSinh min = nHS[0];
//
//        for(int i = 0; i < nHS.length - 1; i++) {
//            for (int j = 0; j < nHS.length - i - 1; i++) {
//                if (nHS[i].getMedium_score() < nHS[j].getMedium_score()) {
//                    HocSinh temp = new HocSinh("Son", "23/10/2004", "Phu Tho", "T2207A", 9);
//                    temp = nHS[j];
//                    nHS[j] = nHS[j + 1];
//                    nHS[j + 1] = temp;
//                }
//            }
//        }
//
//        for(int i=0; i<nHS.length; i++) {
//            if(nHS[i].getMedium_score() < min.getMedium_score()) {
//                min = nHS[i];
//            }
//            if(nHS[i].getMedium_score() > max.getMedium_score()) {
//                max = nHS[i];
//            }
//        }
//        System.out.println("Học sinh "+max.getName()+" có điểm trung bình cao nhất: "+max.getMedium_score());
//        System.out.println("Học sinh "+min.getName()+" có điểm trung bình thấp nhất: "+min.getMedium_score());
//
//        System.out.println("Danh sách học sinh giỏi: ");
//        for (int i=0; i<nHS.length; i++) {
//            if (nHS[i].getMedium_score() >= 9) {
//                System.out.println("Tên: " + nHS[i].getName() + ", Điểm: " + nHS[i].getMedium_score());
//            }
//        }

        //Chua Hoc Sinh
//        Chua_HocSinh[] cHS = new Chua_HocSinh[10];
//        for(int i=0; i<cHS.length; i++){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhập tên: ");
//            String ten =  sc.nextLine();
//            System.out.println("Nhập ngày sinh: ");
//            String ns = sc.nextLine();
//            System.out.println("Nhập địa chỉ: ");
//            String dc = sc.nextLine();
//            System.out.println("Nhập lớp học: ");
//            String lh = sc.nextLine();
//            System.out.println("Nhập điểm trung bình: ");
//            double tb = sc.nextDouble();
//            cHS[i] = new Chua_HocSinh(ten, ns, dc, lh, tb);
//        }

//        for(int i=0; i<cHS.length; i++){
//            for(int j=0; j<cHS.length-i-1; j++){
//                if(cHS[j].getTrungBinh() < cHS[j+1].getTrungBinh()){
//                    Chua_HocSinh  tmp;
//                    tmp = cHS[j];
//                    cHS[j] = cHS[j+1];
//                    cHS[j+1] = tmp;
//                }
//            }
//        }
//
//        for(int i=0; i<cHS.length; i++){
//            cHS[i].inThongTin();
//        }
//        //Cao nhat: cHS[0]
//        //Thap nhat: cHS[cHS.length-1]
//
//        //Xuat sac
//        for(int i=0; i<cHS.length; i++){
//            if(cHS[i].getTrungBinh() >= 9.5){
//                cHS[i].inThongTin();
//             }
//        }


        //ArrayList
        ArrayList<Chua_HocSinh> cHS = new ArrayList<>();
        for(int i=0; i<10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên: ");
            String ten =  sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String ns = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String dc = sc.nextLine();
            System.out.println("Nhập lớp học: ");
            String lh = sc.nextLine();
            System.out.println("Nhập điểm trung bình: ");
            double tb = sc.nextDouble();
            cHS.add(new Chua_HocSinh(ten, ns, dc, lh, tb));
        }
        Collections.sort(cHS, new Comparator<Chua_HocSinh>(){
            @Override
            public int compare(Chua_HocSinh o1, Chua_HocSinh o2) {
                return o1.getTrungBinh() - o2.getTrungBinh()>0? 0:-1;
            }
        });
    }
}
package Session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        int x = 10;
//        x++;
//        // age++;
//        Student s1 = new Student();
//        //s1.age++;
//        //s1.eat();
//        Student s2 = new Student();
//        //s2.eat();
//
//        Student s3 = new Student();
//        System.out.println("S1: "+s1.name);
//        System.out.println("S2: "+s2.name);
//        System.out.println("S3: "+s3.name);
//
//        //array
//        int[] arrNums = new int[10];
//        arrNums[0] = 12;
//        arrNums[1] = 9;
//
//        for(int i=0; i<10; i++){
//            arrNums[i] = i;
//        }
//
////        arrNums[10] = 18;
//////        arrNums[10]++;
//////        System.out.println(arrNums[10]);
//
//        ArrayList<String> strs = new ArrayList<>();
//        strs.add("Hello ");
//        strs.add("World");
//        strs.add("Every Body");
//
//        System.out.println(strs.get(0));
//        System.out.println(strs.get(1));
//        System.out.println(strs.get(2));
//
//        for(int i=0; i<strs.size(); i++){
//            System.out.println(strs.get(i));
//        }
//
//        ArrayList<Student> sts = new ArrayList<>(); //Mang cac sinh vien
//        sts.add(s1);
//        sts.add(s2);
//        sts.add(s3);
//
//        sts.add(new Student());
//
//        ///Tao mang cac HotGirl
//        HotGirl t1 = new HotGirl();
//        t1.sweeping();
//        HotGirl t2 = new HotGirl();
//        t2.play_game();
//        HotGirl t3 = new HotGirl();
//        t3.to_wash_dishes();
//
//        System.out.println("T1: "+t1.name);
//        System.out.println("T2: "+t2.name);
//        System.out.println("T3: "+t3.name);
//
//        ArrayList<HotGirl> HG = new ArrayList<>();
//        HG.add(t1);
//        HG.add(t2);
//        HG.add(t3);
//
//        HG.add(new HotGirl());
//
//        //Xây dựng lớp tam giác có các thông tin gồm độ dài các cạnh.
//        //Sau đó viết các method tính chu vi và diện tích của tam giác.
//
//            TamGiac tGiac = new TamGiac();
//
//            if((tGiac.A + tGiac.B > tGiac.C) && (tGiac.A + tGiac.C > tGiac.B) && (tGiac.B + tGiac.C > tGiac.A)){
//                tGiac.p = tGiac.A + tGiac.B + tGiac.C;
//                tGiac.p1 = (double)tGiac.p/2;
//                tGiac.s = Math.sqrt(tGiac.p1+ (tGiac.p1 - tGiac.A));
//                tGiac.s=Math.sqrt(tGiac.p1*(tGiac.p1- tGiac.A)*(tGiac.p1- tGiac.B)*(tGiac.p1- tGiac.C));
//
//                System.out.println("Chu vi của tam giác là : "+tGiac.p);
//                System.out.println("Diện tích của tam giác là: "+tGiac.s);
//            }else{
//                System.out.println("Đây không phải là tam giác");
//            }
//
//            //Chua bai
//            Chua_TamGiac tamGiac = new Chua_TamGiac();
//            System.out.println("Chu vi tam giác là: "+tamGiac.tinhChuVi());
//            System.out.println("Diện tích tam giác là: "+tamGiac.tinhDienTich());

//            //BaiTapVeNha Fraction
//            Fraction tinh = new Fraction();
//            Fraction tinh1 = new Fraction();
//            Fraction psTong = new Fraction();
//            Fraction psTru = new Fraction();
//            Fraction psNhan = new Fraction();
//            Fraction psChia = new Fraction();
//
//            tinh.nhap();
//            tinh1.nhap();
//
//            System.out.println("Tổng 2 phân số là: ");
//            psTong = tinh.cong(tinh1);
//            psTong.hienthi();
//            System.out.println("Trừ 2 phân số là: ");
//            psTru = tinh.tru(tinh1);
//            psTru.hienthi();
//            System.out.println("Nhân 2 phân số là: ");
//            psNhan = tinh.nhan(tinh1);
//
//            psNhan.hienthi();
//            System.out.println("Chia 2 phân số là: ");
//            psChia = tinh.chia(tinh1);
//            psChia.hienthi();
//            System.out.println("Phân số vừa nhập là: ");
//            tinh.hienthi();
//            System.out.println("kết quả rút gọn phân số là: ");
//            Fraction kq = tinh.rutgon();
//            kq.hienthi();
//            System.out.println("Phân số sau khi nghịch đảo là: ");
//            tinh.ngichdao();
//            tinh.hienthi();

            //Chua Fraction
            Chua_Fraction t1 = new Chua_Fraction();
            t1.soTu = 1;
            t1.soMau = 2;
            Chua_Fraction t2 = new Chua_Fraction();
            t2.soTu = 4;
            t2.soMau = 2;

            Chua_Fraction t = t1.add(t2);
            Chua_Fraction h = t1.add(t2);
            Chua_Fraction n = t1.add(t2);
            Chua_Fraction c = t1.add(t2);

            t.rutGon();
            h.rutGon();
            n.rutGon();
            c.rutGon();

            t.print();
            h.print();
            n.print();
            c.print();

    }
}

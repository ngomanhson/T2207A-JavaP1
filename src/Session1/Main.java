package Session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        int x = 10;
        double y = 3.14;
        String s = "Hello";
        System.out.println("x = "+x);
        y = y + 20 *x;
        if(y>100){
            System.out.println("y = "+y);
        }else{
            System.out.println("x "+x);
        }

        for(int i=0; i<10; i++){
            System.out.println("i = "+i);
        }

        //Tinh S = 1 + 2 + 3 + 4 + ... + 1000
        float S1 = 0;
        for(int i=1; i<1000; i++){
            S1 = S1 + i;
        }
        System.out.println("S1 = "+S1);

        //Tinh S = 1 + 1/2 + 1/3 + ... + 1/1000
        double S2 = 0;
        for(int i=1; i<1000; i++){
            S2 = S2 + (double)1/i;
        }
        System.out.println("S2 = "+S2);

        int t = tinhTong(10,15);
        int h = tinhHieu(10,15);
        int tc = tinhTich(10,15);
        float th = tinhThuong(10,2);
        System.out.println("t = "+t);
        System.out.println("h = "+h);
        System.out.println("tc = "+tc);
        System.out.println("th = "+th);

//        boolean t = true;

        //Nhap 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);

//        System.out.println("Nhập vào 1 số tự nhiên: ");
//        int n = sc.nextInt();
//        System.out.println("Nhap 1 so thuc: ");
//        double d = sc.nextDouble();
//        sc.nextLine();
//        System.out.println("Nhap 1 string(chuoi): ");
//        String str = sc.nextLine();
//        System.out.println("n: "+n);
//        System.out.println(("d: "+d));
//        System.out.println("str: "+str);


        //Nhap 1 so nguyen tu ban phim,
        //tinh tong S = 1 + 2 + 3 ... + n
        int a=0;
        System.out.println("Nhập 1 số nguyên: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            a+=i;
        }
        System.out.println("Tổng là: "+a);

        //Kiem tra xem phai so nguyen to hay khong
        int dem = 0;
        System.out.println("Nhập vào số nguyên: ");
        int snt = sc.nextInt();
        for(int i=1; i<=snt; i++){
            if(snt%i==0){
                dem++;
                System.out.println(snt+": chia hết cho "+i);
            }
        }
        if(dem == 2){
            System.out.println(snt+": là số nguyên tố ");
        }else{
            System.out.println(snt+": không phải số nguyên tố "
            );
        }
    }

    //Ham
    static int tinhTong(int a, int b){
        return a+b;
    }

    static  int tinhHieu(int a, int b){
        return a-b;
    }

    static  int tinhTich(int a, int b){
        return a*b;
    }
    static int tinhThuong(int a, int b){
        return b==0?null:a/b;
    }
}


package Session2;

import java.util.Scanner;

public class Chua_TamGiac {
    int canhA;
    int canhB;
    int canhC;


    public Chua_TamGiac(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cạnh A: ");
            canhA = sc.nextInt();
            System.out.println("Nhập cạnh B: ");
            canhB = sc.nextInt();
            System.out.println("Nhập cạnh C: ");
            canhC = sc.nextInt();
        }while(!kiemTra());
    }

    public boolean kiemTra(){
        return canhA + canhB > canhC && canhB + canhC > canhA && canhA + canhC > canhB;
    }

    public int tinhChuVi(){
        return canhA + canhB + canhC;
    }

    public double tinhDienTich(){
        double p = tinhChuVi()/2.0;
        double s = Math.sqrt(p*(p-canhA) * (p-canhB) * (p-canhC));
        return s;
    }
}

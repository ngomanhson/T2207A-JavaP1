package Session2;

import java.util.Scanner;

public class Fraction{
    int tuso ;
    int mauso;
    public Fraction(){
        tuso = 0;
        mauso = 1;
    }
    public Fraction(int ts,int ms){
        tuso = ts;
        mauso = ms;
    }
    public Fraction (Fraction p){
        tuso = p.tuso;
        mauso= p.mauso;
    }
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số : ");
        tuso = sc.nextInt();
        do {
            System.out.println("Nhập mẫu số : ");
            mauso = sc.nextInt();
        }while (mauso == 0);

    }
    public void hienthi(){
        if (tuso == 0){
            System.out.println("  0");
        }else if (mauso == 1){
            System.out.println(tuso);
        } else if (tuso<0 && mauso<0){

            System.out.println(tuso*-1+"/"+mauso*-1);
        }else

        {
            System.out.println(tuso+"/"+mauso);
        }
    }

    private int UCLN1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public Fraction rutgon(){
        Fraction kq =new Fraction();
        int x= UCLN1(tuso,mauso);
        if (tuso < 0){
            tuso = tuso*-1;
        }
        if (mauso < 0){
            mauso = mauso*-1;
        }
        kq.tuso = tuso/x;
        kq.mauso = mauso/x;
        return kq;
    }
    public void ngichdao(){
        int tam = tuso;
        tuso = mauso;
        mauso = tam;
    }
    public Fraction cong(Fraction p){
        int a = ((tuso * p.mauso) + (mauso * p.tuso));
        int b = (mauso * p.mauso);
        return new Fraction(a,b);
    }
    public Fraction tru(Fraction p){
        int c = ((tuso * p.mauso) - (mauso * p.tuso));
        int d = (mauso * p.mauso);
        return new Fraction(c,d);
    }
    public Fraction nhan(Fraction p){
        int c = tuso * p.tuso;
        int d = (mauso * p.mauso);
        return new Fraction(c,d);
    }
    public Fraction chia(Fraction p){
        int c = tuso * p.mauso;
        int d =(mauso * p.tuso);
        return new Fraction(c,d);
    }
}
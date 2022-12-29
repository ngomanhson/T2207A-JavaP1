package section1;

import java.util.Scanner;

public class BuoiMot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Cau 1: Nhập 1 số nguyên n, kiểm tra nó có phải số hoàn hảo hay không
        int s = 0;
        System.out.println("Nhập vào 1 số nguyên: ");
        int n = sc.nextInt();
        for(int i=1; i<=n-1; i++){
            if(n%i==0){
                s+=i;
            }
        }
        if(s==n){
            System.out.println(n+": là số hoàn hảo");
        }else{
            System.out.println(n+": không phải là số hoàn hảo");
        }

        //Cau 2: Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonaci
        System.out.println("Nhập nào 1 số nguyên: ");
        int n2 = sc.nextInt();
        int s2 = Pibonaci(n2);
        System.out.println("Số Pibonaci thứ n của "+n2 +" là "+s2);



        //Cau 3: Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó
        System.out.println("Nhập số nguyên thứ nhất: ");
        int st1 = sc.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int st2 = sc.nextInt();
        System.out.println("Ước chung lớn nhất của " + st1 + " và " + st2 + " là: " + USCLN(st1, st2));
        // tính BSCNN của a và b
        System.out.println("Bội chung nhỏ nhất của " + st1 + " và " + st2 + " là: " + BSCNN(st1, st2));
    }

    //Cau 2
    static int Pibonaci(int n2){
        int a = 1, b = 1;
        if(n2==1 || n2==2)
            return 1;
        return Pibonaci(n2-1)+ Pibonaci(n2-2);
    }
    // Cau 3
    public static int USCLN(int st1, int st2) {
        if (st2 == 0) return st1;
        return USCLN(st2, st1 % st2);
    }
    public static int BSCNN(int st1, int st2) {
        return (st1 * st2) / USCLN(st1, st2);
    }
}

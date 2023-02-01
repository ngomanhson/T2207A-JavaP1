//Xây dựng lớp Phân số (Fraction) có các thành phần sau:
//        * Các thuộc tính: Tử số, mẫu số.
//
//        * Các phương thức:
//        - In Phân số
//        - Rút gọn phân số
//        - Nghịch đảo phân số
//        - add(), sub(), mul(), div() tương ứng để thực hiện cộng, trừ, nhân, chia hai phân số cho nhau.

package Session2;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class Chua_Fraction {
    public  int soTu;
    public int soMau;

    public void print(){
        System.out.println(soTu+ "/" +soMau);
    }

    public void rutGon(){
        int ucln = 1;
        int min = Math.min(Math.abs(soTu), Math.abs(soMau));
        for(int i=min; i>1; i--){
            if(soTu%i == 0 && soMau%i ==0){
                ucln = i;
                break;
            }
        }
        soTu = soTu/ucln;
        soMau = soMau/ucln;
    }

    public void nghichDao(){
        if(soTu != 0){
            int tmp = soTu;
            soTu = soMau;
            soMau = soTu;
        }
    }

    public Chua_Fraction add(Chua_Fraction f){
        int ts = this.soTu * f.soMau + this.soMau * f.soTu;
        int ms = this.soMau * f.soMau;
        Chua_Fraction tong = new Chua_Fraction();
        tong.soTu = ts;
        tong.soMau = ms;
        return tong;
    }
    public Chua_Fraction mul(Chua_Fraction f){
        int ts = this.soTu * f.soTu;
        int ms = this.soMau * f.soMau;
        Chua_Fraction nhan = new Chua_Fraction();
        nhan.soTu = ts;
        nhan.soMau = ms;
        return nhan;
    }
    public Chua_Fraction div(Chua_Fraction f){
        if(f.soTu != 0){
            int ts = this.soTu * f.soMau;
            int ms = this.soMau * f.soTu;
            Chua_Fraction chia = new Chua_Fraction();
            chia.soTu = ts;
            chia.soMau = ms;
            return chia;
        }
        return null;
    }
}

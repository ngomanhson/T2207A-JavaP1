package Session3;

public class Chua_HocSinh {
    String hoTen;
    String ngaySinh;
    String diaChi;
    String tenLop;
    double trungBinh;

    public Chua_HocSinh(){

    }

    public Chua_HocSinh(String hoTen, String ngaySinh, String diaChi, String tenLop, double trungBinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tenLop = tenLop;
        this.trungBinh = trungBinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getTrungBinh() {
        return trungBinh;
    }

    public void setTrungBinh(double trungBinh) {
        this.trungBinh = trungBinh;
    }

    public void BaoCaoKQ(){
        if(trungBinh < 4){
            System.out.println("Yếu");
        }else if(trungBinh < 6.5){
            System.out.println("Trung Bình");
        }else if(trungBinh < 8){
            System.out.println("Khá");
        }else if(trungBinh < 9.5){
            System.out.println("Giỏi");
        }else {
            System.out.println("Xuất sắc");
        }
    }

    public void inThongTin(){
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Lớp học: "+tenLop);
        System.out.println("Điểm trung bình: "+trungBinh);
    }
}

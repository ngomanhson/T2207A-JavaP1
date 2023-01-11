package Session5;

public class VietNam {
    public String maKhachHang;
    public String nameKH;
    public String ngayInHoaDon;
    public String doiTuong;

   public int soLuong;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNameKH() {
        return nameKH;
    }

    public void setNameKH(String nameKH) {
        this.nameKH = nameKH;
    }

    public String getNgayInHoaDon() {
        return ngayInHoaDon;
    }

    public void setNgayInHoaDon(String ngayInHoaDon) {
        this.ngayInHoaDon = ngayInHoaDon;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public VietNam(String maKhachHang, String nameKH, String ngayInHoaDon, String doiTuong, int soLuong) {
        this.maKhachHang = maKhachHang;
        this.nameKH = nameKH;
        this.ngayInHoaDon = ngayInHoaDon;
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
    }

    public void hienthi() {
        System.out.println("Mã khách hàng: " + maKhachHang + ", Tên khách hàng: " + nameKH + ", Ngày in hóa đơn: " + ngayInHoaDon + ", Đối tượng: " + doiTuong + ", Số lượng: " + soLuong);
    }

    public int thanhtoan(int tt){
        if(soLuong <= 50){
            tt = soLuong * 1000;
        }else if(soLuong > 50 && soLuong < 100){
            tt = 50 * 1000 + (soLuong - 50) * 1200;
        }else if(soLuong > 100 && soLuong > 200){
            tt = 50 * 1000 + 50 * 1200 +(soLuong - 100) * 1500;
        }else{
            tt = 50 * 1000 + 50 * 1200 + 100 * 1500 + (soLuong - 200) * 2000;
        }
        return tt;
    }
}

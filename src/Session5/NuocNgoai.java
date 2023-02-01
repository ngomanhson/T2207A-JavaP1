package Session5;

public class NuocNgoai extends VietNam {
    public NuocNgoai(String maKhachHang, String nameKH, String ngayInHoaDon, String doiTuong, int soLuong) {
        super(maKhachHang, nameKH, ngayInHoaDon, doiTuong, soLuong);
    }



    public void hienthi() {
        System.out.println("Mã khách hàng: " + maKhachHang + ", Tên khách hàng: " + nameKH + ", Ngày in hóa đơn: " + ngayInHoaDon + ", Đối tượng: " + doiTuong + ", Số lượng: " + soLuong);
    }
    public  int thanhtoan(){
        return (soLuong*2000);
    }

}

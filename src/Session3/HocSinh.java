//Viết lớp học sinh có các thông tin: Họ tên, ngày sinh, địa chỉ, tên lớp học, điểm trung bình.
//        Có các loại hàm constructor và get/set.
//        Ngoài ra có các method sau:
//            1, Báo cáo kết quả đánh giá dựa trên điểm trung bình (Yếu, Trung bình, Khá, Giỏi, Xuất sắc)
//            2, In thông tin học sinh
//
//        Viết chương trình tạo ra 10 học sinh thuộc các lớp và có điểm số khác nhau.
//        Sau đó sắp xếp mảng 10 sinh viên này theo điểm số giảm dần.
//        In ra học sinh  có điểm thi cao nhất và in ra học sinh có điểm thấp nhất
//        In ra danh sách các học sinh xuất sắc.

package Session3;

import java.util.Scanner;

public class HocSinh {
    private String name;
    private String birthday;
    private String address;
    private String zoom;
    private double medium_score;
    private String XepLoai;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZoom() {
        return zoom;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    public double getMedium_score() {
        return medium_score;
    }

    public void setMedium_score(int medium_score) {
        this.medium_score = medium_score;
    }

    public String getXepLoai() {
        if(medium_score <= 4){
            System.out.println("Yếu");
        }else if(medium_score <= 5){
            System.out.println("Trung bình");
        }else if(medium_score <= 7){
            System.out.println("Khá");
        }else if(medium_score <= 9){
            System.out.println("Giỏi");
        }else{
            System.out.println("Xuất sắc");
        }
        return XepLoai;
    }

    public void setXepLoai(String xepLoai) {
       this.XepLoai = xepLoai;
    }

    public HocSinh(String name,String birthday, String address, String zoom, double medium_score){
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.zoom = zoom;
        this.medium_score = medium_score;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên học sinh: ");
        name = sc.nextLine();

        System.out.println("Nhập ngày sinh: ");
        birthday = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.println("Nhập lớp học: ");
        zoom = sc.nextLine();

        System.out.println("Nhập điểm trung bình: ");
        medium_score = sc.nextDouble();
    }

    public void hienThi(){
        System.out.println("Họ tên: "+name+", Ngày sinh: "+birthday+ ", Địa chỉ: "+address+ ", Lớp học: "+zoom+ ", Điểm trung bình: "+medium_score);
    }
}

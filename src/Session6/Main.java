package Session6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("NgoManhSon", "099999999");
        pb.insertPhone("HaHuuHoang", "033333333");
        pb.insertPhone("PhungVanVuu", "066666666");
        pb.removePhone("NgoManhSon");
        for(String pl : pb.PhoneList){
            System.out.println(pl);
        }

    }

}

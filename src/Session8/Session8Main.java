package Session8;
//Kiem tra loi.
public class Session8Main {
    public static void main(String[] args){
        try {
            int x = 10;
            int y = 0;
//            if(y < 5){
//                throw new Exception("Thích thì báo lỗi =))");
//            }
            System.out.println("x / y =");
            int z = phepChia(x, y);
            System.out.println(z);
        }catch (ArithmeticException e){ //Ngoai le chung
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }finally {
            //Luc nao cung chay qua day
        }

        System.out.println("_Done_");
    }

    public static int phepChia(int a, int b) throws Exception{
        return a/b;
    }
}

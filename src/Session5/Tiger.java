package Session5;

public class Tiger extends Animal {
    public void eatMeat(){
        System.out.println("5kg/ngay");
    }

    public void eatMeat(String msg){
        System.out.println("5kg/ngay");
    }

    public void eatMeat(String msg, int d){
        System.out.println(d+ msg +"5kg/ngay");
    }

    public void run(){
        System.out.println("Tiger running...");
    }
}

package Session6;

public class Session6Main {
    public static void main(String[] args){
        Asian a = new Asian();
        American am = new American();
        Human h = new Human() { //Anonymous class
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };
    }
}

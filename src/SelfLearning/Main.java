package SelfLearning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username: ");
            String username = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();

            if (username.equals("son23") &&
                    password.equals("2310")){
                System.out.println("Welcome User");
                break;
            }else {
                System.out.println("Access Denied");
            }
            System.out.println("Do you want to continue? "+
                    "Y for yes/ N for no");
            ch = sc.next().charAt(0);
        }while (ch == 'y' || ch == 'Y');
    }
}

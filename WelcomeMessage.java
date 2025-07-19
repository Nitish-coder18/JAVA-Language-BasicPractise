import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("Hello User..!!");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Your Good Name Please = ");
        String name = S.nextLine();
        System.out.println("hello " + name + ", Nice To Meet You..!!😊");

    }
}

import java.util.Scanner;

public class AddingTwoNumbersTakeInputFromUser {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Adding Two Number");
        System.out.print("Enter the first Number : ");
        int num1 = S.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = S.nextInt();
        int num3 = num1 + num2;
        System.out.println("Addtion of given number is: " + num3);


    }
}

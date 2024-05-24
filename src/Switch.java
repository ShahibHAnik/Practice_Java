import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);    //This Scaner Use for getting input from mechine
        int button = number.nextInt();

//        int number = 2;
        switch (button) {
            case 1:
                System.out.println("bagladesh");
                break;
            case 2:
                System.out.println("pakistan");
                break;
            case 3:
                System.out.println("India");
                break;
            default:
                System.out.println("error");
                break;


        }
    }
}

import java.util.Scanner;

public class Calculator {



    //import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number");
        int numberA =  input.nextInt();
        System.out.println("Please enter a number");
        int numberB = input.nextInt();
        //System.out.println("Sum numberA & NumberB = "+ finalResult);
        int Total = numberA+numberB;
        System.out.println("Sum=" +Total);

    }




}

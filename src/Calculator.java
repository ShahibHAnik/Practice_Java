import java.util.Scanner;

public class Calculator {



    //import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number");
        double numberA =  input.nextDouble();
        System.out.println("Please enter a number");
        double numberB = input.nextDouble();
        //System.out.println("Sum numberA & NumberB = "+ finalResult);
        double Total = numberA+numberB;
        System.out.println("Sum=" +Total);

    }




}

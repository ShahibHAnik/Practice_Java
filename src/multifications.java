import java.util.Scanner;

public class multifications {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= input.nextInt();
        if (n <= 2 && n >20);{
            for (int i =1; i <=10; i++) {
            int result = n * i;
                System.out.println(result);
                System.out.println(n +"x" + i +"=" + result);
            }



        }

    }

}

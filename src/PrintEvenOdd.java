public class PrintEvenOdd {
    //Even Odd define is if any thing divided by 2
    public static void main(String[] args) {
       int number = 23546683;
       // this formula using ternary oparetor in If Else Condition
       String FindEvenOdd =(number%2 ==0) ? "Even":"Odd";
        System.out.println(FindEvenOdd);




        //Find Large Number


        int a = 10;
        int b = 29;
        String FindLargeNumber =(a>=b) ? "large": "small";
        System.out.println(FindLargeNumber);


    }
}
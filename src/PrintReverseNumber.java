public class PrintReverseNumber {
    public static void main(String[] args) {
        int a = 234654;
        while(a > 0){
            int lastdigit = a % 10;
            System.out.println(lastdigit +" ");
            a =a/10;
        }
    }
}

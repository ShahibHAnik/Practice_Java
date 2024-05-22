public class TypeConversion {
    /*Conversion Happend When type conversion/type casting
    1. type compatitble
    2.destination type > Source type
    widening - implicit type
    narrowing - explicit type
     */
    public static void main(String[] args) {
       // byte a = 20;
        //double b = a;
        //System.out.println(b);

        //widening - implicit type
        long a = 37562783716768L; // 64bits
        double b = a;
        System.out.println(b);

        //narrowing - explicit type
        long c = 30043L; //32 bits
        short d =(short) c; //8 bits _____Bracket use it to force in narrowing
        System.out.println(d);


    }

}

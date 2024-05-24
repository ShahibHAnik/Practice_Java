public class IfElseStatement {
    //if
    //if else
    //else if
    public static void main(String[] args) {
        String UserId = "anik";
        String Password = null;

        // In If statement ,if condition "(condition inside)" meet it will work "{inside}"  this bracket
        if (UserId.equals("aniks")) {
            System.out.println("Welcome");

        } else {
            System.out.println("wrong user Name");

            //nested rules



            int age = 9;
            if (age >= 18) {
                System.out.println("adult");
            } else if (age >= 13 && age < 18) {
                System.out.println("teenager");
            }
            else{
                System.out.println("kids");
            }
        }



        }
    }

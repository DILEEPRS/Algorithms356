import java.util.Scanner;

public class input_greetings {
    


    static void invoke_greetings(){


        Scanner scan_obj = new Scanner(System.in);

        System.out.println("enter your name");

        String name = scan_obj.nextLine();

        scan_obj.close();

        System.out.println("Hello " + name + " namaskara");



    }


    public static void main(String[] args) {
       invoke_greetings();

    }
}

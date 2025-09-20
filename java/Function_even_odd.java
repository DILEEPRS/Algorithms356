public class Function_even_odd {
    


    static boolean iseven(int inp){

        if(inp % 2 == 0){
            System.out.println("Number is even");
            return true;
        }
        else{
             System.out.println("Number is odd");
             return false;
        }


    }

    static void invoke_iseven(){
          
        int number = 146465456;
        int number2 = 1464457;

        iseven(number);
        iseven(number2);

    }

    public static void main(String[] args) {
      invoke_iseven();
    }

}

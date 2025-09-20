public class check_isdigit {
    

    static boolean isdigit(String str_inp){

        boolean result = true;

        for(int i = 0; i < str_inp.length(); i++){

            char character = str_inp.charAt(i);

            if(character < '0' || character > '9'){

                result = false;
                break;

            }


        }

        return result;

    }
   
    static void  invoke_isdigit(){

 
        

        boolean result =  isdigit("46465");

        if(result) System.out.println("it is a proper number");
        else System.out.println("it is not a proper number");

    }


    public static void main(String[] args) {

         invoke_isdigit();

        
    }




}

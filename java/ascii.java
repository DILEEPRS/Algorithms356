public class ascii {


    static void Print_ascii(String inp){

        char character;

        for(int i = 0; i < inp.length(); i++ ){

          
              character =  inp.charAt(i);

              System.out.println("Ascii value of " + character +" " + (int)character);
        }
        
        
       


    }


    public static void main(String[] args) {
       
        Print_ascii("asdwed");

    }
    
}

public class reverse_string {
    

    
    public static String Reverse_String(String input){


        StringBuilder output = new StringBuilder();

        for ( int index=input.length()-1; index>=0; index--){

              output.append(input.charAt(index));

              //System.out.println(input.charAt(index));

        }

         return output.toString();

    }

     public static String Reverse_String2(String input){


        char[] input_array = input.toCharArray();


        int left_index = 0;
        int right_index = input.length()-1;
        
        while (left_index <= right_index) {

            char temp = input_array[left_index];
            input_array[left_index] = input_array[right_index];
            input_array[right_index] = temp;

            left_index++;
            right_index--;
            
        }
        
        String output = new String(input_array);

        return output;

    }


    public static void invoke_Reverse(){

        String input = "ABCDEF";
        
           
          String op =  Reverse_String2(input);
       // String op =  Reverse_String(input);
        System.out.println(op);


    }
    public static void main(String[] args){

        invoke_Reverse();
    }
}

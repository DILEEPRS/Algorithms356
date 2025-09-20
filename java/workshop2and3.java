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

public class Count_vowels {
    

    public static int Countvowels(String input){

        int vowel_length = 0;

        for (int i = 0; i<input.length(); i++){

            char character = input.charAt(i);

            if( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ){

                vowel_length++;

            }
        }


        return vowel_length;
    }

    public static void main(String[] args){

        String input = "akfheakiaohuuueeeaaa";

        int count = Countvowels(input);

        System.out.println(count);
    }
}

public class Stringlength{


public static int  Getstringlength(String input){

    int count = 0;

    for (char c : input.toCharArray()){

        count++;

    }
    
    return count;
}


public static void main(String[] args){

     String input = "Dileep";

     int result = Getstringlength(input);

     System.out.println(result);

}


    
}

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

public class sum_Array {
    

    public static int sumofarray(int[] Input_array){

       int sum = 0;
       for(int index = 0; index< Input_array.length; index++){

            sum = sum + Input_array[index];


       }

       return sum;

    }


    public static void main (String[] args){

        int[] Input_array = {10,20,0,45,35,78,35,89,35,886,-20,-1000};

        int finalsum = sumofarray(Input_array);

        System.out.println("final sum is " + finalsum);


    }
}

public class isPalendrome {
    

    public static boolean isPalendrome(String input){


        boolean result = true;
        
        int left_index = 0;
        int right_index = input.length()-1;

        while(left_index < right_index){

           if(input.charAt(left_index) != input.charAt(right_index)){

                result = false;
                break;
                

           }
             left_index++;
             right_index--;
           
           

        }

        return result;

    }



    public static void main(String[] args){


       String input = "mmmoommm";
       
       boolean palendrome_check = isPalendrome(input);

        if(palendrome_check == true){
            System.out.println("The Given String is palendrome");
        }
        else{
            System.out.println("The Given String is not palendrome");
        }


    }






}

public class max_min {
    

    public static void Maxmin(int[] input){

     
        // int Max_value = Integer.MIN_VALUE;
        // int Min_value = Integer.MAX_VALUE;

         int Max_value = input[0];
         int Min_value = input[0];




        for ( int i = 1; i < input.length; i++){

            if(input[i] > Max_value){

                Max_value = input[i];
            }

            if(input[i] < Min_value){

                Min_value = input[i];
            }


        }

            System.out.println("Maximum value is " + Max_value + " Minumum value is " + Min_value);


    }





    public static void main (String[] args){

     int[] input_array = {825,10,1,3,4,5,7,8654,20,63};

      Maxmin(input_array);





    }
}

public class binary_search {

    public static boolean search(int[] input, int key){

        boolean isfound = false;
        int left_index = 0;
        int right_index = input.length-1;
        int mid_index = (right_index-left_index)/2;

        while(left_index <= right_index){

            if(key == input[mid_index]){
                isfound = true;
                break;
            }

            else if(key>input[mid_index]){
                left_index = mid_index+1;

            }
            else if(key<input[mid_index]){

                right_index = mid_index - 1;

            }

            mid_index = left_index + (right_index - left_index)/2;


        }




        return isfound;
    }

    public static void main(String[] args) {
        


        int[] input = {1,2,3,4,5,6,7,8,9};

        int key = 10;

        boolean output = search(input,key);

        if (output) {
            System.out.println("The given Key " + key + " is found");
            
        }
        else{
            System.out.println("The given Key " + key + " is not found");
        }
    }
    
}

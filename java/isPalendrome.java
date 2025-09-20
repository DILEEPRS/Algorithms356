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

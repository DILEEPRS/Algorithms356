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

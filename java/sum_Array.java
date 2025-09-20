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

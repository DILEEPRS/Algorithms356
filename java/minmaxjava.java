public class minmaxjava{
    

    public static void find_minmax(int[] input){

        int max_value = input[0];
        int min_value = input[0];
        
        for(int index = 0; index<input.length; index++){


            if(input[index]>max_value){

                max_value = input[index];

            }

            if(input[index]<min_value){

                min_value = input[index];

            }


        }

        System.out.println(max_value);
        System.out.println(min_value);




    }


    public static void main(String[] args){

     int[] input = {10,23,40,1,54,34,56,79,99};

     find_minmax(input);

    }
}

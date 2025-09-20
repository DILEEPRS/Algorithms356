public class Unique {
    

public static void getUnique(int[] input){


    for(int readIndex= 0; readIndex< input.length; readIndex++){

        boolean isDuplicate = false;

        for(int compareIndex = 0; compareIndex < input.length; compareIndex++){


            if(readIndex == compareIndex){

                continue;
            }

            if(input[readIndex] == input[compareIndex])
            {
                isDuplicate = true;
                break;
            }

            
        }

         if(!isDuplicate){
            System.out.println(input[readIndex]);


        }

       

    }

}





public static void main(String[] args) {
    int[] input = {1,5,3,9,8,5,8};

    getUnique(input);
}




}

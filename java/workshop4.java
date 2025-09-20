public class secondLargest {
    

public static int getSecondLargest(int[] input){

    int max_large = input[0];
    int max_small = input[0];


    //{2,4,3,7,6,9,1}
    // for(int index= 0; index<input.length; index++){

    //      if(input[index] > max_large){

    //         max_large = input[index];

           
    //      }

    // }

    //  for(int index= 0; index<input.length; index++){

    //      if(input[index] > max_small && input[index] != max_large){

    //         max_small = input[index];

           
    //      }

    // }


    // System.out.println("first largest element is " + max_large);
    // System.out.println("second largest element is " + max_small);
     
    for(int index = 1; index<input.length; index++){

        if(input[index]> max_large)
        {
            max_small = max_large;
            max_large = input[index];
        }
        else if(input[index] > max_small)
        {
            max_small= input[index];
        }
    }
    
    return max_small;

}




public static void main(String[] args) {
    
 int[] input= {2,4,3,7,6,9,1};

 int result = getSecondLargest(input);

 System.out.println(result);

}

}

public class commonElements {
    
    public static void getCommonElements(int[] input1, int[] input2){


        for (int index = 0; index< input1.length; index++){

            boolean isFound = false;

            for (int innerIndex = 0; innerIndex<input2.length; innerIndex++ ){

                if(input1[index] == input2[innerIndex]){
                    isFound = true;
                    break;
                }


            }

             if(isFound){
                System.out.println(input1[index]);
            }

        }

    }

    public static void main(String[] args) {
        
        int[] input1 = {1,3,4,5,1,2,3,9};
        int[] input2 = {2,4,1,5,3};

        getCommonElements(input1,input2);
     }
}

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

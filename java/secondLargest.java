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

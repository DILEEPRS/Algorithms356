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

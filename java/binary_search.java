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

public class largest_elem {
    

   public static int findLargest(int[] ip){

    int large= ip[0]; 

    for (int index = 1; index<ip.length; index++){

          if(ip[index]>large){
              
             large = ip[index];
          }
    }

    return large;
   }





    public static void main(String[] args){

        int[] input = {999,20,30,10,345,21,546,879,24};

        int largest = findLargest(input);

        System.out.println("largest number in given array is "+largest);
    }



}

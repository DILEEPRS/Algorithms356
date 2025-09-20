public class swap_two_numbers {
   
    static void Swap_number(int[] number){


        int temp = number[0];
        number[0] = number[1];
        number[1]= temp;
     

    }

    static void numbers(){
       
        int[] Numbers = {23, 30};


        System.out.println("Before Swapping " + Numbers[0] + " " + Numbers[1] );

        Swap_number(Numbers);

        System.out.println("After Swapping " + Numbers[0] + " " + Numbers[1] );

    }
    public static void main(String[] args){
        numbers();
    }
}

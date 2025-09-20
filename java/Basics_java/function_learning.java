public class function_learning{

    static void Donothing(){
        System.out.println("this will print text as do nothing");
    }

    static int Add_numbers(int input_1, int input_2){

        int result = input_1 + input_2;
        return result;

    }

    public static void main(String[] args){

        Donothing();
        int final_sum = Add_numbers(365,546);

        System.out.println(final_sum);

        
    }
}
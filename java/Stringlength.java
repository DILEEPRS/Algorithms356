public class Stringlength{


public static int  Getstringlength(String input){

    int count = 0;

    for (char c : input.toCharArray()){

        count++;

    }
    
    return count;
}


public static void main(String[] args){

     String input = "Dileep";

     int result = Getstringlength(input);

     System.out.println(result);

}


    
}
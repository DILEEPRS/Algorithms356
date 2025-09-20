public class Count_vowels {
    

    public static int Countvowels(String input){

        int vowel_length = 0;

        for (int i = 0; i<input.length(); i++){

            char character = input.charAt(i);

            if( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ){

                vowel_length++;

            }
        }


        return vowel_length;
    }

    public static void main(String[] args){

        String input = "akfheakiaohuuueeeaaa";

        int count = Countvowels(input);

        System.out.println(count);
    }
}

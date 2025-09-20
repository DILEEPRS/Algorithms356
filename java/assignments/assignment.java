import java.util.Scanner;

public class loops {

    //Write a Java program using a for loop to print numbers from 1 to 10.

    public static void Print_Numbers(){

        System.out.println("print numbers from 1 to 10 ");
        for(int index = 1; index<=10; index++){

          
            System.out.println(index);
        }
    }

    //Write a Java method using a while loop to count down from 5 to 1.

    public static void Print_Numbers_5to_1(){

        System.out.println("print numbers from 5 to 1 ");
        int value = 5;
        while (value >= 1) {
            System.out.println(value);
            value--;
        }
    }

    //Write a Java method that keeps asking for input until the word 'exit' is entered.

    public static void askuntilexit(){

        Scanner scanner = new Scanner(System.in);
        String input;

         while (true) {
            System.out.print("Enter something ");
            input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("Exiting program.");
                break;
            }
            System.out.println("You entered: " + input);
        }
        scanner.close();
    }

    //Create a Java method using a for loop to print even numbers from 2 to 20.

    public static void Print_Even(){

        for (int index=2; index<=20; index++){

            if(index%2 == 0){
                System.out.println(index);
            }
        }
    }

   //Write a Java method that prints a list of names using a for-each loop.

   public static void print_Names(String[] names){

        // here syntax for foreach is for(item:collection){print item}
     for(String name:names){
       System.out.println(name);
     }

   }

   //Simulate a do-while loop in Java that continues asking for a number until it's negative.

   public static void Simulate_until_negative(){

     
    Scanner scanner = new Scanner(System.in);

    int number;

        do {
            System.out.print("Enter a number ");
            number = scanner.nextInt();

            if (number >= 0) {
                System.out.println("You entered: " + number);
            } else {
                System.out.println("Negative number entered. Exiting loop.");
            }
        } while (number >= 0);

        scanner.close();

   }

   //Write a Java method with a nested loop to print a pattern of stars (5 rows, increasing per row).

    public static void Print_pattern(){

        for (int index = 1; index<=5; index++){

            for(int inner_index = 1; inner_index <=index; inner_index++){

                System.out.print("*");
            }
             System.out.println(); 
        }
    }

    //Write a Java method that breaks a loop when a number is divisible by 7.

    public static void break_Div_By_7(int number){

          for (int index = 1; index<= number; index++){


                if(index %7 == 0){
                break;
               }

               System.out.println(index);
               


          }

    }

    //Create a Java program using continue to skip odd numbers from 1 to 20.

    public static void skip_Odd(){

          for (int index = 1; index<= 20; index++){


                if(index % 2 != 0){
                continue;
               }

               System.out.println(index);
               


          }

    }

    //Write a Java method to loop over two arrays simultaneously and print the elements together. the below is wrong print arrays one after the other i need together

    public static void merge_Arrays(){

     int[] array1 = {1,2,3,4,5,6};
     int[] array2 = {6,7,8,9};

     int[] merged = new int[array1.length + array2.length]; 

     int count = 0;

     for (int index =0; index<array1.length; index++){

        merged[count] = array1[index];
        count++;
     }

     for (int index =0; index<array2.length; index++){

        merged[count] = array2[index];
        count++;
     }


    for(int num: merged){

        System.out.println(num);
    }

    }


   public static void printArraysTogether() {
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {6, 7, 8, 9};

    // find min leangth to avoid error
    int minLength = Math.min(array1.length, array2.length);

    for (int i = 0; i < minLength; i++) {
        System.out.println(array1[i] + " " + array2[i]);
    }

   // print remaining elements
    if (array1.length > minLength) {
        for (int i = minLength; i < array1.length; i++) {
            System.out.println(array1[i] + " -");
        }
    } else if (array2.length > minLength) {
        for (int i = minLength; i < array2.length; i++) {
            System.out.println("- " + array2[i]);
        }
    }
}


    public static void main(String[] args) {

        //Print_Numbers();
        //Print_Numbers_5to_1();
        //askuntilexit();
        //Print_Even();
        //print_Names(names);
        //Simulate_until_negative();
        //Print_pattern();
        //break_Div_By_7(35);
        //skip_Odd();
        //merge_Arrays();
        printArraysTogether();

        String[] names = {"Dileep", "Harish", "bharath", "abhishek", "vishwa"};
        
        
    }
}

public class Conditionals {
    
//1.	Write a Java method to check if a number is even or odd using if-else.

    public static void odd_Even_Check(int number){

        if(number % 2 == 0){

            System.out.println("The given number " + number + " is even number" );
        }
        else {
            System.out.println("The given number " + number + " is odd number" );
        }

    }


//2.	Create a method that prints “Teenager” if age is between 13 and 19, else print “Not Teenager”.

    public static void isTeenager(String name , int age){

        if(age<=13 || age <=19){

            System.out.println(name+" is teenager since his age is " + age);
        }else{
            System.out.println(name+" is not a teenager since his age is " + age);
        }

    }

//3.	Write a method to return the maximum of three numbers using if-elif-else.

    public static int max_Of_Numbers(int number1, int number2, int number3){

        int maximum;

       if(number1>number2){

        if (number1>number3) {
             maximum = number1;
        }
        else {
            maximum = number3;
        }
  
       }else{
        if(number2>number3){
        maximum = number2;
       }else{
        maximum = number3;
       }
        
    }
    return maximum;
}


//4.	Check eligibility for a driving license: age ≥ 18 and vision_score ≥ 7.

     public static void dl_Check(int age, float vision_score){
    
    if (age < 18) {
        System.out.println("Person is a minor, he can't get a Driving license.");
    } else {
        if (vision_score >= 7) {
            System.out.println("Person is eligible for a Driving license.");
        } else {
            System.out.println("Person is not eligible for a Driving license due to low vision score.");
        }
           }
     }


// 5.	Implement hiring rule logic: candidate is selected only if
//	coding ≥ 4, problem-solving ≥ 4, fundamentals ≥ 4, communication ≥ 3, cgpa ≥ 7


public static void candidate_Selection(String name,int coding, int problem_solving, int fundamentals, int communication, int cgpa){



    if (coding >= 4 && problem_solving >=4 && fundamentals >=4 && communication >=3 && cgpa >=7 ){

        System.out.println(name + " is selected in the interview");
        
    }else{
         System.out.println(name + " is not selected in the interview");
    }



}

//6.	Create a method that checks whether a number is divisible by 2, 3, both, or none.


  public static void divisible_2_3(int number){

    if(number%2 == 0){
        System.out.println(number+ " is divisible by 2");
    }else 
    {System.out.println(number+ " is not divisible by 2");}
    if(number%3 == 0){
        System.out.println(number+ " is divisible by 3");
    }else 
    {System.out.println(number+ " is not divisible by 3");}
    if(number%2 == 0 && number%3 == 0){
        System.out.println(number+ " is divisible by both 2 and 3");
    }else 
    {System.out.println(number+ " is not divisible by both 2 and 3");}


  }
//7.	Check if a number lies within a given range [10, 20]. Print appropriate message.

        public static void check_number_bw10_20(int number){

            if(number>=10 && number<=20 ){

              System.out.println(number+ " is in between 10 and 20");
            }
            else{System.out.println(number+ " is not in between 10 and 20");}

        }

//8.	Create a nested if structure to check: if student passes internal → check if CGPA ≥ 8 → print scholarship message.

public static void Scolarship_check(String name,boolean internalMarks, int cgpa){

if(internalMarks){

    if(cgpa>8){
        System.out.print(name+ " is eligible to scholarship");
    }else{
        System.out.print(name+ " is not eligible to scholarship");
    }
}else{
    System.out.print(name+ " is not passed the internals");
}
}

//9.	Using or operator, check if either marks in English or Maths is ≥ 90 → print “Merit”.

public static void Marks_check(int english, int maths){

if(english >= 90 || maths >= 90){

    System.out.println("merit");
}
}

//10.	Write a method that takes a Boolean variable eligible and prints “Allowed” if not false. Use ! operator.


public static void isAllowed(boolean permission){

   if (!permission){
       System.out.println("allowed");
   }

}



    public static void main(String[] args){
 
      //odd_Even_Check(61);
      //isTeenager("Dileep",28);
      //int max= max_Of_Numbers(20,353,46);
      //System.out.println("The maximum number out of three numbers is " + max);
      //dl_Check(28,5.6f);
      //candidate_Selection("Dileep",2,8, 9, 6, 8);
      //divisible_2_3(2);
      //check_number_bw10_20(13);
      //Scolarship_check("dileep",false,5);
      //Marks_check(80,90);

      boolean eligible = false;
      isAllowed(eligible);





    }
}

public class Sum{

static int getsum(int a , int b){


  return a + b;
  


}

static void invoke_getsum(){

  int result = getsum(55,85);

  System.out.println(result);


}


public static void main(String[] args){



  invoke_getsum();
  


}



}

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

public class Function_even_odd {
    


    static boolean iseven(int inp){

        if(inp % 2 == 0){
            System.out.println("Number is even");
            return true;
        }
        else{
             System.out.println("Number is odd");
             return false;
        }


    }

    static void invoke_iseven(){
          
        int number = 146465456;
        int number2 = 1464457;

        iseven(number);
        iseven(number2);

    }

    public static void main(String[] args) {
      invoke_iseven();
    }

}

public class check_isdigit {
    

    static boolean isdigit(String str_inp){

        boolean result = true;

        for(int i = 0; i < str_inp.length(); i++){

            char character = str_inp.charAt(i);

            if(character < '0' || character > '9'){

                result = false;
                break;

            }


        }

        return result;

    }
   
    static void  invoke_isdigit(){

 
        

        boolean result =  isdigit("46465");

        if(result) System.out.println("it is a proper number");
        else System.out.println("it is not a proper number");

    }


    public static void main(String[] args) {

         invoke_isdigit();

        
    }




}



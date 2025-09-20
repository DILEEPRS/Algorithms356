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

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
public class recursion {
    
//1. Print numbers from 1 to N using recursion.

  public static void print_Numbers(int start,int n)
  {
    if(start>n){
        return;
    }
     else{
        System.out.println(start);
        print_Numbers(start+1,n);

     }


  }


//2. Find the sum of first N natural numbers using recursion.





    public static void main(String[] args){

        int n = 10;

        print_Numbers(1,n);



    }

}

public class recursion {
  

static void increment_counter(int counter){
   
    if(counter >= 20){  
        return; 
      }
    System.out.println(counter);  
    counter = counter + 1;
    increment_counter(counter);
    System.out.println(counter);
    
    
}    

public static void main(String[] args) {
     

   increment_counter(10);

   //System.out.println(number);


}



}

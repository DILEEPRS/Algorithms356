public class Switch_working {


static String Print_month(int month){
 
// Here we are assigning each value to a Get_month variable in different cases here we need to use break compulsory and variable need 
// to declare seperately

// String Get_month;


// switch(month)
// {  
//   case 1 : Get_month = "january";
//   break;
//   case 2 : Get_month =  "Feburary";
//   break;
//   default : Get_month = "invalid month";
//   break;
// };

// return Get_month;

String Get_month = switch(month){

  case 1 -> "january";
  case 2 -> "february";
  case 3 -> "march";
  case 4 -> "april";
  case 5 -> "may";
  case 6 -> "june";
  default -> "invalid month";

};
return Get_month;

}

public static void main(String[] args) {
    
 String final_output = Print_month(2);
System.out.println(final_output);

}


}

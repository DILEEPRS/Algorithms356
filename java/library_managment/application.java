public class application {
    

    public static void main(String[] args) {
        
          student newStudent = new student();
          newStudent.Hometown = "gubbi";
          newStudent.name = "harish";
          newStudent.id = 1235;

          student student2 = new student("dileep",28,183);

          newStudent.age = 20;

          System.out.println(newStudent.getAge());
          System.out.println(student2.getName());

          bookmanagment operations = new bookmanagment();

          book book3 = new book("algorithms", "dileep", "swapna publisher");
          book book4 = new book("Datastructures", "Anil", "gosala publisher");

          operations.checkout(student2,book3);
          operations.returningBook(newStudent,book4);
           operations.returningBook(student2,book4);
  



    }
  

}

public class bookmanagment {
    
public boolean checkout(student student, book book ){

    System.out.println("student " + student.getName() + " is taking book " + book.getTitle());

    return true;
}

public boolean returningBook(student student, book book ){

    System.out.println("Student " + student.getName() +" with id "+ student.id + " is returning book " + book.getTitle());

    return true;
}



}

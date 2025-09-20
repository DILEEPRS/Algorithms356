public class student {

    public String name;
    public int age;
    protected int id;
    protected String Hometown;


    protected String getName(){

        return this.name;
    }

    protected int getAge(){

        return this.age;
    }

    private int getId(){

        return this.id;

    }

    // implementing default constructor

    public student (String name, int age, int id){

        this.name = name;
        this.age = age;
        this.id = id;

    }

    public student(){

    }

}
//types of constructor in java


public class Student {
    String name;
    int age;

    //default constructor
    public Student() {
        name = "Abhijit";
        age = 0;
        System.out.println("Default constructor called");
    }

    //parameterized constructor 
    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Paramerterized constructor called");
    }

    //copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy constructor called");
    }

    public void display() {
        System.out.println("Name: "+name+",Age: "+age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Abhijit", 21);
        s2.display();

        Student s3 = new Student(s2);
        s3.display();
    }

    
}

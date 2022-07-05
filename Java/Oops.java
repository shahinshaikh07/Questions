class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writes Something with "+this.color+ " and " +type);
    }
    public void printDetails()
    {
        System.out.println(this.color);
    }

}


class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(int age){
System.out.println(age);
    }


//     Student(String name, int age){   //parametesized 
// this.name = name;
// this.age = age;
//         System.out.println("Constructor called");
//     }
Student(Student s2){   //copy
    this.name= s2.name;
    this.age = s2.age;

}

Student(){}
}
public class Oops{
public static void main(String[] args) {

// Student s1 = new Student("yasrab", 27);   //parameterized constructor
Student s1 = new Student();
s1.name = "Shahin"; 
s1.age = 24;
Student s2 = new Student(s1);  //copy 

s2.printInfo();

Student s3 = new Student();
s3.printInfo(17);   //polymorphism

    // System.out.println("Hello");
    // Pen pen1 = new Pen();
    // Pen pen2 = new Pen();
    // pen1.color = "Red";
    // pen1.type = "ballpoint";
    // pen1.write();
    // pen2.color = "blue";
    // pen2.type = "ink pen";
    // pen2.write();

    // pen1.printDetails();
    // pen2.printDetails();
}
}
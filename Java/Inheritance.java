class Shape{
    String color;
    public void area()
    {
System.out.println("Displays area: ");
System.out.println(color);
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((l*h)/2);
        System.out.println(color);
    }
}
class Equi extends Triangle{
    
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
           t.color = "Pink";
        t.area(2, 4);
        // t.color = "Pink";
        // t.area();
        
    }
}

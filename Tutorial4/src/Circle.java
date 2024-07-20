import org.w3c.dom.ls.LSOutput;

//Superclass
class Circle {
    public double radius;
    public double area(){
        return Math.PI * radius *radius;
    }

    public double perimeter(){
        return 2*Math.PI * radius ;
    }

    //Constructor
    public Circle(){
        System.out.println("Print Parent");
    }

    //Parameterized Constructor
    public Circle(int x){
        System.out.println("Print Parent " + x);
    }



    //Print
    public void print(){
        System.out.println("Printing circle");
    }

}




//Subclass
 class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area()* height;
    }





    //Constructor
    public Cylinder(){
        System.out.println("Print Child");
    }

    //Parameterized Constructor (only non-parameterized constructor of parent will execute
    public Cylinder(int y){
        System.out.println("Print Child " + y);
    }




    //Parameterized Constructor 2
    public Cylinder(int x, int y){
        super(x);   //calling the parameterized parent constructor, put first
        System.out.println("Print Child " + y);
    }


    //Print
    public void print(){
        System.out.println("Printing cylinder");
    }
}

class Grandchild extends Cylinder{
    public Grandchild(){
        System.out.println("Print Grandchild");
    }
}
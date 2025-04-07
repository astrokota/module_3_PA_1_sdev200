//extends GeometricObject class to implement comparable interface
public class Circle extends GeometricObject implements Comparable<Circle> {
    
    //instanced variable that stores radius of circle
    private double radius;

    //constructor(default), no args
    public Circle() {
    }

    //constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius; //initialization of radius with set arg value
    }

    //constructor to initialize radius, color, and filled property of Circle
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius; //initialize radius
        setColor(color); //set color using inherited method
        setFilled(filled); //set filled using inherited method
    }

    //get method for radius
    public double getRadius() {
        return radius;
    }

    //set method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //method for area of a circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //method for diameter of a circle
    public double getDiameter() {
        return 2 * radius;
    }

    //method for perimeter of a circle
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    //method for the printing of information about the circle
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    //method from comparable interface to compare two Circle object's radii
    public int compareTo(Circle other) {
        if (this.radius < other.radius) {
            return -1;
        } else if (this.radius > other.radius) {
            return 1;
        } else { //if both circles have same radius, 0 returned indicates both are equal
            return 0;
        }
    }

    //equals() method is overwritten to compare two Circle objects
    @Override
    public boolean equals(Object obj) {
        
        //if references are the same, there is equality
        if (this == obj) {
            return true;
        }

        //if object null or not same class, no equality
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        //if same radius is found with both objects, there is equality
        Circle otherCircle = (Circle) obj;
        return this.radius == otherCircle.radius;
    }
}

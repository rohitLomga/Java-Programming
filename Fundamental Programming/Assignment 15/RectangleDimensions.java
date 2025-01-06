package Assignment_15;

public class RectangleDimensions {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(); // Creating first object
        System.out.println("Area of rectangle : " + r1.Area()); // Printing the area of the rectangle
        System.out.println("Perimeter : " + r1.Perimeter()); // Printing the perimeter of the rectangle

        // Creating the second object
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println("Area of rectangle : " + r2.Area()); // Printing the area of the rectangle
        System.out.println("Perimeter : " + r2.Perimeter()); // Printing the perimeter of the rectangle

    }

}

// Creating Rectangle class
class Rectangle{

    private int length;
    private int width;

    Rectangle(){
        length = 5;
        width = 7;
    }

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int Area(){
        int area = length * width;
        return area;
    }

    public int Perimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }

}

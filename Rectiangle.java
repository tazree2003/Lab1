public class Rectangle {
    
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public int calculateArea() {
        return length * width;
    }
    
    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle(9, 7);
        Rectangle rectangle2 = new Rectangle(13, 10);

        rectangle1.displayDetails();
        rectangle2.displayDetails();
    }
}


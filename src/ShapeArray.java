public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate a triangle, a circle, and a rectangle (square is a rectangle with equal sides)
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(4, 4); // Square with width = length = 4

        // Store instances in the shapeArray
        Shape[] shapeArray = {triangle, circle, rectangle};

        // Loop through the array and print the toString method for each object
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}

package lesson04.quiz02;

public class ShapeTest {

	public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);  // up casting
        shape[1] = new Rectangle(7, 13); // up casting
        shape[2] = new Circle(12); 		 // up casting

        for (int i = 0; i < shape.length; i++) {
            shape[i].printArea();
        }
    }

}

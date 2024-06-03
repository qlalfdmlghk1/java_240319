package lesson04.quiz02;

public class Circle extends Shape {
	
	public Circle(int radius) {
		this.name = "원"; 	// super로 써도 됨
		this.area = radius * radius * Math.PI;
	}
}
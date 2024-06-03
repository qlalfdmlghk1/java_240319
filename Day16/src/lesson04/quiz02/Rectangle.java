package lesson04.quiz02;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	// 부모 클래스에서 수행되도록 생성자부분에 작성해야 함.
	public Rectangle(int width, int height) {
		super.name = "사각형";
		this.area = height * width; // super로 써도 됨
	}
}

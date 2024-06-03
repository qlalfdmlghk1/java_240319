package lesson04.quiz02;

public class Triangle extends Shape{
	private int bottomLine;
	private int height;
	
	public Triangle(int bottomLine, int height) {
		this.bottomLine = bottomLine;
		this.height = height;
	}
	
	@Override
	public void printArea() {
		System.out.println("도형은 삼각형이며 넓이는 " 
	+ (double)(this.bottomLine * this.height / 2) 
	+ "cm^2 입니다.");
	}
}

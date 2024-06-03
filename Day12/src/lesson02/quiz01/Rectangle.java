package lesson02.quiz01;

public class Rectangle {
	// 필드 -> 은닉화
	// 어떻게 세팅할 것인가? 	1.생성자, 2.세터
	private int width;
	private int height;
	
	// 메소드
	// 생성자 - 필드 세팅 => 밖에서 가져온 음료수를 냉장고에 세팅해놓은 상태
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 " + this.width + "cm, 세로 " 
		+ this.height + "cm 사각형이 만들어졌습니다");
	}
	
	// Setter
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	// 넓이 구하기
	public int getArea() {
		return this.height * this.width;
	}
	
	public int getRound() {
		return ((this.height + this.width) * 2);
	}
//	출력 예시
//	가로 30cm, 세로 50cm 사각형이 만들어졌습니다.
//	넓이:1500cm^2
//	둘레:160cm
//	가로 10cm, 세로 10cm 사각형이 만들어졌습니다.
//	넓이:100cm^2
//	둘레:40cm
}

package lesson02.quiz02;

public class Circle {
	// 필드
	// 어떻게 채울 것인가? 1.생성자, 2.세터
	private int radius;
//	private double pi = 3.14;

	
	// 메소드
	// 생성자 - 필드에 값 넣기
	public Circle(int radius) {
		this.radius = radius;
	}


	// Setter
	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 넓이 구하기
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
	// 둘레 구하기
	public double calculateRound() {
		return Math.PI * this.radius * 2;
	}
	
	public double getRound() {
		return 2 * 3.14 * this.radius;
	}
	
	// 개수에 따른 넓이
	// 오버로딩(Overloading): 메소드 이름은 같은데 
	// 파라미터의 개수가 다르거나 파라미터의 타입이 다른 경우 
	// 다른 메소드로 인지하고, 일치하는 메소드로 자동 호출되는 것.
	public double calculateArea(int count) { // 확장성을 위해 파라미터로 개수 받아옴
		return calculateArea() * count;
	}
}

//출력 예시
//원의 넓이 : 200.96
//원의 둘레 : 50.24
//원 25개 넓이 : 5024.0

package lesson02.quiz02;

public class CircleTest {

	public static void main(String[] args) {
//		원 Class를 이용하여 반지름이 8인 원의 객체를 만들기
		Circle c1 = new Circle(8);
		
		// 반지름의 크기를 변경한다면
//		c1.setRadius(7);
		
		System.out.println("원의 넓이 : " + c1.calculateArea());
		System.out.println("원의 둘레 : " + c1.calculateRound());
		System.out.println("원 25개 넓이 : " + c1.calculateArea(25));
	}

}

package lesson05.ex01;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); -> error 발생. 추상 클래스는 객체화 할 수 없다.
		Animal animal = new Tiger();//up casting
		animal.cry();
		animal.eat();
	}

}

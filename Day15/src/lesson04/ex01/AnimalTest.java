package lesson04.ex01;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.cry();
//		animal.eat();
		
		int number = (int)3.5; // casting
		
		// up casting: 자식 -> 부모로 캐스팅
		// 1. 부모 클래스의 메소드들을 사용 가능
		// 2. 부모 클래스에 있는 메소드를 오버라이드 한 메소드로 호출됨
		// 3. 자식 클래스에만 있던 메소드는 사용 불가
		Animal animal = (Animal)new Cat(); // 부모의 타입으로 한정하겠다.
		animal.cry();
		animal.eat();
		//animal.lash(); - 사용 불가
		
		
		// up casting: 부모 -> 자식로 캐스팅
		// 1. 자식 클래스가 여러개이므로 명확하게 캐스팅 문법을 써야함
		// 2. instanceof 키워드를 사용해 타입 검사를 해야함
		if (animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.cry();
			dog.eat();
			dog.lash();
		} else if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.cry();
			cat.eat();
			cat.grooming();
		}
	}
}

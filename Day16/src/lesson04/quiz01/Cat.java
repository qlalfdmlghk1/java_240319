package lesson04.quiz01;

// 자식 클래스
public class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	public void grooming() {
		System.out.println("그루밍");
	}
}
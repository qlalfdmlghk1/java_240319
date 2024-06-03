package lesson04.quiz01;

//자식 클래스
public class Dog extends Animal{
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	public void lash() {
		System.out.println("꼬리 살랑살랑");
	}
}
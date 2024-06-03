package lesson01.ex01;

public class CellphoneTest {
	
	// 나의 의식
	public static void main(String[] args) {
		Cellphone cp1 = new Cellphone();
		cp1.maker = "apple";
		cp1.model = "iphone11pro";
		cp1.color = "gold";
		cp1.price = 1500000;
		
		System.out.println(cp1.maker);
		System.out.println(cp1.model);
		System.out.println(cp1.color);
		System.out.println(cp1.price);
		
		cp1.call();
		cp1.camera();
		
		// 값 변경
		cp1.color = "pink";
		System.out.println(cp1.color);
	}

}

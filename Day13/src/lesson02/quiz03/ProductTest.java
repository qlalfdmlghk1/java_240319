package lesson02.quiz03;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("새우깡", 1300, "2025-05-22");
		System.out.println("이름 : " + p1.getName());
		System.out.println("가격 : " + p1.getPrice());
		System.out.println("유통기한 : " + p1.getDuedate());
		System.out.println();
		System.out.println("제품 5개의 가격 : " + p1.totalPrice(5));
		System.out.println("제품 13개의 가격 : " + p1.totalPrice(13));
		System.out.println(p1.availableSale());
		System.out.println(p1.availableSale2());
		p1.ableSell();
	}

}

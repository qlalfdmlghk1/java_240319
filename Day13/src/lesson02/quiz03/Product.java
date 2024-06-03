package lesson02.quiz03;

public class Product {
	private String name;
	private int price;
	private String duedate; 
	
	// 메소드
	public Product(String name, int price, String duedate) {
		this.name = name;
		this.price = price;
		this.duedate = duedate;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getDuedate() {
		return this.duedate;
	}
	
	// 제품 n개의 가격
	public int totalPrice(int count) {
		return this.price * count;
	}
	
	
	// 판매 가능 여부
	public String availableSale() {
		// "2024-04-04"   <= 	"2025-05-22"	: 판매가능
		// "2024-04-04"   > 	"2025-05-22"	: 판매불가		
		String[] arr = this.duedate.split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		// 이 조건에서 참이 되면 => 판매 가능
		if (year > 2024) {
			return "판매 가능 상품";
		} else if (year == 2024) {
			if (month > 4) {
				return "판매 가능 상품";
			} else if (month == 4) {
				if (day > 4) {
					return "판매 가능 상품";
				}
			}
		}
		// 참이 된 적 없으면 => 판매 불가
		return "판매 불가 상품";

	}
	
	// 판매 가능 여부2
	public String availableSale2() {
		// "2024-04-04"   <=  "2025-05-22"	: 판매가능
		// "2024-04-04"   >   "2025-05-22"	: 판매불가
		
		// A.compareTo(B)
		// 유통기한.compareTo(오늘날짜) => 0이나 1일 때 판매 가능
		// A(기준값)가 크면: 1
		// A(기준값)이 작으면: -1
		// A(기준값)과 같으면: 0
		
		if (this.duedate.compareToIgnoreCase("2024-04-04") >= 0) {
			return "판매 가능 상품";
		}
		return "판매 불가 상품";
	}
	
	
	
	public void ableSell() {
		if (Integer.valueOf(this.duedate.substring(0,4)) >= 2024) {
			if (Integer.valueOf(this.duedate.substring(5,7)) >= 4) {
				if (Integer.valueOf(this.duedate.substring(8,10)) >= 4) {
					System.out.println("판매 가능 상품");
				} else {
					System.out.println("판매 불가 상품");
				} 
			} else {
				System.out.println("판매 불가 상품");
			} 
		} else {
			System.out.println("판매 불가 상품");
		} 
	}
}

//이름 : 새우깡
//가격 : 1300 
//유통기한 : 2025-05-22 
//제품 5개의 가격 : 6500
//제품 13개의 가격 : 16900
//판매 가능 상품

//유통기한이 지나지 않았을 경우 "판매 가능상품", 유통기한이 지났을 경우 "판매 불가 상품"

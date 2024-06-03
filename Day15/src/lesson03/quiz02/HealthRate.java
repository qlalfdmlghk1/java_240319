package lesson03.quiz02;

// 자식 클래스
public class HealthRate extends HealthInfo {

	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}
	

//	(비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
	
	// 표준체중 메소드 (표준체중:SW=(H-100)*0.9) -> 부모에 키 필드가 있음
	private double sw() {  // main에서 안보이게 막아놔도 된다.
		return (super.height - 100) * 0.9;
	}
	
	// 비만도 메소드 (비만도: B(%)=(W-SW)/SW * 100)
	private double getRatio() {  // main에서 안보이게 막아놔도 된다.
		return (super.weight - sw()) / sw() * 100;
	}
	
	private String status() {  // main에서 안보이게 막아놔도 된다.
		double ratio = getRatio();
		if (ratio < 10) {
			return "정상"; 
		} else if (ratio < 20) { // 10 ~ 19
			return "과체중";
		} else {
			return "비만"; 
		}
	}
	@Override
	public void showInfo() {
       super.showInfo();
       System.out.println("=> " + status());
    }
	
	public void check() {
		if (getRatio() < 10) {
			System.out.println("정상입니다."); 
		} else if (10 <= getRatio() && getRatio() < 20) {
			System.out.println("과체중입니다."); 
		} else if (getRatio() >= 20)  {
			System.out.println("비만입니다."); 
		} 
	}
}
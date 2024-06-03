package lesson05.quiz01;

public class DollerToWon extends Converter {
	
	public DollerToWon(int won) {
		super.ratio = won;
	}

	@Override
	protected void printConverted() {
		System.out.println(super.result + "원");
		
	}

}

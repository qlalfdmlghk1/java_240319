package lesson05.quiz01;

public class CmToInch extends Converter {

	public CmToInch() {
		this.ratio = 0.394;
	}
	
	@Override
	protected void printConverted() {
		System.out.println(super.result + "인치");
	}

}

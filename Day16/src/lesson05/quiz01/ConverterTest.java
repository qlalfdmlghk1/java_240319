package lesson05.quiz01;

public class ConverterTest {

	public static void main(String[] args) {
        Converter d2w = new DollerToWon(1356); // 환율 검색하기
        d2w.convert(10000); // input 값
        d2w.printConverted(); 
        
     // cm -> inch 비율 검색하기
        Converter c2i = new CmToInch(); // ratio가 변하지 않음 
        c2i.convert(20); // input 값
        c2i.printConverted();
    }
}

//출력 예시
//1.188E7원
//7.874020000000001inch
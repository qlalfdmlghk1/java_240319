package lesson02.quiz04;

public class OmrCard {
	// 필드
	private String name;
	private int studentId;
	private int[] answer = new int[5]; // 학생의 답
	
	
	public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.answer[0] = a1;
		this.answer[1] = a2;
		this.answer[2] = a3;
		this.answer[3] = a4;
		this.answer[4] = a5;
	}
	
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	// 외부에서 호출할 수 있게 getter
	public String getName() {
		return this.name;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public int[] getAnswer() {
		return this.answer;
	}
	
	
}

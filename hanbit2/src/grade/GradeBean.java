package grade;
//여긴 메인머서드 xxxx 
public class GradeBean {
	// =====맴버필드영역 (스코프)====
	private int kor,eng,math,java; // 인스턴스 변수는 초기화를 하지 않는다. return값을 위한게 아니기때문에.
	                  // 파란색 total, vag는 공정내 임시값이기때문에 밤색 total, avg이랑은 다름
					  // 로칼 변수는 밤색, 인스턴스 변수는 청색
	private String name;

	public void setJava(int java){
		this.java = java;
	}
	public int getJava(){
		return java;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public int getKor(){
		return kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public int getEng(){
		return eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	public int getMath(){
		return math;
	}
	
	// =====맴버메소드 영역(스코프)====

}

package grade;

public interface GradeService { //추상메소드
	// 총점 구하기
	public int getTotal(GradeBean grade); 
	
	// 평균 구하기
	public int getAvg(GradeBean grade);
	// 학점 구하기 : getGrade
	/*
	 평균점수가 
	 90이상 A
	 80이상 B
	 70이상 C
	 60아상 D
	 50이상 E
	 50미만 F 학점입니다. 
	 */
	 public String getGrade(GradeBean grade);
}

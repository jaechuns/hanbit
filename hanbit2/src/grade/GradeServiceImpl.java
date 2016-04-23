package grade;

public class GradeServiceImpl implements GradeService {
	// 총점 구하기
	@Override
	
	public int getTotal(GradeBean grade){ //추상메소드
		//이건 내가 타자로 만드는거
		int total= grade.getKor() + grade.getEng() + grade.getMath() + grade.getJava();
		return total;
	} 
	
	// 평균 구하기
	@Override
	public int getAvg(GradeBean grade){
		//int avg= (grade.getKor() + grade.getEng()+ grade.getMath()+ grade.getJava())/4;
		int avg = (getTotal(grade));
		return avg;
	}
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
	@Override
	 public String getGrade(GradeBean grade){
		 //int total = grade.getKor() + grade.getEng() + grade.getMath() + grade.getJava();
		 //int avg = (getTotal(grade))/4;
         String result= "";
/*	 if (avg>=90){
		 grade = "A";
	 }else if (avg>=80) { 
		 grade = "B";
	 }else if (avg>=70) { 
		 grade = "C";
	 }else if (avg>=60) { 
		 grade = "D";
	 }else if (avg>=50) { 
		 grade = "E";
	 }else{
		 grade="F";
	 }
	  return grade;
*/
	 //---------------
	  switch (((getTotal(grade))/4)/10) {
	case 10: result = "A";   break;
	case 9:	result = "A";	break;
	case 8:	result = "B";	break;
	case 7:	result = "C";	break;
	case 6:	result = "D";	break;
	case 5: result = "E";	break;
	default: result = "F";	break;
	}
	  return result;
	  
	 
	 }
}

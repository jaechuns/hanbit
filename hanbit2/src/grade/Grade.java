package grade;
//여긴 메인머서드 xxxx 
public class Grade {
	public int getTotal(int kor, int eng, int math){
		//이건 내가 타자로 만드는거
		int total=kor + eng + math;
		return total;
	} 
	
	
	
	public int getAvg(int total){
		int avg=total/3;
		return avg;
	}
}

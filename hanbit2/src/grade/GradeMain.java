package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java
 * jaechuns@naver.com
 * Story : 성적표 프로그램
 */
public class GradeMain {
	/**
	 [문제]
	 과목별 점수를 입력받아 총점,평균,학점을 구하는 프로그램을 완성하시오.
	 (과목 : 국어,영어,수학)
	 */

	/**public static void main(String[] args) {
    //--------변수 선언 영역----------
	Scanner scanner = new Scanner(System.in);
	Grade grade = new Grade();
	int kor=0, eng=0, math=0, total=0, avg=0;
	String name = "";
	//--------파라미터 입력 영역--------

	System.out.println("이름:[ ] 국어: [ ],영어: [ ],수학:[ ]");
	name = scanner.next();
	kor = scanner.nextInt();
	eng = scanner.nextInt();
	math = scanner.nextInt();
	//-------메소드 호출-----------
	total = grade.getTotal(kor,eng,math);
	avg = grade.getAvg(total);
	//---- 리턴 값 출력 영역----------
	System.out.println(name+"의 총점은 "+total+"이고,평균은 "+avg+"이다.");
	**/
	public static void main(String[] args) {
	    //--------변수 선언 영역----------
		Scanner scanner = new Scanner(System.in);
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceByHanbitImpl ();
		int total=0, avg=0;
		String name = "",xxx="";
		//--------파라미터 입력 영역--------

		System.out.println("이름:[ ] 국어: [ ],영어: [ ],수학:[ ], 자바:[ ]");
//		name = scanner.next();
		grade.setName(scanner.next());
		//-------메소드 호출-----------
//		total = grade.getTotal(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//		avg = grade.getAvg(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//		xxx = grade.getGrade(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		grade.setKor(scanner.nextInt());
		grade.setEng(scanner.nextInt());
		grade.setMath(scanner.nextInt());
		grade.setJava(scanner.nextInt());
//		total = grade.getTotal();
		
		//---- 리턴 값 출력 영역----------
		 //System.out.println(name+"의 총점은 "+total+"이고,평균은 "+grade.getAvg(total)+"이다.");	
		System.out.println(grade.getName()+"의 학점은 "+service.getGrade(grade)+"이다.");	
		
		//-------------
		
}
}

package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * MaxMin.java
 * jaechuns@naver.com
 * Story : 배열+forloop
 */
public class MaxMin {
	  /**
	   [문제] 
	   한반에 5명의 학생이 시험을 치렀습니다.
	   선생님이 5명의 점수를 입력하자마자 바로 1등과 최고점과 최저점이 출력되는
	   프로그램을 완성하시오.
	   */
	public static void main(String[] args) {
		System.out.println("===점수를 입력하면 최고점, 최저점이 출력됩니다===");
		System.out.println("총3명의 점수만 입력이 가능합니다.");
		//int max=0,score1=0, score2=0, score3=0;
		  int max =0;
		Scanner scanner = new Scanner(System.in);
		int [] scores = new int [3];
		System.out.println("첫번째 학생의 점수를 입력하세요");
		scores[0] = scanner.nextInt();
		System.out.println("두번째 학생의 점수를 입력하세요");		
		scores[1] = scanner.nextInt();
		System.out.println("세번째 학생의 점수를 입력하세요");
		scores[2] = scanner.nextInt();
		if ((scores[0]>scores[1]) && (scores[0] > scores[2])) {
       	   max = scores[0];
       	
		} else if(scores[1] > scores[2]){
			max = scores[1];
			
		} else{
			max = scores[2];
			
		}
		System.out.println("최고점:"+max);
	}
}


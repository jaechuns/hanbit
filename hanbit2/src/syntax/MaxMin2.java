package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * MaxMin2.java
 * jaechuns@naver.com
 * Story : 배열함수
 */
public class MaxMin2 {
public static void main(String[] args) {
	System.out.println("==점수를 입력하면 최고점, 최저점을 출력합니다.(만점은 100, 0점은 0==");
	System.out.println("총5명의 점수만 표시됩니다. 점수를 입력해주세요");
    int max = 0, min=100;
    Scanner scanner = new Scanner(System.in);
    int [] scores = new int [5];
    for (int i = 0; i < scores.length; i++) {
	    		   // <10으로 해야지 0~9 까지 10개가 나옴
	    scores[i] = scanner.nextInt();
    }
     for (int i = 0; i < scores.length; i++) {
		System.out.print(scores[i]+"\t");
		
	}  
	for (int i = 0; i < scores.length; i++) {
		if (scores[i]>=0) {
		    max = scores[i];
		}
		if (scores[i]<=0) {
			min = scores[i];
		}
	}
	
     System.out.println("최고점은 "+max+",최저점 : "+min);
	
     
  }
}

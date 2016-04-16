package syntax;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 *2016. 4. 16.
 *SumIf10.java
 * jaechuns@naver.com
 * Story : for-loop + if-branch 수열의 합
 */
public class SumIf10 {
	public static void main(String[] args) {
         //문제 : for-loop 과 syso를 한번만 써서 홀수 합, 짝수합을 구하시오
        int oddsum=0, evensum=0;
		for (int i = 1; i <= 10; i+=2) {
			if (i%2==0) {
				evensum +=i;
			} else {
				i= oddsum;
			}
		}
		System.out.println("홀수합은 "+oddsum+"이고, 짝수의 합은 "+evensum+"이다");
	}
}

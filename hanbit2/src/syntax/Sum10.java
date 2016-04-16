package syntax;

/**
 *2016. 4. 16.
 *Sum10.java
 * jaechuns@naver.com
 * Story : 1부터 10까지의 합
 */
public class Sum10 {
	public static void main(String[] args) {
		int sum = 0;   //홀수는 OddSum이고 짝수는 evenSum
	//	sum = 1+2+3+4+5+6+7+8+9+10;   // 1~10 숫자는 "항" // 추가로 계속더해지는값 : 공차 (+1) // 
	
				for (int i = 1; i <= 10; i+=2) {
					//i=imit첫항  args.length=limit 끝항 // i+=2 는 홀수 1+3+5+7+9 의 합
				sum += i; // 그냥 = i;만했을땐 loop이 적용이 안됨. += i; 이라고 문법을 적용해야함.
				//System.out.print(i+"\t"); 
				}
				System.out.println("1부터 10까지의 홀수의 합 ="+sum);
				
				
				for (int i = 2; i <= 10; i+=2) {
					//i=imit첫항  args.length=limit 끝항 // i+=2 는 짝수 2+4+6+8+10 의 합
				sum += i; // 그냥 = i;만했을땐 loop이 적용이 안됨. += i; 이라고 문법을 적용해야함.
				//System.out.print(i+"\t"); 
				}
				System.out.println("2부터 10까지의 짝수의 합 ="+sum);
	}
}

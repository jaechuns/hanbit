package syntax;

import java.util.Scanner;
/**
 * 2016. 4. 9.
 * Minus.java
 * pakjkwan@gmail.com
 * Story : 뺄셈 문법 
 */
public class Minus {
	public static void main(String[] args) {
		System.out.println("=== 정수 뺄셈 ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int a = scanner.nextInt();
		System.out.println("두번째 수 입력");
		int b = scanner.nextInt();
		int c = a - b;
		System.out.println(a+"-"+b+"="+c);
	}
}

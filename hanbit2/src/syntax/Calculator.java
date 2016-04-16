package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9. 
 * Calc.java 
 * pakjkwan@gmail.com 
 * Story : 브랜치 예제(계산기 프로그램) : Switch case
 */
public class Calculator {
	public String execute(int a, String op, int b) {
		String result = "";
		switch (op) {
		case "+":
			result = (a + "+" + b + " = " + (a + b));
			break;
		case "-":
			result = (a + "-" + b + "=" + (a - b));
			break;
		case "*":
			result = (a + "X" + b + "=" + (a * b));
			break;
		case "/":
			result = (a + "/" + b + "=" + (a / b) + "..." + (a % b));
			break;
		default:result = ("연산기호를 잘못 입력했습니다.");
			break;
		}
		return result;
	}
}

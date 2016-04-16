package rps;

import java.util.Scanner;

/**
 *2016. 4. 16.
 *RPS.java
 * jaechuns@naver.com
 * Story : 가위바위보 게임
 */
public class GameRPS2 {
	/**
	 컴퓨터와 사용자간의 가위바이보 게임을 완성하시오.
	 (Math.random()*E+S);
	 S: 랜덤의 시작값
	 E: 랜덤의 마지막값
	 */
	public static void main(String[] args) {
		System.out.println("=== 가위바위보 게임 ===");
		System.out.println("가위:1, 바위:2, 보자기:3");
		Scanner scanner = new Scanner(System.in);
		
		//----------------------[가공해야할 데이터를 입력하는 부분]----------------------------
		int sccisors=1,rock=2,paper=3, rpsValue=0, comValue=0;
		String result = "";
		rpsValue = scanner.nextInt();
		comValue = (int) (Math.random()*3+1);
		switch (rpsValue) {
		case 1:
			if (comValue==1) {
				result = "사용자 가위, 컴퓨터 가위 : 비김";
			} else if (comValue==2){
				result = ("사용자 가위, 컴퓨터 바위 : 당신 패배");
			} else {
				result = ("사용자 가위, 컴퓨터 보자기 :당신 승리");
			}
			
			break;
		case 2:
			if (comValue==1) {
				result = ("사용자 바위, 컴퓨터 가위 : 당신 승리");
			} else if (comValue==2){
				result = ("사용자 바위, 컴퓨터 바위 : 당신 비김");
			} else {
				result = ("사용자 바위, 컴퓨터 보자기 : 당신 패배");
			}
			
			break;
		case 3:
		if (comValue==1) {
			result = ("사용자 보자기, 컴퓨터 가위 : 당신 패배");
		} else if (comValue==2){
			result = ("사용자 보자기, 컴퓨터 바위 : 당신 승리");
		} else {
			result = ("사용자 보자기, 컴퓨터 보자기 : 당신 비김");
		}
			break;
			
			
		default: result = ("1~3까지 숫자만 입력하시오");
			break;
		}
		//----------------------[결과가 보여지는부분]----------------------------
		System.out.println(result);
	
	}
}

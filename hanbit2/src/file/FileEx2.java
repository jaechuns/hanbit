package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("입력하려는 대상 파일을 선택해 주세요");
		// C:\Users\USER
		try {
			File file = new File("C:\\Users\\USER\\test\\lotto.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true)); //true 이어붙여 써라
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String msg ="";
			
			while(true){
			System.out.println("[메뉴] 1.전송 2.읽기 0.종료");
		switch (scanner.next()) {
			case "1":	
				System.out.println("메시지입력");
				writer.write(scanner.next());
				writer.newLine();
				writer.flush(); //보내버리는거
				
				break;
			case "2":	
				System.out.println("==메시지보기==");
				while((msg = reader.readLine()) !=null){
					System.out.println(msg);
				}
				reader.close();
				break;
			case "0":	
				writer.close();
				System.out.println("프로그램을 종료합니다");
				return;

			default:System.out.println("1, 2, 0번만 선택이 가능합니다.");
				break;
			}

//			writer.write(scanner.next());
//			writer.flush(); //보내버리는거
//			writer.close();
			}
		} catch (IOException e) {
			// 에라가 발생하면 이쪽에서 처리한다.
			e.printStackTrace();
		} 
		
	}
	
}

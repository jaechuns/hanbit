package lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LottoBean hong = new LottoBean();
		//타입   //인스턴스(객체) //메모리생성 // 생성자
		//LottoBean kim = new LottoBean();
		LottoService service = new LottoServiceImpl();
		System.out.println("얼마치를 구입하셨나요?");
		hong.setMoney(scanner.nextInt());
		service.setLottos(hong);
		int [][] lottos = service.getLottos();

		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//System.out.println("귀하의 로또 장수는 "+service.count(hong)+"장 입니다");
		// hong.setNumber(); 필요없음 , getNumber에 넣었음.
		
		//int num = hong.getNumber();
		//System.out.println("랜덤숫자 결과:"+num);
		
		
	}
}
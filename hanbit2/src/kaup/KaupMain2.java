package kaup;

import java.util.Scanner;

public class KaupMain2 {
	public static void main(String[] args) {
		String name = "";
		double weight=0.0, height=0.0;
	    Scanner scanner =new Scanner(System.in);
	    /*계속 입력-출력하게 */
	    while(true){ //while안에 true 는 무한
    		System.out.println("===카우푸 지수 구하기 프로그램====");
    		System.out.println("[메뉴] 1.계속 2.종료");
    		int key = scanner.nextInt();
    		switch (key) {
			case 1:
			    /*전산입력*/
			    System.out.println("이름 , 키, 몸무게 입력하세요");
			    name = scanner.next();
			    height = scanner.nextDouble();
			    weight = scanner.nextDouble();
				break;                                          //break는 지나감
			case 2:System.out.println("시스템종료합니다."); return;    //return은 ending임
			default: System.out.println("1, 2번만 선택이 가능합니다.");
				break;
			}
    		//

		    
		    KaupBean kaup = new KaupBean();
		    kaup.setName(name);
		    kaup.setWeight(weight);
		    kaup.setHeight(height);
		    
		    KaupService service = new KaupServiceImplByKim();
		    int idx = service.getIndex(kaup);
		    /*전산출력*/
		    String result = service.getResult(idx);
		    System.out.println(result);
		   	
	    }
	     
	}
}

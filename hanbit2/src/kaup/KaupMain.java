package kaup;
import java.util.Scanner;
public class KaupMain {

     public static void main(String[] args) {
           
            /* 변수선언 */
           String name = "", result = "";
           double height=0.0, weight=0.0;
           
            /*데이터 입력*/
           Scanner scanner = new Scanner(System. in);
           System. out.println( "이름, 키, 몸무게순으로 입력하시오" );
           
//          name = scanner.next();
//         height = scanner.nextDouble();
//        weight = scanner.nextDouble();
          
            /*연산*/
            Kaup kaup = new Kaup();
        	kaup.setname(scanner.nextLine());
            kaup.setHeight(scanner.nextDouble());
            kaup.setWeight(scanner.nextDouble());
            
            
           result = kaup.getResult2(weight, height);
           
           System. out.println(kaup.getname()+ "님의 비만도는:" +result );
     }
}







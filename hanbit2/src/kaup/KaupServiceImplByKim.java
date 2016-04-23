package kaup;

public class KaupServiceImplByKim implements KaupService{

	@Override
	public int getIndex(KaupBean kaup) {
		// 알고리즘 구현
		return (int)((kaup.getWeight()/(kaup.getHeight()*kaup.getHeight()))*10000);
	}

	@Override
	public String getResult(int index) {
		String result = "";
		// 알고리즘 구현
	    if (index>=30) {
            result = "비만입니다" ;
      } else if (( index>=24 && index<30)) {
        result = "과체중입니다" ;
       } else if (( index>=20 && index<24)){
        result = "정상입니다" ;
       } else if (( index>=15 && index<20)){
        result = "저체중입니다" ;
       } else if (( index>=13 && index<15)){
        result = "마름입니다" ;
       } else if (( index>=10 && index<13)){
        result = "영양실조입니다" ;
       } else {
        result = "소모증입니다" ; }

		return result;
	}

}

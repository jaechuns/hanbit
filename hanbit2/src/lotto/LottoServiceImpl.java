package lotto;

public class LottoServiceImpl implements LottoService {
	int [][] lottos ; //로또스를 정의
	int [] lotto; //로또를 정의, 돈과 상관없이 생성되는 한줄(숫자6)로또 (천원짤)
	private int count;
	public int getCount() {
		return count;
	}


	public void setCount(LottoBean bean) {
		this.count = bean.getMoney()/1000;
	}


	public void setLottos(LottoBean bean) {
		// 로또번호 만들기(2,15,21,31,39,45)*입력된 돈만큼
		//int count =count(bean);
		setCount(bean);
		this.lottos = new int [count][6];
		this.lotto = new int [6];
		int i = 0;
		if (count<0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while(true){
					int num = bean.getNumber();
					if (isDuplication(count,num)) {
						continue;
					}
					this.lottos[count][i] = num;
					i++;
					if (i==lottos[count].length){
						i=0;
						break;
	  				}
					}
				}
				
			}
		}
	

	@Override
	public int[][] getLottos() {
		// 만들어진 로또번호 가져오기 (get/set문법이 아닌 완성품)
		return lottos;
	}


//	@Override
//	public int generateRandomNum() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public boolean isDuplication(int count, int num) {
		//중복된 번호인지 체크(중복이면 true 리턴)
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i]==num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int[] lotto) {
		// 오름차순으로 정렬하라
		for (int i = 0; i < lotto.length -1; i++) {
			for (int j = 0; j < lotto.length -i -1; j++) {
				if (lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					
				}
			}
		}
	}

	@Override
	public int count(LottoBean bean) {
		// 몇장을 출력할 것인지 결정
		return bean.getMoney()/1000;
	}

}

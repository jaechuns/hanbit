package lotto;

public class LottoBean {
	private int money;
	private int number;

	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		this.setNumber();
		//또는 setNuber(); 로 해주면됨
		return number;
	}
	
	
	public void setNumber() {
		this.number = (int) (Math.random()*45+1);
	}
	
	
}

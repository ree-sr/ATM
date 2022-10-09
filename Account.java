package ATM;

public class Account {

	
	String username[] = {"marko", "alen23", "uno1", "dong2x"};
	String pin[] = {"1234", "4321", "2310", "5711"};
	
	int amnt = 0;
	
	
	public void setDeposit(int amnt) {
		this.amnt = this.amnt + amnt;
	}
	
	public void setWithdraw(int wdraw) {
		this.amnt = this.amnt - wdraw;
	}
	
	public int getAmmount() {
		return amnt;
	}

}

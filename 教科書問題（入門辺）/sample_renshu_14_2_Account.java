package sisanhoyu;

public class sample_renshu_14_2_Account {

	String accountNumber;
	int balance;

	public sample_renshu_14_2_Account(String account,int balance){
		this.accountNumber = account;
		this.balance = balance;
	}



	public String toString(){
		return "\\" + this.balance + "(口座番号＝" + this.accountNumber + ")";
	}

	public boolean equals(Object o){
		if( this == o ){
			return true;
		}
		if( o instanceof sample_renshu_14_2_Account){
			sample_renshu_14_2_Account a = (sample_renshu_14_2_Account)o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)){
				return true;
			}
 		}
		return false;
	}


	public String getAccountNumber(){
		return this.accountNumber;
	}
	public int getBalance(){
		return this.balance;
	}


	public void setAccountNumber(String account){
		this.accountNumber = account;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}


}

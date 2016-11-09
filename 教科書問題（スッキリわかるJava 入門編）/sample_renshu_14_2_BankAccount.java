package sisanhoyu;


public class sample_renshu_14_2_BankAccount {


	public static void main(String[] args) {

		sample_renshu_14_2_Account a1 = new sample_renshu_14_2_Account("4649",1592);
		sample_renshu_14_2_Account a2 = new sample_renshu_14_2_Account(" 4649 ",1592);

		System.out.println(a1);

		if(a1.equals(a2)){
			System.out.println("同じ内容です");
		}else{
			System.out.println("違う内容です");
		}

	}

}

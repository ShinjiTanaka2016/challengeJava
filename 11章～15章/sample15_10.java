package usystem;

public class sample15_10 {

	static int a = 10,b = 0;
	static void Except17Method()throws ArithmeticException{
		System.out.println("  a = " + a + ", b = " + b );
		a = a/b;
	}

	public static void main(String[] args) {
		try{
			Except17Method();
		}catch(ArithmeticException errInf){

		}finally{
			System.out.println("  a = " + a + ", b = " + b );
		}

	}

}

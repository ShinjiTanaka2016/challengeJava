package usystem;

public class sample15_01_Except11 {

	public static void main(String[] args) {
		double d,e = 1.0;
		d = 0.0;

		try{
			if(d > -0.001 & d < 0.001){
				throw new ArithmeticException("ArithmeticException エラーが発生");
			}
			e = 10.0 / d;
		}
		catch(ArithmeticException errInf){
			e = 999.9;
			System.out.println("errInf = " + errInf);
		}
		finally{
			System.out.println("d = " + d + ",e = " + e );
		}

	}
}

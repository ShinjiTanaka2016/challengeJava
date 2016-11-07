package usystem;

public class sample6_03_MyClassTest {

	public static void main(String[] args) {

		sample6_03_MyClass mc = new sample6_03_MyClass();

		mc.v1 = 100;
		mc.v2 = 200;
		mc.add();

		mc.calc( 300, 400 );

		System.out.println( mc.addcalc( 500, 600 ) );

	}

}

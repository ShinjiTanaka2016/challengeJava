package usystem;

public class sample15_09 {

	static int a = 10,b = 0;
	static void Except17Method(){
		System.out.println( "  a = " + a + ", b = " + b );
		a = a/b;
	}


	public static void main(String[] args) {
		Except17Method();
		System.out.println( "  a = " + a + ", b = " + b );
	}

}

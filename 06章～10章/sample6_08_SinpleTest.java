package usystem;

public class sample6_08_SinpleTest {

	public static void main(String[] args) {

		int x = 5;

		sample6_08_Sinple simple = new sample6_08_Sinple(x);	//	コンストラクタ
		simple.x += 10;

		System.out.println("x = " + simple.x);

	}

}
package sisanhoyu;

public class sample_renshu_13_3_Test {

	public static void main(String[] args) {

		//	①
		sample_renshu_13_3_X obj = new sample_renshu_13_3_A();
		obj.a();


		//	②
		sample_renshu_13_3_Y y1 = new sample_renshu_13_3_A();
		sample_renshu_13_3_Y y2 = new sample_renshu_13_3_B();
		y1.a();y2.a();


		//	③
		sample_renshu_13_3_Y[] inss = new sample_renshu_13_3_Y[2];

		inss[0] = new sample_renshu_13_3_A();
		inss[1] = new sample_renshu_13_3_B();

		for(sample_renshu_13_3_Y ins: inss ){
			ins.b();
		}


	}

}

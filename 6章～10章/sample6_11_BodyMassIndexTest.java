package usystem;

public class sample6_11_BodyMassIndexTest {

	public static void main(String[] args) {
		sample6_11_BodyMassIndex[] bmi = new sample6_11_BodyMassIndex[5];

		bmi[0] = new sample6_11_BodyMassIndex("田中慎二", 168, 65);
		bmi[1] = new sample6_11_BodyMassIndex("田中大輔", 169, 63);
		bmi[2] = new sample6_11_BodyMassIndex("山田花子", 165, 45);
		bmi[3] = new sample6_11_BodyMassIndex("村田裕子", 169, 50);
		bmi[4] = new sample6_11_BodyMassIndex("早川紀子", 140, 46);

		for( int i = 0; i < bmi.length; i++ ){
			System.out.printf
			("%s  %d  %d  %.2f  %s\n",
					bmi[i].getName(),bmi[i].getHeight(),bmi[i].getWeight(),bmi[i].getBmi(),bmi[i].getMessage());
		}

	}

}

package usystem;

class sample4_11 {

	public static void main(String[] args) {

		int[][] yasai = {{ 100, 150, 200, 250, 300 },{ 200, 300, 140, 60, 350 }};
		int uriage = 0;

		for(int i = 0; i < yasai[0].length; i++ ){
			uriage += yasai[0][i] * yasai[1][i];
		}

		System.out.println("売り上げデータ　＝　" + uriage + "　円です。");

	}

}

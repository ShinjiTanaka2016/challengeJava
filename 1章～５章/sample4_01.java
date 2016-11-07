package usystem;

class sample4_01 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = numbers.length -i;
		}

		//	表示
		for(int j = 0; j < numbers.length; j++){
			System.out.println("numbers[" + j + "] ＝ " + numbers[j]);
		}

	}

}

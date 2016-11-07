package usystem;

class sample4_02 {

	public static void main(String[] args) {

		double[] numbers = new double[5];

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (i + 1) * 1.1;
		}

		for(int j = 0; j < numbers.length; j++){
			System.out.printf("numbers[%2d] = %2.1f\n", j,numbers[j]);
		}

	}

}

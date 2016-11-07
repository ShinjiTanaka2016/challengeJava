package usystem;

class sample4_sonyu_01 {

	public static void main(String[] args) {


		int[] apple = { 4, 2, 5, 1, 3};
		int box = 0;

		for(int i = 1; i < apple.length; i++){

			for(int j = i; j >= 1 && apple[j] < apple[j-1]; j--){
				box = apple[j];
				apple[j] = apple[j-1];
				apple[j-1] = box;
			}

		}

		//	【表示】
		for(int i = 0; i < apple.length; i++){
			System.out.print(apple[i] + "  ");
		}

	}

}

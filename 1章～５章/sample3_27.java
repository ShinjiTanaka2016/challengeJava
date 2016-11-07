package usystem;

class sample3_27 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++){

			for(int j = 0;j < 5-(i+1); j++){		//	スペース部分
				System.out.print(" ");
			}

			for(int k = 0;k < (i+1)*2-1; k++){		//	数字部分
				System.out.print(i + 1);
			}

			System.out.println();					//	改行

		}

	}

}

package usystem;

class sample4_bubble {

	public static void main(String[] args) {

		//	りんご５箱と空き箱を一個用意
		int[] apple = { 4, 2, 5, 1, 3 };
		int box = 0;

		System.out.print("【実行前】");
		for(int i = 0; i < apple.length; i++){
			System.out.print("apple[" + i + "]=" + apple[i] + "  ");
		}

		//	大きい数のりんご箱を探して端に移動させる
		for(int i= 0; i <apple.length - 1; i++){
			for(int j = 0; j < apple.length - (i + 1) ; j++){
				if(apple[j] > apple[j+1]){
					box = apple[j];
					apple[j] = apple[j+1];
					apple[j+1] = box;
				}
			}
		}

		System.out.println("");
		System.out.print("【実行後】");
		for(int i = 0; i < apple.length; i++){
			System.out.print("apple[" + i + "]=" + apple[i] + "  ");
		}


	}

}

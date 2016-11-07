package usystem;

class sample4_13 {

	public static void main(String[] args) {

		int[] kome;
		int kazu;
		int r;

		System.out.println("要素数を入力して下さい");
		kazu = new java.util.Scanner(System.in).nextInt();
		kome = new int[kazu];

		for(int i = 0; i < kazu; i++){
			r = new java.util.Random().nextInt(10);
			kome[i] = r;
		}

		for(int j = 0; j < 9; j++){
			for(int i = 0; i < kazu; i ++){
				if(kome[i] >= 9 - j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		//	区切り線
		for(int i = 0; i < kazu; i++ ){
			System.out.print("--");
		}
		System.out.println();
		for(int i = 0; i < kazu; i++ ){
			System.out.print(kome[i] + " ");
		}

	}

}

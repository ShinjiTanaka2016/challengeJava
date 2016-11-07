package usystem;

class sample4_05 {

	public static void main(String[] args) {

		int youso;
		int seach;
		int[] a;

		System.out.println("要素の数を入力してください。");
		youso = new java.util.Scanner(System.in).nextInt();
		a = new int[youso];


		//	要素のを入力
		for(int i = 0; i < a.length; i++ ){
			System.out.println("要素a[" + i + "]の値を入力してください。");
			a[i] = new java.util.Scanner(System.in).nextInt();
		}

		//	探したい要素を入力
		System.out.println("探す要素を入力して下さい。");
		seach = new java.util.Scanner(System.in).nextInt();


		//	探したい要素と各要素を照らし合わせて同じなら表示
		for(int onaji = 0; onaji < a.length; onaji++ ){
			if( seach == a[onaji]){
				System.out.println(seach + " は、a[" + onaji + "] にあります。");
				break;
			}
		}

	}

}

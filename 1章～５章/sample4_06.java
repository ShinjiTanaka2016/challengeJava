package usystem;

class sample4_06 {

	public static void main(String[] args) {

		int youso;
		int seach;


		//	要素の数を入力
		System.out.println("要素の数を入力してください。");
		youso = new java.util.Scanner(System.in).nextInt();
		int[] a = new int[youso];

		//	要素を要素数分入力
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "]：");
			a[i] = new java.util.Scanner(System.in).nextInt();
		}


		//	探したい要素を入力
		System.out.println("探したい要素を入力してください。");
		seach = new java.util.Scanner(System.in).nextInt();


		for(int i = 0; i < a.length; i++ ){
			if(seach == a[a.length -1 - i]){
				System.out.println(seach  + " は、a[" + (a.length-1-i) + "] にあります。");
				break;
			}
		}


	}

}

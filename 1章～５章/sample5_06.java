package usystem;

import java.util.Scanner;

class sample5_06 {


	public static void aryRmv(int[] a, int idx){

		int box = 0;
		for(int i = idx; i < a.length - 1; i++ ){
			a[i] = a[i + 1] ;
		}
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		System.out.print("要素数：");

		int num = stdln.nextInt();
		int[] a = new int[num];

		for(int i = 0; i < num; i++ ){
			System.out.print("a[" + i + "]：");
			a[i] = stdln.nextInt();
		}

		System.out.print("削除する要素のインデックス：");
		int idx = stdln.nextInt();
		aryRmv(a,idx);

		for(int i = 0; i < num; i++){
			System.out.println("a[" + i + "]=" + a[i]);
		}

	}

}

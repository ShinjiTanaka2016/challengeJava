package usystem;

import java.util.Scanner;


class sample5_07 {


	public static int[] arrayClone(int[] a){
		int[] clone = new int[a.length];

		for(int i = 0; i < a.length; i++ ){
			clone[i] = a[i];
		}

		return clone;
	}

	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		System.out.print("要素数：");

		int num = stdln.nextInt();
		int[] x = new int[num];

		for(int i = 0; i < num; i++){
			System.out.print("x[" + i + "]：");
			x[i] = stdln.nextInt();
		}

		int[] y = arrayClone(x);

		System.out.println("配列ｘの複製ｙを作りました");
		for(int i = 0; i < num; i++ ){
			System.out.println("y[" + i + "]=" + y[i]);
		}

	}

}

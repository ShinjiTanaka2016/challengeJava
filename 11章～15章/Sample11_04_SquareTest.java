package usystem;

import java.util.Scanner;

public class Sample11_04_SquareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("一辺の長さを入力して下さい：");
		int width = new Scanner(System.in).nextInt();

		sample11_04_Square sqe = new sample11_04_Square( width, width );


		System.out.printf( "一辺が%4d  の正方形の外周は%4d、面積は%4d です。\n"
							,sqe.getWidth(), sqe.getCircum(), sqe.getArea() );


	}

}

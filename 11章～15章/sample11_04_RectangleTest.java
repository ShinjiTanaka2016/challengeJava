package usystem;

import java.util.Scanner;

public class sample11_04_RectangleTest {

	public static void main(String[] args) {


		System.out.print("横の長さを入力して下さい：");
		int width = new Scanner(System.in).nextInt();
		System.out.print("縦の長さを入力して下さい：");
		int height = new Scanner(System.in).nextInt();

		sample11_04_Rectangle rtg = new sample11_04_Rectangle( width, height );


		System.out.printf( "横%4d 縦%4d の長方形の外周は%4d、面積は%4d です。\n"
							,rtg.getWidth(), rtg.getHeight(), rtg.getCircum(), rtg.getArea() );

	}

}

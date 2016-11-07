package usystem;

import java.util.Scanner;

public class sample12_01_ZenobiaTest {

public static void main(String[]args){

		Scanner scan = new Scanner(System.in);

		System.out.printf("購入金額を入力して下さい：");
		int myPrice = scan.nextInt();
		sample12_01_Zenobia[] zen = {new Bronz(),new Silver(),new Gold() };
		for(int i = 0; i < zen.length; i++){
			zen[i].calcPrice(myPrice);
		}

	}

}

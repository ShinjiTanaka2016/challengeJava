package usystem;

class sample3_26 {

	public static void main(String[] args) {

		int month = new java.util.Scanner(System.in).nextInt();

		switch(month){
		case 1:
		case 2:
			System.out.println("冬ですね");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春ですね");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏ですね");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋ですね");
			break;
		case 12:
			System.out.println("冬ですね");
			break;
		default:
			System.out.println("１～１２の数を入力してください。");
		}


	}

}

package usystem;

class sample3_33 {

	public static void main(String[] args) {

		int num = 0;

		for(int i = 0; i < 50; i++){
			num = i + 1;

			if( num % 15 == 0 ){
				System.out.print("FizzBuzz ");
			}else if( num % 5 == 0){
				System.out.print("Buzz ");
			}else if( num % 3 == 0 ){
				System.out.print("Fizz ");
			}else{
				System.out.print( num + " " );
			}
		}


	}

}

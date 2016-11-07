package usystem;

public class sample15_07 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 2; i++ ){
			try{
				System.out.println();
				System.out.println("try 外 = " + i);
				if(i==0){throw new Exception("例外１");}
				try{
					System.out.println("     try 内 = " + i);
					if(i==1){throw new Exception("例外２");}
				}catch(Exception inner){
					System.out.println("     catch 内 = " + i);
				}

				finally{
					System.out.println("     finally 内 = " + i);
				}
			}
			catch(Exception e){
				System.out.println("     catch 外 = " + i);
			}
			finally{
				System.out.println("     finally 外 = " + i);
			}
		}
	}
}

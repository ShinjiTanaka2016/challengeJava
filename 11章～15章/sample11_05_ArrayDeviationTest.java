package usystem;

public class sample11_05_ArrayDeviationTest {

	public static void main(String[] args) {

		int[] array = {66,73,40,83,95,18,49,52,26,58};

		sample11_05_ArrayDeviation ad = new sample11_05_ArrayDeviation(array);

		System.out.printf("要素数：%d\n要素の最大：%d\n要素の最小：%d\n要素の合計：%d\n要素の平均：%.2f\n",
							ad.getLength(),ad.getMax(),ad.getMin(),ad.getSum(),ad.getAverage());
		System.out.println(ad.getVaria());
		System.out.printf("標準偏差：%.7f\n",ad.getStdDev());


		System.out.println("要素        偏差値");
		for(int i = 0; i < ad.getLength() ; i++ ){
			System.out.printf("%3d          %4.2f\n",array[i],ad.getDevVal()[i]);
		}

	}

}

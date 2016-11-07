package usystem;

public class sample11_06 {


	public static void main(String[] args){

		int max = 0;
		int min = 500;
		int kousa = 0;
		String maxCity = "";
		String minCity = "";


		String[] city = {"東京　　　　　","ジャカルタ　　","ロンドン　　　","ウィーン　　　"
			    ,"ニューヨーク　","シドニー　　　","イスタンブール","サンパウロ　　"};
		int[][] rain ={
				{45,61,99,125,138,185,126,148,180,164,89,46},	//	東京
				{385,310,99,258,133,83,31,34,29,33,175,84},		//	ジャカルタ
				{77,51,60,54,55,57,45,55,68,73,76,80},			//	ロンドン
				{38,42,41,50,61,74,62,59,45,41,51,44},			//	ウィーン
				{77,73,92,96,97,91,104,95,86,76,97,86},			//	ニューヨーク
				{103,117,134,127,120,132,98,81,69,78,83,85},	//	シドニー
				{99,61,60,49,31,22,19,26,41,72,88,122},			//	イスタンブール
				{232,231,168,71,76,55,43,47,67,126,143,198}		//	サンパウロ
		};

		System.out.println
			("都市名　　　　　Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec 最大　最小　平均　標準偏差");

		for(int k = 0;k < rain.length; k++){
			sample11_05_ArrayDeviation ad = new sample11_05_ArrayDeviation(rain[k]);
				System.out.print(city[k] + "：");
				for(int j = 0; j < rain[0].length; j++){
					System.out.printf("%3d ",rain[k][j]);
				}
				System.out.printf("%3d  %3d  %7.2f  %7.2f\n",ad.getMax(),ad.getMin(),ad.getAverage(),ad.getStdDev());
				kousa = ad.getMax() - ad.getMin();
				if(kousa > max){
					max = kousa;
					maxCity = city[k];
				}else if(kousa < min){
					min = kousa;
					minCity = city[k];
				}

		}

		System.out.println
			("月ごとの降雨量の差が最大の都市は" + maxCity + "で、最小の都市は" + minCity +"です。");

	}

}

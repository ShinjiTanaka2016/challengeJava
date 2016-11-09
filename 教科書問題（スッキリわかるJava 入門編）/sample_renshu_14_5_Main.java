package sisanhoyu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_renshu_14_5_Main {

	public static void main(String[] args) {

		//	①
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		//	②
		c.setTime(now);
		//	③
		int day = c.get(Calendar.DAY_OF_MONTH);
		//	④
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		//	⑤
		Date future = c.getTime();
		//	⑥
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		String s = f.format(now);
		System.out.println(f.format(future));

	}

}

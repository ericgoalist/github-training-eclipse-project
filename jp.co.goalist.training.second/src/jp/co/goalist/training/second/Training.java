package jp.co.goalist.training.second;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Training {

	public static void main(String args[]){

//		Date today = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

//		System.out.println("今日は"+sdf.format(today)+"です");


		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

		Calendar tmr = Calendar.getInstance();
		tmr.setTime(today);
		tmr.add(Calendar.DAY_OF_MONTH,1);
		String tmrStr =sdf.format(tmr.getTime());



		System.out.println("明日は"+tmrStr+"です");

	}

}

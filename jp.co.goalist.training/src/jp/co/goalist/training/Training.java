package jp.co.goalist.training;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Training {

	public static void main(String args[]){

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

		System.out.println("今日は"+sdf.format(today)+"です");


	}

}

package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Utils {
    public static boolean stringNotEmpty(String res) {
        return null != res && !"".equals(res.trim());
    }

    public static boolean listNotNull(List a) {
        return null != a && !a.isEmpty();
    }
  
	public static boolean numNotNull(int num){
		return 0 != num;
	}
	public static boolean isNotUUID(String uuid) {
		boolean ret = true;
		try {
			UUID u = UUID.fromString(uuid);
			if (u != null) ret = false;
		} catch (Exception e) {}
		return ret;
	}
	//UUID
	public static String getUUID(){
		String str = UUID.randomUUID().toString();
		return str;
	}
	//当前日期时间
	public static Date getNow() throws ParseException {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNow = dateFormater.format(new Date());
		return dateFormater.parse(dateNow);
	}
	/**
	 * 将字符串转换成时间
	 * @param dateStr
	 * @return
	 * @throws ParseException
	 */
	public static Date toDate(String dateStr) throws ParseException{
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormater.parse(dateStr);
	}
}

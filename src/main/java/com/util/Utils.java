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
    /**
	 * 获取当前日期0:0:0
	 * @return
     * @throws ParseException  
	 */
	public static Date getToday() throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String td = f.format(new Date());
		return f.parse(td);
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
	public static String getUUID(){
		String str = UUID.randomUUID().toString();
		return str;
	}
}

package com.util;

import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

import org.bouncycastle.util.encoders.Base64Encoder;

/**
 * md5加密工具类
 * @author 窦仁钰
 *
 */
public class Md5 {

	public static String encoderByMd5(String str){
		try {
			char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			md5.update(str.getBytes("utf-8"));
			// 获得密文 
			byte[] md5Ecoder = md5.digest();
			
			// 把密文转换成十六进制的字符串形式  
            int j = md5Ecoder.length;  
            char str16[] = new char[j * 2];  
            int k = 0;  
            for (int i = 0; i < j; i++) {  
                byte byte0 = md5Ecoder[i];  
                str16[k++] = hexDigits[byte0 >>> 4 & 0xf];  
                str16[k++] = hexDigits[byte0 & 0xf];  
            }  
            return new String(str16);  
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return "00001";
	}
	
	
	
	  public static void main(String[] args) {  
	        String md5 = encoderByMd5("123456");  
	        System.out.println(md5);
	    }  
}

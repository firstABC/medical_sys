package com.util;

import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Base64Test {
public static void main(String[] args) {
	try {
		Scanner input = new Scanner(System.in);
//		String encryptMsg = DatatypeConverter.printBase64Binary("a123456".getBytes());
//		System.out.print("���������ģ�");
//		String msg = input.next();
//		msg.replaceAll("\n", "");
//		String msg = "MDIyM3siYXBwSWQiOiJ0aXMiLCJ1c2VySWQiOiI2NjAwNDYiLCJwYXNzd29yZCI6ImExMjM0NTYrIiwicmVxdWVzdElkIjoiMjAxODAzMDg4ODU1NjY3MDAwMDk2IiwicmVxdWVzdE5hbWUiOiLmjInlrqLmiLflj7fmn6Xor6LlrZjmrL7otKbmiLfkv6Hmga8iLCJyZXF1ZXN0UmVhc29uIjoi5p+c6Z2i5o6I5p2D77ya5Lqk5piT572R54K56Z2e5a6i5pyN5Lit5b+DKjEwMDsiLCJhdXRoVHlwZSI6Ik1fUEFTU1dPUkQiLCJhdXRoRmxhZyI6IjIifQ==";
		String msg=
//			"eyJtZXNzYWdlIjoi5oyH57q55qCh6aqM5aSx6LSlIiwic3RhdHVzIjoiZXJyb3IiLCJ1c2VySWQiOiI2NjAwMzMiLCJjb2RlIjoxfQ=="
			"MDI4M3siYXBwSWQiOiJ0aXMiLCJ1c2VySWQiOiI2NjAwMDEiLCJwYXNzd29yZCI6ImExMjM0NTYtIiwicmVxdWVzdElkIjoiMjAxODAzMjk4ODU1NjY3MDAwMjgwIiwicmVxdWVzdE5hbWUiOiLlrZjmrL7ku4votKjlr4bnoIHph43nva4iLCJyZXF1ZXN0UmVhc29uIjoiXCLmn5zpnaLmjojmnYPvvJrlvLrliLbmjojmnYMqMTAwXCIsXCLmoLjlv4PmjojmnYPvvJpBQy1DRC5QQVNTV09SRC5SRVNFVC5BVVRIfU8tMTAwMjgt5Y2h54mH5a+G56CB6YeN572u6ZyA5Li7566h5o6I5p2DKjEwMFwiIiwiYXV0aFR5cGUiOiJNX1BBU1NXT1JEIiwiYXV0aEZsYWciOiIyIn0="
			;
		String decrypt = new String(DatatypeConverter.parseBase64Binary(msg),"UTF-8");
//		System.out.println(encryptMsg);
		System.out.println(decrypt);
		
//		System.out.println(new DecimalFormat("0000").format(2));
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}

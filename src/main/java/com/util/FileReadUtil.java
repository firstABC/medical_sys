package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Role;
/**
 * 文件解析
 * @author 窦仁钰
 *
 */
public class FileReadUtil {

	public  List roleList = new ArrayList<Role>();
	
	public  List fileToRole(String path){
		try {
			File file = new File(path);
			InputStreamReader inSReader = new InputStreamReader(new FileInputStream(file),"utf-8");
			BufferedReader reader = new BufferedReader(inSReader);
			String lineStr =null;
			while( (lineStr = reader.readLine())!=null){
				String[] str = lineStr.split("=");
				String roleName = str[0];
				String roleId = str[1];
				Role role = new Role(roleId,roleName);
				roleList.add(role);
			}
			reader.close();
			inSReader.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return roleList;
	}
}

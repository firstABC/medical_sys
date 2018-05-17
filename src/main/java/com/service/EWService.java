package com.service;

import java.util.List;
import com.entity.Earlywarning;

public interface EWService {
	
	public int updateEW(Earlywarning warning) throws Exception;
	
	public Earlywarning getEW() throws Exception;
	
}

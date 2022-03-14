package br.com.emailproject.util;

import org.apache.log4j.Logger;

public class LogUtil {
	
	// quero essa classe privada
	
	private LogUtil() {}
		
	public static Logger getLogger(Object object) {			
		return Logger.getLogger(object.getClass());
			
		
		
	}

}


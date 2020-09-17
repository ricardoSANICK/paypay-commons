package com.paypay.baymax.commons.util;

import javax.servlet.http.HttpServletRequest;

public class RemoteHostInfo {

	public RemoteHostInfo(){}
	
	public static String getRemoteAddr(HttpServletRequest request){
		String ipAddress = request.getHeader("X-FORWARDED-FOR");  
		   if (ipAddress == null) {  
			   ipAddress = request.getRemoteAddr();  
		   }
		   return ipAddress;
	}
	
}

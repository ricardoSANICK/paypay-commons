package com.paypay.baymax.utils;

import org.jsoup.Jsoup;

public class UtileriasCommon {
	
	public static String html2text(String html) {
	    return Jsoup.parse(html).text();
	}
	
}

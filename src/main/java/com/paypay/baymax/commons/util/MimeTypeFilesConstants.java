package com.paypay.baymax.commons.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class MimeTypeFilesConstants 
{
   // Attributes ///////////////////////////////////////////////////////////////
   
   /**
    * Hash map that will be stored types in
    */
   protected static Map<String, String> s_mapMimeTypes = null;
   
   /**
    * Hash map that will be stored extensions in
    */
   protected static Map<String, String> s_mapExtensions = null;
   
   // Constructors /////////////////////////////////////////////////////////////
   
   /**
    * Static initializer;
    */
   static 
   {
      s_mapMimeTypes = new HashMap<String, String>(161);
      
      //MimeTypes Map  
      
      s_mapMimeTypes.put("txt" , "text/plain");
      s_mapMimeTypes.put("xml" , "application/xml");
      s_mapMimeTypes.put("pdf" , "application/pdf");
      s_mapMimeTypes.put("doc" , "application/msword");
      s_mapMimeTypes.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
      s_mapMimeTypes.put("xls" , "application/vnd.ms-excel");
      s_mapMimeTypes.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
      s_mapMimeTypes.put("csv" , "text/csv");
      s_mapMimeTypes.put("ppt" , "application/vnd.ms-powerpoint");
      s_mapMimeTypes.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
      s_mapMimeTypes.put("potx", "application/vnd.openxmlformats-officedocument.presentationml.template");
      s_mapMimeTypes.put("ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow");
      s_mapMimeTypes.put("ok"  , "application/octet-stream");
      s_mapMimeTypes.put("devok", "application/octet-stream");
      s_mapMimeTypes.put("deverr", "application/octet-stream");
      s_mapMimeTypes.put("err", "application/octet-stream");
      s_mapMimeTypes.put("subsidio"  , "application/octet-stream");
      
      s_mapExtensions = new HashMap<String,String>(s_mapMimeTypes.size());

      for(Entry<String, String> o : s_mapMimeTypes.entrySet()) 
      {
    	  s_mapExtensions.put(o.getValue(), o.getKey());
      }
   }
   
   // Constructors /////////////////////////////////////////////////////////////
   
   /** 
    * Private constructor since this class cannot be instantiated
    */
   private MimeTypeFilesConstants(
   )
   {
      // Do nothing
   }
   
   // Public methods ///////////////////////////////////////////////////////////
   
   /**
    * Method getting particular Mime type for the extension (key)
    * 
    * @param strKey - key value for returning Mime type
    * @return String
    */
   public static String getMimeType(
      String strKey
   )
   {
      String strMimeType = null;

      // get value for particular key
      strMimeType = s_mapMimeTypes.get(strKey).toString();
      
      return strMimeType;
   }
   
   /**
    * Method getting particular Extension for the Mime type (key)
    * 
    * @param strKey - key value for returning Extension
    * @return String
    */
   public static String getExtension(
      String strKey
   )
   {
      String strExtension = null;

      // get value for particular key
      strExtension = s_mapExtensions.get(strKey).toString();
      
      return strExtension;
   }
   
   /**
    * 
    * @param fileExtension
    * @return
    */
   public static String getMediaTypeByExtension(String fileExtension) {
	   
	   fileExtension = fileExtension.replaceAll(".", "");
	   fileExtension = fileExtension.replaceAll("\\.", "");
	   
	   return s_mapMimeTypes.get(fileExtension);
	  
   }
}

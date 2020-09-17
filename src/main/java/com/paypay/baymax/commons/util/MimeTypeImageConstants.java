package com.paypay.baymax.commons.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.MediaType;

public final class MimeTypeImageConstants 
{
   // Attributes ///////////////////////////////////////////////////////////////
   
   /**
    * Default Mime type
    */
   protected static String s_strDefaultMimeType = "image/jpeg";
   
   /**
    * Default Extension
    */
   protected static String s_strDefaultExtension = "jpg";

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
      
      s_mapMimeTypes.put("gif", "image/gif");
      s_mapMimeTypes.put("jpg", "image/jpeg");
      s_mapMimeTypes.put("png", "image/png");
      s_mapMimeTypes.put("svg", "image/svg+xml");
      s_mapMimeTypes.put("tiff", "image/tiff");
      
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
   private MimeTypeImageConstants(
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
      if ((strMimeType == null) || (strMimeType.trim().length() == 0))
      {
         strMimeType = s_strDefaultMimeType;
      }
      
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
      if ((strExtension == null) || (strExtension.trim().length() == 0))
      {
         strExtension = s_strDefaultExtension;
      }
      
      return strExtension;
   }
   
   /**
    * 
    * @param imageextension
    * @return
    */
   public static String getMediaTypeByExtension(String imageextension) {
	   
	   switch(imageextension.toLowerCase())
	    {
	   		default:
	   			return MediaType.IMAGE_JPEG_VALUE;
	   		case ".jpg":
		    case ".jpeg":
		    case "jpg":
		    case "jpeg":
		    	return MediaType.IMAGE_JPEG_VALUE;
		    case "png":
		    case ".png":
		    	return MediaType.IMAGE_PNG_VALUE;
		    case "gif":
		    case ".gif":
		    	return MediaType.IMAGE_GIF_VALUE;
		}
   }
}

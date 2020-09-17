package com.paypay.baymax.commons.util;

import org.apache.commons.lang.StringUtils;

public class CommonUtils {

    /**
     *
     * @param lastName
     * @param firstName
     * @return
     */
    public static String getFullName(String lastName, String firstName){
        if(StringUtils.isBlank(lastName))
            return StringUtils.isNotBlank(firstName) ? firstName : "";

        if(StringUtils.isBlank(firstName))
            return lastName.trim();

        return lastName.trim() + ", " + firstName.trim();
    }


}

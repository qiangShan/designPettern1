package com.mashibing.framework.utils;

public class SpringUtils {

    private SpringUtils(){

    }

    public static String getSetterMethod(String fieldName){
        //fieldName=courseDaoImpl
        String methodName="set"+fieldName.substring(0,1).toUpperCase()
                +fieldName.substring(1);

        return methodName;
    }
}

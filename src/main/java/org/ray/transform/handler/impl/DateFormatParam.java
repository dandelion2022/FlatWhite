package org.ray.transform.handler.impl;

import org.ray.transform.handler.DataHandleParam;

/**
 * Created by Administrator on 2017/6/11.
 */
public class DateFormatParam implements DataHandleParam {

    private String preDateFormat;

     private String postDateFormat;


    public DateFormatParam(String preDateFormat,String postDateFormat){
        this.postDateFormat=postDateFormat;
        this.preDateFormat=preDateFormat;
    }

    public String getPreDateFormat() {
        return preDateFormat;
    }

    public String getPostDateFormat() {
        return postDateFormat;
    }
}

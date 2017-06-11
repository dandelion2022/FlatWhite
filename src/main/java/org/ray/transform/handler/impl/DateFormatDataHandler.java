package org.ray.transform.handler.impl;

import org.ray.transform.handler.DataHandleParam;
import org.ray.transform.handler.DataHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 时间转换处理器
 * Created by Administrator on 2017/6/11.
 */
public class DateFormatDataHandler implements DataHandler {

    public   String transform(String content,DataHandleParam dataHandleParam){
        DateFormatParam dateFormatParam =(DateFormatParam)dataHandleParam;

        SimpleDateFormat preFormat  =new SimpleDateFormat(dateFormatParam.getPreDateFormat());
        SimpleDateFormat postFormat = new SimpleDateFormat(dateFormatParam.getPostDateFormat());

        try{
            return postFormat.format(preFormat.parse(content));
        }catch (ParseException e){
            throw new RuntimeException("transform has error,content="+content,e);
        }
    }

}

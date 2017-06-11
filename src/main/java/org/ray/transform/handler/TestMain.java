package org.ray.transform.handler;

import org.ray.transform.handler.impl.DateFormatParam;

/**
 * Created by Administrator on 2017/6/11.
 */
public class TestMain {

    public static void main(String[]  args){
        DataHandlerExecutor executor = new DataHandlerExecutorImpl();
        DateFormatParam param = new DateFormatParam("yyyyMMdd","yyyy-MM-dd");
        String result= executor.transform("20170102").withRule(DataHandlerType.DATA_FORMAT,param).getResult();
        System.out.println(result);
    }
}

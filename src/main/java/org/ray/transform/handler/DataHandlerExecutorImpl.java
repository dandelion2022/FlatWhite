package org.ray.transform.handler;

import org.ray.transform.handler.DataHandleParam;
import org.ray.transform.handler.DataHandler;
import org.ray.transform.handler.DataHandlerExecutor;

/**
 * Created by Administrator on 2017/6/11.
 */
public class DataHandlerExecutorImpl  implements DataHandlerExecutor {

    private String content;

    @Override
    public DataHandlerExecutor withRule(DataHandler dataHandler, DataHandleParam dataHandleParam){
        content =dataHandler.transform(content,dataHandleParam);
        return  this;
    }
    @Override
    public DataHandlerExecutor withRule(DataHandler dataHandler){
         content = dataHandler.transform(content,null);
        return this;
    }
    @Override
    public DataHandlerExecutor transform(String content){
        this.content=content;
        return this;
    }
    @Override
    public String getResult(){
        return  content;
    }

}

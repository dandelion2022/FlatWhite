package org.ray.transform.handler;

/**
 * 数据转换器
 * Created by Administrator on 2017/6/11.
 */
public interface DataHandlerExecutor {

    DataHandlerExecutor transform(String content);

    DataHandlerExecutor withRule(DataHandler dataHandler,DataHandleParam   dataHandleParam);

    DataHandlerExecutor withRule(DataHandler dataHandler);

    String getResult();


}

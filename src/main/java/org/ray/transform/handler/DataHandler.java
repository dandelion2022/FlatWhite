package org.ray.transform.handler;

/**
 * Created by Administrator on 2017/6/11.
 */
public interface DataHandler {

    /**
     * 转换数据
     * @param content  转换数据的内容
     * @param dataHandleParam   规则参数
     * @return  转换后的内容
     */
    String transform(String content,DataHandleParam dataHandleParam);
}

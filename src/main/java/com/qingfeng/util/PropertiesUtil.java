package com.qingfeng.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 图片的url 实现
 * @author 清风
 * @date 2020/2/18 14:48
 */
public class PropertiesUtil {
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private static Properties props;

    //util的实现，在tomcat启动的时候读取到这个配置，
    // 使用一个静态快解决这个问题，支付宝对接也会用到静态块
    //静态代码快优于普通代码块，普通又优于构造代码快
    //静态代码块只执行一次
    //static只会在类被加载的时候，被执行，只运行一次
    //一般都用它做初始化静态变量
    static {
        String fileName = "mmall.properties";
        props = new Properties();
        try {
            props.load(new InputStreamReader(PropertiesUtil.class.
                    getClassLoader().getResourceAsStream(fileName),"UTF-8"));
        } catch (IOException e) {
            logger.error("配置文件读取异常",e);
        }
    }

    //通过mmall.propertie里面的key来获取value
    //普通代码快
    public static String getProperty(String key){
        String value = props.getProperty(key.trim());
        //避免写mmall.propertie配置时候，空格太多
        if(StringUtils.isBlank(value)){
            return null;
        }
        return value.trim();
    }

    //构造代码块，构造对象的时候每次都执行，
    public static String getProperty(String key,String defaultValue){

        String value = props.getProperty(key.trim());
        if(StringUtils.isBlank(value)){
            value = defaultValue;
        }
        return value.trim();
    }
}

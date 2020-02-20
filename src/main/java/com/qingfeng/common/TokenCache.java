package com.qingfeng.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author 清风
 * @date 2020/2/18 15:06
 */
public class TokenCache {

    //申明日志
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);


    public static final String TOKEN_PREFIX = "token_";

    //LRU算法
    //声明一个静态的内存快，设置缓存的初始化容量1000，它的最大容量大于1000后
    //会使用LRU算法移除缓存项，最大值设置10000
    //在设置有效期，12个小时
    private static LoadingCache<String,String> localCache = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000).expireAfterAccess(12, TimeUnit.HOURS)
            //默认数据加载实现，当调用get取值时候，如果key没有对应的值，就会调用这个方法进行加载
            .build(new CacheLoader<String, String>() {
                //默认的数据加载实现,当调用get取值的时候,如果key没有对应的值,就调用这个方法进行加载.
                @Override
                public String load(String s) throws Exception {
                    return "null";
                }
            });

    public static void setKey(String key,String value){
        localCache.put(key,value);
    }

    public static String getKey(String key){
        String value = null;
        try {
            value = localCache.get(key);
            if("null".equals(value)){
                return null;
            }
            return value;
        }catch (Exception e){
            logger.error("localCache get error",e);
        }
        return null;
    }
}

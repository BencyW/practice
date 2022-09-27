package com.whx.cache;

import com.whx.util.ApplicationContextUtil;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.DigestUtils;


/**
 * @Author whx
 * @Date 2022/9/21 11:07 上午
 * @Version 1.0
 */
public class RedisCache implements Cache {
    private final String id;


    public RedisCache(String id){
        //id其实就是接口的全类名
        System.out.println(id + "******************");
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    //向缓存中放值
    @Override
    public void putObject(Object key, Object value) {
        System.out.println("key-put:" + key.toString());
        System.out.println("value:" + value);

        //使用redis的hash类型来做存储模型
        getRedisTemplate().opsForHash().put(id,getKeyToMD5(key.toString()),value);


    }

    //向缓存中取值
    @Override
    public Object getObject(Object key) {
        System.out.println("key-get:" + key.toString());

         //使用redis的hash类型来做存储模型
        return getRedisTemplate().opsForHash().get(id,getKeyToMD5(key.toString()));

    }

    @Override
    public Object removeObject(Object o) {
        System.out.println("根据指定的key删除缓存");
        return null;
    }

    //当执行增删改操作时，会默认执行clear方法
    @Override
    public void clear() {
        System.out.println("清楚缓存");

        getRedisTemplate().delete(id);


    }

    //就算缓存的数量
    @Override
    public int getSize() {

        return getRedisTemplate().opsForHash().size(id).intValue();
    }
    private RedisTemplate getRedisTemplate(){
        //通过ApplicationContext工具类获取RedisTemplate
        RedisTemplate redisTemplate =(RedisTemplate) ApplicationContextUtil.getBean("redisTemplate");
        //序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        redisTemplate.setHashKeySerializer(new StringRedisSerializer());

        return redisTemplate;

    }
    private String getKeyToMD5(String key){
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

}

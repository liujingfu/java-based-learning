package org.ljf.aopdemo.redis;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author ljf 2019/10/08 9:55
 */
public class JedisTest {
    public static void main(String[] args) {
    Jedis jedis=new Jedis("127.0.0.1",6379);
    jedis.set("name","ljf");
        System.out.println(jedis.get("name"));
        jedis.setnx("aa","aa");
        Map<String,String> map=new HashMap<>();
        map.put("ljf","24");
        jedis.hset("map1",map);
    }

}

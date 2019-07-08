package com.chong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Configuration
public class JedisConfig {
    private static JedisPool jedisPool;

    @Bean
    public Jedis getBuild() {
        jedisPool = new JedisPool("localhost", 6379);
        Jedis jedis = jedisPool.getResource();
        return jedis;
    }
}

package com.example.crud_redis_nguyenvanhung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class CrudRedisNguyenVanHungApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudRedisNguyenVanHungApplication.class, args);
    }

    @Bean
    LettuceConnectionFactory jedisConectionFactory(){
        return new LettuceConnectionFactory();
    }


    @Bean
    RedisTemplate redisTemplate(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConectionFactory());
        return redisTemplate;
    }
}

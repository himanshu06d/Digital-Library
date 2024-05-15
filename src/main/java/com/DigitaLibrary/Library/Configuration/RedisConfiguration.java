package com.DigitaLibrary.Library.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {
    /**
     * Caching -> Redis
     *
     * 1. dependency
     * 2. Driver -> Redis
     *   a.Lettuce
     *   b. Jedis
     *
     * 3. Create a connection bean
     * 4. Create a template to access the data.
     *
     *
     *
     * */

    @Bean
    public LettuceConnectionFactory getLettuceConnectionFactory(){

        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("redis-13314.c321.us-east-1-2.ec2.redns.redis-cloud.com" , 13314);
        /** Redis support 2 types of database
         *   1. Cluster -> Multiple instances together are acting as a single data for me
         *   2. StandAlone -> One instance which is supporting all the data.
        **/
        redisStandaloneConfiguration.setPassword("c4jKSoWhYPybryisAWTNxDyKIcPtXJgp");
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
        // we need this to set up connection, how your spring should communicate with application


        return lettuceConnectionFactory;
    }

    @Bean
    public RedisTemplate<String,Object> getRedisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        // we need template for getting and manipulating all the operations over the data
        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
        return redisTemplate;
    }


    /** public class XmlSerializer implements RedisSerializer<T> {
     override the methods of RedisSerializer to implement your own logic and pass this implmentation to redistemplate
    }
**/

}

package com.example;
import redis.clients.jedis.Jedis;


public class jedis {
    public static void main(String[] args) {

		Jedis jedis = new Jedis("[ip]",6379);
		jedis.set("jedis", "jedis redis java client!");
		String value = jedis.get("jedis");
		
	}
    
}

package com.example;
import redis.clients.jedis.Jedis;


public class jedis {
    public static void main(String[] args) {

		Jedis jedis = new Jedis("192.168.179.12",6379);
		jedis.set("jedis", "jedis redis java client!");
		String value = jedis.get("jedis");
		
	}
    
}

package com.example;

import org.redisson.Redisson;
import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class redisson {

	public static void main(String[] args) {
		Config config = new Config();
		config.useSingleServer().setAddress("redis://192.168.179.12:6379");

		RedissonClient redisson = Redisson.create(config);
		
		RSet<String> set = redisson.getSet("redisson");
		set.add("Hello, JavaClient redisson Redis");

//  for (String s : set.readAll()) {
//             System.out.println(s);
//         }
        
         		redisson.shutdown();
		
 	}

}

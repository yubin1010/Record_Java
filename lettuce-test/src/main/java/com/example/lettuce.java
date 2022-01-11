package com.example;

import io.lettuce.core.*;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

public class lettuce {
	public static void main(String[] args) {
		RedisClient redisClient = RedisClient.create("redis://192.168.179.12:8000/0");
		StatefulRedisConnection<String, String> connection = redisClient.connect();
		RedisCommands<String, String> syncCommands = connection.sync();

		syncCommands.set("lettuce", "Hello, JavaClient Lettuce Redis!");

		connection.close();
		redisClient.shutdown();
	}

}

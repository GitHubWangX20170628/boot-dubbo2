package com.weein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务消费者启动类
 * 
 * @author jiangzixu
 *
 */
@SpringBootApplication
public class ConsumerApplication  {


	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}

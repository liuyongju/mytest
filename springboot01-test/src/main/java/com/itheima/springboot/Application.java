package com.itheima.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 代表为SpringBoot应用的运行主类
public class Application {
	
	public static void main(String[] args) {
		
		
		//SpringApplication.run(Application.class,args);
		
		/** 运行SpringBoot应用 */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 设置横幅模式(设置关闭) */
		springApplication.setBannerMode(Banner.Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}

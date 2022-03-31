package edu.multi.boot1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//현재파일 웹설정포함파일//<resource .... 
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/upload/**")
		.addResourceLocations("file:///c:/upload/");
		registry
		.addResourceHandler("/naverimages/**")
		.addResourceLocations("file:///C:/Users/student/Desktop/ai_images/");
		
	}
	
//1024byte -> 1kb 
//	1024kb -> 1mb
}

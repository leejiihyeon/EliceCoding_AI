package edu.multi.boot;

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
		.addResourceLocations("file:///C:\\Users\\ASUS\\OneDrive\\바탕 화면\\STUDY\\ai_images\\ai_images");
		
		
	}
	
//http://localhost;8080/upload/파일목록
//	http://localhost;8080/naverimages
}

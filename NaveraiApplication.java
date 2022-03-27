package edu.multi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cfr.FaceController;

@SpringBootApplication
//현재패키지 다른 설정 기본 인식
@ComponentScan //현재패키지 다른 설정 인식
@ComponentScan(basePackageClasses = FaceController.class)

public class NaveraiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaveraiApplication.class, args);
	}

}

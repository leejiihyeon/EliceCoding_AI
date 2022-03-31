package edu.multi.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cfr.FaceController;
import chatbot.ChatbotController;
import objectdetection.ObjectDetectionService;
import ocr.OCRController;
import pose.PoseController;
import stt_csr.CSRController;
import tts_voice.TTSController;

@SpringBootApplication
//현재패키지 다른 설정 기본 인식
@ComponentScan //현재패키지 다른 설정 인식
@ComponentScan(basePackageClasses = FaceController.class)
@ComponentScan(basePackageClasses = ObjectDetectionService.class)
@ComponentScan(basePackageClasses = PoseController.class)
@ComponentScan(basePackageClasses = CSRController.class)
@ComponentScan(basePackageClasses = TTSController.class)
@ComponentScan(basePackageClasses = OCRController.class)
@ComponentScan(basePackageClasses = ChatbotController.class)
public class NaveraiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaveraiApplication.class, args);
	}

}



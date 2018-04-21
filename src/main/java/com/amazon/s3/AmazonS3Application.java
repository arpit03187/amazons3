package com.amazon.s3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.amazon.s3.service.S3Service;

@SpringBootApplication
public class AmazonS3Application {
	
	@Autowired
	S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(AmazonS3Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner(){
		return args -> {
			System.out.println("---------------- START UPLOAD FILE ----------------");
			// s3Service.uploadFile("jsa-s3-upload-file.txt", uploadFilePath);
			System.out.println("---------------- START DOWNLOAD FILE ----------------");
			s3Service.downloadFile("PDFReceipt.pdf");
		};
	}

}

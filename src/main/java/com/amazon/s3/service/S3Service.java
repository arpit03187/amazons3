package com.amazon.s3.service;

public interface S3Service {
	
	public void downloadFile(String keyName);
	
	public void uploadFile(String keyName, String uploadFilePath);

}

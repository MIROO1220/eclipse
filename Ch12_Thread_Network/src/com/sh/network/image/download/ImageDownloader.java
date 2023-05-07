package com.sh.network.image.download;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImageDownloader {

	public static void main(String[] args) {
		ImageDownloader idl = new ImageDownloader();
		idl.test1();
	}

	private void test1() {
		try {
			URL url = new URL("https://upaae.com/wp-content/uploads/2016/07/osi-layers.png");
			URLConnection conn = url.openConnection();
			
			try(
				BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("사진다운로드.png"));
			){
				int len = 0;
				byte[] bytes = new byte[8192];
				while((len=bis.read(bytes)) > -1) {
					bos.write(bytes, 0, len);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

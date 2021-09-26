package com.sapiensschool.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicioChrome {
	
	public static void main (String[] args) throws InterruptedException {
		// This is my first line of code automation
		System.setProperty("webdriver.chrome.driver", "C:\\driver-chrome\\chromedriver.exe");
		//Here we will create and launch our browser  INSTANCIA ABAJO
		WebDriver customDriver = new ChromeDriver(); 
		customDriver.get("https://www.google.com/");
		customDriver.findElement(By.xpath ("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Casos de prueba");
		Thread.sleep(3000);
		customDriver.findElement(By.xpath ("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		//customDriver.close();
	}

}

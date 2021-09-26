package com.sapiensschool.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotificarions {

	public static void main(String[] args) {
		ChromeOptions notifications = new ChromeOptions();
		notifications.addArguments("--disable-notifications");
		
		//In this code we will disable notifications 
		System.setProperty("webdriver.chrome.driver", "C:\\driver-chrome\\chromedriver.exe");
		//Here we will create and launch our browser  INSTANCIA ABAJO
		WebDriver customDriver = new ChromeDriver(notifications); 
		customDriver.get("https://www.reddit.com/");
		customDriver.findElement(By.id("header-search-bar")).sendKeys("TestingConcepts");
		

	}

}

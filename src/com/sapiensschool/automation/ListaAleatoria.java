package com.sapiensschool.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListaAleatoria {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\driver-chrome\\chromedriver.exe");
		//Here we will create and launch our browser  INSTANCIA ABAJO
		WebDriver customDriver = new ChromeDriver(); 
		customDriver.get("https://www.amazon.com/");
		customDriver.findElement(By.id("nav-search-bar-fprm")).sendKeys("Laptop");
		//WebElement textField = chromeDriver.findElement (By.id ("twotabsearchtextbox")); textField.sendKeys ("Computadora portátil");

	}

}

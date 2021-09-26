package com.sapiensschool.automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ManejadorNavegador {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver-chrome\\chromedriver.exe");
		//Here we will create and launch our browser  INSTANCIA ABAJO
		WebDriver customDriver = new ChromeDriver(); 
		customDriver.get("https://www.google.com/");
		customDriver.manage().window().maximize(); 
		customDriver.navigate().to("https://winstoncastillo.com/robot-selenium");
		System.out.println("Esto se escribe en la consola");
		System.out.println(customDriver.getCurrentUrl());
		System.out.println(customDriver.getTitle());
		
		//Codigo para crear acciones del navegador 
		Actions mousAction = new Actions(customDriver);
		WebElement menuOption = customDriver.findElement(By.xpath("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(2) > a > font > font"));
		mousAction.moveToElement(menuOption).perform();
		Thread.sleep(3000);
		
		//Este comando presiona la flecha reverso 
		customDriver.navigate().back();
		//Este comando presiona la flecha delante 
		customDriver.navigate().forward();
		//Este comando refresca la página 
		customDriver.navigate().refresh();
		//Este comando se usa para cerrar la pestaña
		//customDriver.close();
		
		//Abrir una nueva pestaña
		String firstTab = customDriver.getWindowHandle();
		//System.out.println(firstTab);
		Integer sizeOfTabs = customDriver.getWindowHandles().size();
		//System.out.println(sizeOfTabs);
		JavascriptExecutor codeToOpenTab = (JavascriptExecutor)customDriver;
		codeToOpenTab.executeScript("window.open();");
		sizeOfTabs = customDriver.getWindowHandles().size();
		//System.out.println(sizeOfTabs);
		//customDriver.close();
		ArrayList<String> tabNames = new ArrayList<String>(customDriver.getWindowHandles());
		customDriver.switchTo().window(tabNames.get(1));
		customDriver.get("https://www.google.com/");
		codeToOpenTab.executeScript("Window.open();");
		tabNames = new ArrayList<String>(customDriver.getWindowHandles());
		customDriver.switchTo().window(tabNames.get(2));
		//stomDriver.get("https://www.amazon.com/");
		customDriver.get("http://winstoncastillo.com/ejercicios/atoc.html");
		customDriver.findElement(By.cssSelector("#testCasesAtoC > p:nth-child(2) > button")).click();
		Thread.sleep(3000);
		String message = customDriver.switchTo().alert().getText();
		System.out.println("Este es el mensaje de la ventana: " + message);
		customDriver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		customDriver.switchTo().alert().accept();
		Thread.sleep(3000);
		customDriver.close();
		customDriver.switchTo().window(tabNames.get(1));
		customDriver.close();
		customDriver.switchTo().window(tabNames.get(0));
		Thread.sleep(1000);
		customDriver.close();
	}

}

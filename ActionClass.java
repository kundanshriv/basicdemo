package com.basicsdemo.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Action class is used to handle mouse and keyboard action--i.e mouse hovering,right click,different keyboard actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Achint\\Desktop\\Swagen\\BasicsDemo\\drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://amazon.com");
			
			Actions act=new Actions(driver);
		WebElement wb=driver.findElement(By.id("twotabsearchtextbox"));	
		act.sendKeys(wb, Keys.SHIFT).sendKeys(wb, "iphone").build().perform();
		
		
		
		
	}

}

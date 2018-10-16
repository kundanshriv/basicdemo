package com.basicsdemo.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Achint\\Desktop\\Swagen\\BasicsDemo\\drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("kundan_shriv");
		driver.findElement(By.name("password")).sendKeys("kundan@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
					
		driver.switchTo().frame(1);
		Actions act=new Actions(driver);
		WebElement contactElement=driver.findElement(By.xpath("//*[text()='Contacts']"));
		act.moveToElement(contactElement).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='New Contact']")).click();
		
		driver.switchTo().defaultContent();
		
		

	
	}

}

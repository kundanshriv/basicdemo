package com.basicsdemo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumDemo {
	
	// key for chrome--- webdriver.chrome.driver,value===path of chromedriver.exe
	// key for mozilla---wedriver.gecko.driver, value==path of geckodriver.exe
	// key for IE---wedriver.IE.driver, value==path of IEdriver.exe

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achint\\Desktop\\Selenium\\browserDrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//WebDriver driver=new InternetExplorerDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("http:\\flipkart.com");
		
		
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("gotten")).click();
		
		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1eFTEo']")).click();
		
		/*List<WebElement> list=driver.findElements(By.tagName("input"));
		
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i)).equals(driver.findElement(By.id("email"))))
			{
				list.get(i).sendKeys("abc");
			}
		} */
		

	}

}

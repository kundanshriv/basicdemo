package com.basicsdemo.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Achint\\Desktop\\Swagen\\BasicsDemo\\drivers\\chromedriver.exe");
		
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://spicejet.com");
		
		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		//if(driver.findElement(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td/input")).isSelected())
		//WebElement dd=driver.findElement(By.name("country"));
		//Select sl=new Select(dd);
		
		//sl.selectByIndex(1);
		
		driver.findElement(By.className("select_CTXT")).click();
		driver.findElement(By.xpath("//div[@class='dropdownDiv']/ul/li[6]")).click();
		driver.findElement(By.xpath("(//div[@class='dropdownDiv']/ul[3]/li[5])[2]")).click();
			
	}

}

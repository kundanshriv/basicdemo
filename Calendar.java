package com.basicsdemo.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Achint\\Desktop\\Swagen\\BasicsDemo\\drivers\\chromedriver.exe");
		
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			String date="27 Oct 2018";
			
			driver.get("https://www.path2usa.com/travel-companions");
			driver.findElement(By.name("travel_date")).click();
			
			while(!driver.findElement(By.className("datepicker-switch")).getText().contains("February"))
			{
				
				driver.findElement(By.className("next")).click();
			}
			
			List<WebElement> list=driver.findElements(By.className("day"));
					
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getText().equals("20"))
					{
						list.get(i).click();
						break;
					}
				}
					

	}

}

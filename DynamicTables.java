package com.basicsdemo.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Achint\\Desktop\\Swagen\\BasicsDemo\\drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.moneycontrol.com/stocks/marketstats/indexcomp.php?optex=NSE&opttopic=indexcomp&index=9");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='tbldata14 bdrtpg']//tr/td[1]"));
		List<WebElement> Pricelist=driver.findElements(By.xpath("//*[@class='tbldata14 bdrtpg']//tr/td[3]"));
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase("cipla"))
			{
				System.out.println("Cipla is in row no. "+(i+1));
				System.out.println("Price of Cipla is "+Pricelist.get(i).getText());
				
			}
		}

	}

}

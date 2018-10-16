package com.basicsdemo.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Achint\\Desktop\\Swagen\\BasicsDemo\\drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21246/ind-vs-wi-1st-test-windies-tour-of-india-2018");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='innings_1']/div[1]/div/div[3]"));
		List<WebElement> newlist=driver.findElements(By.xpath("//*[@id='innings_1']/div[1]/div/div[2]"));
		int sum=0;
		for(int i=1;i<list.size()-2;i++)
		{
			String s=list.get(i).getText();
			int a= Integer.parseInt(s);
			sum=sum+a;
			
		}
		
			
			int b= Integer.parseInt(newlist.get(12).getText());
			System.out.println(sum+b);
		
		if((sum+b)==Integer.parseInt(newlist.get(13).getText()))
				{
			System.out.println("sum verified and found ok");
				}
		else
		{
			System.out.println("not verified");
				}
		
		
	}

}

package com.test;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) throws Exception 
	{
		
	WebDriver driver = new FirefoxDriver();
	FileInputStream fis=new FileInputStream("abc.properties");
	Properties p=new Properties();
	p.load(fis);
	String val=p.getProperty("url");
	driver.get(val);
	//driver.findElement(By.xpath("unameXpath"));
	//driver.findElement(By.xpath("unameXpath"));
	
	driver.manage().window().maximize();
	 
	 //blank values
	 WebElement we = driver.findElement(By.id("email"));
     
	 we.sendKeys("");
	 WebElement we1 = driver.findElement(By.id("password"));
	 we1.sendKeys("");
	 WebElement we11 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	 we11.click();
	 
	 //negative values
	 WebElement we2 = driver.findElement(By.id("email"));
	 we2.sendKeys("xyz@gmail.com");
	 WebElement we12 = driver.findElement(By.id("password"));
	 we12.sendKeys("123");
	 WebElement we112 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	 we112.click();
	 we2.clear();
	 we12.clear();
	 
	 //valid values
	 WebElement we3 = driver.findElement(By.id("email"));
	 we3.sendKeys("kiran@gmail.com");
	 WebElement we13 = driver.findElement(By.id("password"));
	 we13.sendKeys("123456");
	 WebElement we113 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	 we113.click();
	 
	
	}

}

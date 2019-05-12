package com.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropTest 
{
	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fis=new FileInputStream("abc.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String val=p.getProperty("url");
		System.out.println(val);
		 
		WebDriver wd=new FirefoxDriver();
		wd.get(val);
		wd.findElement(By.xpath("unameXpath"));
		
	}
	
}

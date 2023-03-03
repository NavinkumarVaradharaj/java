package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("wert");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		Thread.sleep(2000);
		TakesScreenshot ts = new ChromeDriver();
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Avadi\\workspace\\Selenium7PMEng\\screenshots\\scr1.png");
		
		//FileHandler.copy(source, destination);
		
		FileUtils.copyFile(source, destination);
		
	
	}

}

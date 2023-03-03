package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250);");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alert = driver.switchTo().alert();
		if(alert.getText().equals("Do you confirm action?")) {
			System.out.println("yes it's confirm alert");
		}
		else {
			System.out.println("Not an expected alert");
		}
		Thread.sleep(5000);
		alert.dismiss();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Navin");
		Thread.sleep(5000);
		alert.accept();
		
		
		
		
		
	}

}

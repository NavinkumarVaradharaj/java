package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//	js.executeScript("window.scrollBy(0,1000); ");
		
		WebElement laptop = driver.findElement(By.xpath("//img[@alt='Budget Laptops & Desktops under INR 40000; Mega Electronic Days']"));
		
	//	js.executeScript("arguments[0].scrollIntoView();", laptop);
		
		js.executeScript("arguments[0].click();", laptop);
		
		js.executeScript("document.getElementById('twotabsearchtextbox').value = 'Mobiles' ; ");
		
		
		
		
	}

}

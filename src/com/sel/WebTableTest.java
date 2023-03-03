package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		
		String text = driver.findElement(By.id("shopping")).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table")).getText();
		System.out.println(text1);
		
		String text2 = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tbody/tr[1]")).getText();
		System.out.println(text2);
		
		driver.findElement(By.id("second")).click();
		
		
	}

}

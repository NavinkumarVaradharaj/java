package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> findElements = driver.findElements(By.tagName("input"));
		System.out.println(findElements);
		for(int i =0;i<findElements.size();i++) {
			System.out.println(findElements.get(i).getAttribute("class"));
		}
		
	}

}

package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingTest {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text() = 'Mobiles']"));
		
		Actions a = new Actions(driver);
		a.contextClick(mobiles).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		String amazon = driver.getWindowHandle();
		System.out.println(amazon);
		
		Set<String> all_tabs = driver.getWindowHandles();
		for(String tab : all_tabs) {
			System.out.println(tab);
			if(!tab.equals(amazon)) {			//!=
				driver.switchTo().window(tab);
				driver.close();
			}
		}
		
	//	driver.findElement(By.xpath("//span[contains(text() , 'Laptops & Accessories')]")).click();
		
		
		
		
		
	}

}

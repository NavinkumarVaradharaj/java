package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement miniTV = driver.findElement(By.xpath("//a[text() ='Amazon miniTV']"));
		Actions a = new Actions(driver);
//		a.click(miniTV).build().perform();//click 
		
//		a.contextClick(miniTV).build().perform();
		
		WebElement signIn = driver.findElement(By.xpath("//span[text() = 'Hello, sign in']"));
		
		WebElement orders = driver.findElement(By.xpath("//span[text() = 'Your Orders']"));
		
		a.moveToElement(signIn).build().perform();
		Thread.sleep(3000);
		
		a.click(orders).build().perform();
		
		driver.navigate().to("https://demoqa.com/droppable/");
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//div[text() = 'Drag me']"));
		Thread.sleep(3000);
		WebElement dest = driver.findElement(By.xpath("(//p[text() = 'Drop here'])[1]"));
		Thread.sleep(3000);
		a.dragAndDrop(source, dest).build().perform();
		
		
		
	}

}

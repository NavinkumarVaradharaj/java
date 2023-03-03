package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[3]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//img[@alt='Footwear']//ancestor::div[@class='a-section a-spacing-none quadrant-container quadrant-container-1']//preceding-sibling::div[@class='a-section a-spacing-none quadrant-container quadrant-container-0']/a"));
		
		
//		WebElement frame_element = driver.findElement(By.xpath("//iframe[@id='ape_Gateway_right-2_desktop_iframe']"));
//		
//		driver.switchTo().frame(frame_element);
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/img19/AMS/Houseads/Laptops-Sept2019._CB436595915_.jpg']")).click();
//
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("(//img[@alt='Zero payment gateway charges'])[2]")).click();
	}

}

package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		WebElement frame_element = driver.findElement(By.xpath("//iframe[@id='ape_Gateway_right-2_desktop_iframe']"));
		Thread.sleep(5000);
		driver.switchTo().frame(frame_element);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/img19/AMS/Houseads/Laptops-Sept2019._CB436595915_.jpg']")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(5000);
//		WebElement parent_text = driver.findElement(By.xpath("//body[text() = 'Parent frame']"));
//		System.out.println(parent_text);
		//driver.switchTo().frame(0);
		
//		WebElement child_frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
//		
//		driver.switchTo().frame(child_frame);
//		
		//driver.switchTo().frame("frame2");
//		Thread.sleep(5000);
//		WebElement get_frameText = driver.findElement(By.id("sampleHeading"));
//		System.out.println(get_frameText.getTagName());
		
	}

}

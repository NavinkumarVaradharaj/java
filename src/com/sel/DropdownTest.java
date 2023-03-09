package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search_select = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s = new Select(search_select);
	//	s.selectByValue("search-alias=hpc");
		
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Computers & Accessories");
		driver.close();
		
	}

}

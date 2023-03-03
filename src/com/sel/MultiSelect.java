package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Avadi\\workspace\\Selenium7PMEng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement multi_cars = driver.findElement(By.xpath("//select[@name='cars']"));
	
		Select s = new Select(multi_cars);
		
		System.out.println(s.isMultiple());
		
		s.selectByValue("opel");
		
		s.selectByVisibleText("Volvo");
		
		s.selectByIndex(1);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		List<WebElement> options = s.getOptions();
		for (WebElement all_cars : options) {
			System.out.println(all_cars.getText());
		}
		
		s.deselectByIndex(2);
		System.out.println("==================");
		s.deselectAll();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected_cars : allSelectedOptions) {
			System.out.println(selected_cars.getText());
		}
	
	
	}

}

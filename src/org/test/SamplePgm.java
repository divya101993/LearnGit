package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePgm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Demoselenium\\libraryfiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtBox = driver.findElement(By.id("email"));
		txtBox.sendKeys("divya");
		WebElement passBox = driver.findElement(By.id("pass"));
		passBox.sendKeys("divya1234");
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}

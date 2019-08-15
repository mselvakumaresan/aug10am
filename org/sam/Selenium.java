package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\anand\\eclipse-workspace\\org.sam\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	WebElement mail=driver.findElement(By.id("email"));
	mail.sendKeys("Selva");
	WebElement word = driver.findElement(By.name("pass"));
	word.sendKeys("kumaran");
		}
}

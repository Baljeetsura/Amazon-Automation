package Firstpage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
	
		
		System.setProperty(
				"webdriver.chrome.driver", "C://Chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    //driver.manage().window().minimize();
    //driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
    //driver.findElement(By.xpath("(//img[@class=\"GridPresets-module__gridPresetImage_1FnIo-Do5TDxU-XJMp1M77\"])[4]")).click();
    driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[1]")).sendKeys("bat");
    driver.findElement(By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]")).click();
    
    
	}

}


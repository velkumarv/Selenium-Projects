package Seleniumassess;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class RedBus {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.redbus.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("chennai");
		Thread.sleep(5000);
		
		driver.findElement(By.id("dest")).sendKeys("bangalore");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		
		WebElement findElement = driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
	    j.executeScript("arguments[0].click();", findElement);
		Thread.sleep(5000);
		
		String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(text2);
		Thread.sleep(5000);
		
		WebElement findElement2 = driver.findElement(By.xpath("(//div[text()='View Seats'])[2]"));
		JavascriptExecutor s=(JavascriptExecutor)driver;
		s.executeScript("arguments[0].click();", findElement2);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		Thread.sleep(3000);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination=new  File("./snap/img.png");
		FileUtils.copyFile(screenshotAs, destination);
		Thread.sleep(3000);
		
		driver.close();
		
	}

	

}

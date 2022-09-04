package Seleniumassess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://login.salesforce.com/");

driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
driver.findElement(By.id("password")).sendKeys("Password#123");
driver.findElement(By.id("Login")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='slds-button']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//p[@class='slds-truncate'])[6]")).click();
Thread.sleep(5000);
WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
driver.executeScript("arguments[0].click();", findElement2);
Thread.sleep(5000);
driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
Thread.sleep(5000);
WebElement findElement3 = driver.findElement(By.xpath("//input[@name='Name']"));
Thread.sleep(3000);
driver.executeScript("arguments[0].value='Salesforce Automation by vel';", findElement3);
String text = driver.findElement(By.xpath("//label[text()='Amount']")).getText();
System.out.println(text);
Thread.sleep(5000);
WebElement findElement4 = driver.findElement(By.xpath("//input[@name='CloseDate']"));
driver.executeScript("arguments[0].click();", findElement4);
WebElement findElement = driver.findElement(By.xpath("(//span[text()='4'])[1]"));
driver.executeScript("arguments[0].click();", findElement);
driver.findElement(By.xpath("(//span[text()='--None--'])[1]")).click();
Thread.sleep(3000);
//driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[1]")).click();

WebElement findElement5 = driver.findElement(By.xpath("//label[text()='Stage']//following::span[text()='Needs Analysis']"));
driver.executeScript("arguments[0].click();", findElement5);
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Save']")).click();









//WebElement element = driver.findElement(By.id("aaa"));
////JavascriptExecutor exe=(JavascriptExecutor) driver;
////exe.executeScript("aruguments[0].click();", element);
//
//driver.executeScript("arguments[0].click();", element);
//
//driver.findElement(By.id(null))

	}

}

package Seleniumassess;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoomcars {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.zoomcar.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
Thread.sleep(5000);
driver.findElement(By.xpath("(//div[contains(@class,'multiselect')])[1]")).click();
driver.findElement(By.xpath("//span[text()='India']")).click();
driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).click();
driver.findElement(By.xpath("//span[text()='Chennai']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(text(),'Airport')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(text(),'Current Location')]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//span[contains(@class,'field-date start-time')]")).click();
Thread.sleep(5000);
String text = driver.findElement(By.xpath("(//table[@class='table'])[1]//td[@class='start']")).getText();
//System.out.println(text);
int parseInt = Integer.parseInt(text);
int a=2;
int c=parseInt+a;
//System.out.println(c);
Thread.sleep(3000);
driver.findElement(By.xpath("(//table[@class='table'])[1]//td[contains(text(),'"+c+"')]")).click();
driver.findElement(By.xpath("(//table[@class='table'])[1]//td[contains(text(),'"+c+"')]")).click();

Thread.sleep(3000);
String text2 = driver.findElement(By.xpath("(//table[@class='table'])[1]//td[@class='start end selected']")).getText();
int parseInt2 = Integer.parseInt(text2);
int d=4;
int f=parseInt2+d;
//System.out.println(f);
Thread.sleep(3000);
driver.findElement(By.xpath("(//table[@class='table'])[1]//td[contains(text(),'"+f+"')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();
		
System.out.println("Price:");
List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(@class,'price-bar')]"));

List<Integer> priceList=new ArrayList<Integer>();
for (int i = 1; i < findElements.size(); i++) {
	
	String text3 = driver.findElement(By.xpath("(//div[contains(@class,'price-bar')])["+i+"]")).getText();
	String price = text3.replaceAll("\\D","");
	//System.out.println(i+" "+price);
//	int parseInt3 = Integer.parseInt(price);
//	System.out.println(Math.min(parseInt3, i));
	int parseInt3 = Integer.parseInt(price);
	
	priceList.add(parseInt3);
}

Integer min = Collections.min(priceList);
System.out.println("Min"+min);

	}
}

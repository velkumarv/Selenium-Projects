package Seleniumassess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[3]")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'results')]"));
		System.out.println(findElement.getText());
		
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i)[3]")).click();
//		Actions obj=new Actions(driver);
//		obj.moveToElement(findElement);
//		obj.click().build().perform();
//		
//		JavascriptExecutor exe=(JavascriptExecutor) driver;
//		exe.executeScript("ScrollOntoElement.Click()",findElement);
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i)[4]")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'results ')]")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("Name:"+text2);
		String text3 = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")).getText();
		System.out.print("Price:"+text3);
		
		
		
		
	}

}

package Seleniumassess;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement findElement = driver.findElement(By.xpath("(//span[contains(text(),' Fashion')])[1]"));
		Actions builder =new Actions(driver);
		builder.moveToElement(findElement).clickAndHold().perform();
		driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]")).click();
		
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		System.out.println("No of shoes: "+findElements.size());
		
		System.out.println("Page title: "+driver.getTitle());
	}

}

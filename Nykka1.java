package Seleniumassess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.nykaa.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Thread.sleep(3000);
WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
Actions builder = new Actions(driver);
builder.moveToElement(findElement).clickAndHold().perform();

driver.findElement(By.xpath("//a[contains(text(),'Paris')]")).click();
	
System.out.println(driver.getTitle());

driver.close();
		
		
	}

}

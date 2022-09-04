package Seleniumassess;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka2 {

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
			
		System.out.println("Titlename: "+driver.getTitle());
		
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Hair')]")).click();	
		driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();
		boolean displayed = driver.findElement(By.xpath("//div[contains(@class,'css-rtde4j')]")).isDisplayed();
		System.out.println("shamboo visible in filter: "+displayed);
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(childwindow.get(1));
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select dd=new Select(findElement2);
		dd.selectByIndex(1);
		
		WebElement findElement3 = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]"));
		System.out.print(findElement3.getText());
		System.out.println();
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
		
		WebElement findElement4 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(findElement4);
		
		String text = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
		System.out.println("Grandtotal: "+text);
				
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		String text2 = driver.findElement(By.xpath("(//div[@class='value'])[2]")).getText();
		
		if (text.equals(text2)) {
			System.out.println("value is equal");
			
	
		}
		driver.quit();
	}

}

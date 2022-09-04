package Seleniumassess;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mgr-chennai-ctr-MAS");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		int size = findElements.size();
		System.out.println("No of trains"+size);
		
		for (int i = 1; i <=size; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[2]")).getText();
			System.out.println(i+" "+text);
		}
	
	
	
	}

}
